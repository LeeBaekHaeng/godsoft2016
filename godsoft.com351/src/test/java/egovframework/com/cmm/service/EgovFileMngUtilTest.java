package egovframework.com.cmm.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.mock.web.MockMultipartHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;

import egovframework.rte.fdl.string.EgovDateUtil;

//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(locations = {
//		"classpath:egovframework/spring/com/**/context-*.xml",
//		"classpath:godsoft/spring/com/**/context-*.xml",
//		"file:src/main/webapp/WEB-INF/config/egovframework/springmvc/egov-com-servlet.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml" })
public class EgovFileMngUtilTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	// @Resource(name = "EgovFileMngUtil")
	private EgovFileMngUtil egovFileMngUtil;

	@Autowired
	// @Resource(name = "EgovFileMngService")
	private EgovFileMngService egovFileMngService;

	@Test
	public void test() throws Exception {
		// egovLogger.debug("fileStorePath="
		// + EgovProperties.getProperty("Globals.fileStorePath"));
		// egovLogger.debug("fileStorePathA1="
		// + EgovProperties.getProperty("Globals.fileStorePath.A1"));

		// parseFileInf();
		// insertFileInfs();
		// updateFileInfs();
		mergeFileInfs();
	}

	public void parseFileInf() throws Exception {
		MockMultipartHttpServletRequest request = new MockMultipartHttpServletRequest();
		request.addFile(getFile(1));
		request.addFile(getFile(2));

		Map<String, MultipartFile> files = request.getFileMap();

		egovLogger.debug("files=" + files);

		String KeyStr = "GOD_";

		int fileKeyParam = 0;

		String atchFileId = null;

		String storePath = "";
		storePath = "Globals.fileStorePath.A1";

		List<FileVO> fvoList = egovFileMngUtil.parseFileInf(files, KeyStr,
				fileKeyParam, atchFileId, storePath);

		fvoList(fvoList);
	}

	private MockMultipartFile getFile(Integer fileSn) {
		String name = "file" + fileSn;

		String originalFilename = "첨부파일 테스트" + fileSn + " "
				+ EgovDateUtil.toString(new Date(), "", null) + ".txt";

		String contentType = "text/plain";

		byte[] content = originalFilename.getBytes();

		MockMultipartFile file = new MockMultipartFile(name, originalFilename,
				contentType, content);

		egovLogger.debug("file=" + file);
		egovLogger.debug("getOriginalFilename=" + file.getOriginalFilename());

		return file;
	}

	private void fvoList(List<FileVO> fvoList) {
		egovLogger.debug("fvoList=" + fvoList);

		for (FileVO fvo : fvoList) {
			egovLogger.debug("fvo=" + fvo);
			egovLogger.debug("getAtchFileId=" + fvo.getAtchFileId());
			egovLogger.debug("getFileSn=" + fvo.getFileSn());
			egovLogger.debug("getFileStreCours=" + fvo.getFileStreCours());
			egovLogger.debug("getStreFileNm=" + fvo.getStreFileNm());
			egovLogger.debug("getOrignlFileNm=" + fvo.getOrignlFileNm());
			egovLogger.debug("getFileExtsn=" + fvo.getFileExtsn());
			egovLogger.debug("getFileCn=" + fvo.getFileCn());
			egovLogger.debug("getFileMg=" + fvo.getFileMg());
		}
	}

	public void insertFileInfs() throws Exception {
		MockMultipartHttpServletRequest request = new MockMultipartHttpServletRequest();
		request.addFile(getFile(1));
		request.addFile(getFile(2));

		Map<String, MultipartFile> files = request.getFileMap();

		egovLogger.debug("files=" + files);

		String KeyStr = "GOD_";

		int fileKeyParam = 0;

		String atchFileId = null;

		String storePath = "";
		storePath = "Globals.fileStorePath.A1";

		List<FileVO> fvoList = egovFileMngUtil.parseFileInf(files, KeyStr,
				fileKeyParam, atchFileId, storePath);

		fvoList(fvoList);

		egovLogger.debug("atchFileId1=" + atchFileId);
		atchFileId = egovFileMngService.insertFileInfs(fvoList);
		egovLogger.debug("atchFileId2=" + atchFileId);
	}

	public void updateFileInfs() throws Exception {
		String atchFileId = "FILE_000000000000201";

		MockMultipartHttpServletRequest request = new MockMultipartHttpServletRequest();
		request.addFile(getFile(1));
		request.addFile(getFile(2));

		Map<String, MultipartFile> files = request.getFileMap();

		egovLogger.debug("files=" + files);

		String KeyStr = "GOD_";

		FileVO fvo = new FileVO();
		fvo.setAtchFileId(atchFileId);
		int fileKeyParam = egovFileMngService.getMaxFileSN(fvo);

		// String atchFileId = null;

		String storePath = "";
		storePath = "Globals.fileStorePath.A1";

		List<FileVO> fvoList = egovFileMngUtil.parseFileInf(files, KeyStr,
				fileKeyParam, atchFileId, storePath);

		fvoList(fvoList);

		egovLogger.debug("atchFileId1=" + atchFileId);
		egovFileMngService.updateFileInfs(fvoList);
		egovLogger.debug("atchFileId2=" + atchFileId);
	}

	public void mergeFileInfs() throws Exception {
		String atchFileId = "FILE_000000000000221";
		// atchFileId = "";

		MockMultipartHttpServletRequest request = new MockMultipartHttpServletRequest();
		request.addFile(getFile(1));
		request.addFile(getFile(2));

		Map<String, MultipartFile> files = request.getFileMap();

		egovLogger.debug("files=" + files);

		String KeyStr = "GOD_";

		int fileKeyParam = 0;

		if (StringUtils.isEmpty(atchFileId)) {
			fileKeyParam = 0;
		} else {
			FileVO fvo = new FileVO();
			fvo.setAtchFileId(atchFileId);
			fileKeyParam = egovFileMngService.getMaxFileSN(fvo);
		}

		// String atchFileId = null;

		String storePath = "";
		storePath = "Globals.fileStorePath.A1";

		List<FileVO> fvoList = egovFileMngUtil.parseFileInf(files, KeyStr,
				fileKeyParam, atchFileId, storePath);

		fvoList(fvoList);

		egovLogger.debug("atchFileId1=" + atchFileId);

		if (StringUtils.isEmpty(atchFileId)) {
			atchFileId = egovFileMngService.insertFileInfs(fvoList);
		} else {
			egovFileMngService.updateFileInfs(fvoList);
		}

		egovLogger.debug("atchFileId2=" + atchFileId);

	}

}
