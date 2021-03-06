package godsoft.com.cmm.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.com.cmm.service.EgovFileMngService;
import egovframework.com.cmm.service.EgovFileMngUtil;
import egovframework.com.cmm.service.FileVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * 첨부파일 업로드
 * 
 * @author LeeBaekHaeng
 *
 */
@Service
public class GodMultipartServiceImpl extends EgovAbstractServiceImpl {

	@Autowired
	// @Resource(name = "EgovFileMngUtil")
	private EgovFileMngUtil egovFileMngUtil;

	@Autowired
	// @Resource(name = "EgovFileMngService")
	private EgovFileMngService egovFileMngService;

	public String mergeFileInfs(String atchFileId, String KeyStr,
			String storePath, MultipartHttpServletRequest request)
			throws Exception {
		// String atchFileId = "FILE_000000000000221";
		// atchFileId = "";

		Map<String, MultipartFile> files = request.getFileMap();

		egovLogger.debug("files=" + files);
		egovLogger.debug("size=" + files.size());

		// String KeyStr = "GOD_";

		int fileKeyParam = 0;

		if (StringUtils.isEmpty(atchFileId)) {
			fileKeyParam = 0;
		} else {
			FileVO fvo = new FileVO();
			fvo.setAtchFileId(atchFileId);
			fileKeyParam = egovFileMngService.getMaxFileSN(fvo);
		}

		// String atchFileId = null;

		// String storePath = "";
		// storePath = "Globals.fileStorePath.A1";

		List<FileVO> fvoList = egovFileMngUtil.parseFileInf(files, KeyStr,
				fileKeyParam, atchFileId, storePath);

		egovLogger.debug("atchFileId1=" + atchFileId);

		if (StringUtils.isEmpty(atchFileId)) {
			atchFileId = egovFileMngService.insertFileInfs(fvoList);
		} else {
			egovFileMngService.updateFileInfs(fvoList);
		}

		egovLogger.debug("atchFileId2=" + atchFileId);

		return atchFileId;
	}

}
