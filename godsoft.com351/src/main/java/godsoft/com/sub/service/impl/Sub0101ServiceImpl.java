package godsoft.com.sub.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
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
	public void selectList(Sub0101VO vo, ModelMap model) {
		// model.addAttribute("godScheme", getScheme());
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

	@Override
	public String getScheme() {
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes();

		HttpServletRequest request = servletRequestAttributes.getRequest();

		return request.getScheme();
	}

}
