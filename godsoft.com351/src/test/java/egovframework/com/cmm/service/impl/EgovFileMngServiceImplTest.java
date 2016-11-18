package egovframework.com.cmm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;

import egovframework.com.cmm.service.EgovFileMngService;
import egovframework.com.cmm.service.FileVO;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/test-dao-context.xml" })
public class EgovFileMngServiceImplTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	// @Resource(name = "EgovFileMngService")
	private EgovFileMngService egovFileMngService;

	@Test
	public void test() {
		FileVO fvo = new FileVO();
		// fvo.setAtchFileId("FILE_000000000000730");
		fvo.setAtchFileId("FILE_000000000000692");

		Gson gson = new Gson();

		List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();

		try {
			List<FileVO> fileInfs = egovFileMngService.selectFileInfs(fvo);

			egovLogger.debug("fileInfs=" + fileInfs);

			for (FileVO fileInf : fileInfs) {
				egovLogger.debug("fileInf=" + fileInf);
				egovLogger.debug("getAtchFileId=" + fileInf.getAtchFileId());
				egovLogger.debug("getFileSn=" + fileInf.getFileSn());
				egovLogger.debug("getFileStreCours="
						+ fileInf.getFileStreCours());
				egovLogger.debug("getStreFileNm=" + fileInf.getStreFileNm());
				egovLogger
						.debug("getOrignlFileNm=" + fileInf.getOrignlFileNm());
				egovLogger.debug("getFileExtsn=" + fileInf.getFileExtsn());
				egovLogger.debug("getFileCn=" + fileInf.getFileCn());
				egovLogger.debug("getFileMg=" + fileInf.getFileMg());

				Map<String, Object> item = new HashMap<String, Object>();
				item.put(
						"downloadUrl",
						"/cmm/fms/FileDown.do?atchFileId="
								+ fileInf.getAtchFileId() + "&fileSn="
								+ fileInf.getFileSn());
				item.put("fileSize", fileInf.getFileMg());
				item.put("printFileName", fileInf.getOrignlFileNm());
				item.put("fileID", fileInf.getFileSn());

				items.add(item);

				egovLogger.debug(gson.toJson(item));
			}
		} catch (Exception e) {
			egovLogger.error(e.getMessage());
		}

		egovLogger.debug(gson.toJson(items));
	}

}
