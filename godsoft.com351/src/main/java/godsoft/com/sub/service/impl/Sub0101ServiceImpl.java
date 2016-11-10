package godsoft.com.sub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import godsoft.com.cmm.service.impl.CmmServiceImpl;
import godsoft.com.sub.service.Sub0101Service;
import godsoft.com.sub.service.Sub0101VO;

@Service
public class Sub0101ServiceImpl extends EgovAbstractServiceImpl implements
		Sub0101Service {

	@Autowired
	private CmmServiceImpl godCmmServiceImpl;

	@Override
	public void selectList(Sub0101VO vo, ModelMap model) throws Exception {
	}

	@Override
	public void insertFormMultipart(Sub0101VO vo, ModelMap model)
			throws Exception {
	}

	@Override
	public void insertMultipart(Sub0101VO vo, ModelMap model,
			MultipartHttpServletRequest request) throws Exception {
		String atchFileId = vo.getFileVO().getAtchFileId();
		String KeyStr = "GOD_";
		String storePath = "Globals.fileStorePath.A1";

		atchFileId = godCmmServiceImpl.mergeFileInfs(atchFileId, KeyStr,
				storePath, request);

		egovLogger.debug("atchFileId=" + atchFileId);
	}

}
