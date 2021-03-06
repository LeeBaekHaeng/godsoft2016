package godsoft.com.cmm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.com.cmm.service.EgovFileMngService;
import egovframework.com.cmm.service.EgovFileMngUtil;
import egovframework.com.sym.mnu.mpm.service.MenuManage;
import egovframework.com.sym.mnu.mpm.service.MenuManageVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import godsoft.com.cmm.service.CmmService;
import godsoft.com.cmm.service.CmmVO;
import godsoft.com.crud.service.CmmnDetailCodeService;

@Service
public class CmmServiceImpl extends EgovAbstractServiceImpl implements
		CmmService {

	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;

	@Resource(name = "egovMessageSource")
	protected EgovMessageSource egovMessageSource;

	@Autowired
	// @Resource(name = "EgovFileMngUtil")
	private EgovFileMngUtil egovFileMngUtil;

	@Autowired
	// @Resource(name = "EgovFileMngService")
	private EgovFileMngService egovFileMngService;

	@Autowired
	private GodPaginationInfoServiceImpl godPaginationInfoServiceImpl;

	@Autowired
	private GodMultipartServiceImpl godMultipartServiceImpl;

	@Autowired
	private GodMenuServiceImpl godMenuServiceImpl;

	@Autowired
	private CmmnDetailCodeService cmmnDetailCodeService;

	@Override
	public String mergeFileInfs(String atchFileId, String KeyStr,
			String storePath, MultipartHttpServletRequest request)
			throws Exception {
		return godMultipartServiceImpl.mergeFileInfs(atchFileId, KeyStr,
				storePath, request);
	}

	@Override
	public PaginationInfo selectListPrefix(ComDefaultVO vo) {
		return godPaginationInfoServiceImpl.selectListPrefix(vo);
	}

	@Override
	public PaginationInfo selectListPrefix(Map<String, Object> vo) {
		return godPaginationInfoServiceImpl.selectListPrefix(vo);
	}

	@Override
	public List<EgovMap> selectMenuList(MenuManage vo) {
		return godMenuServiceImpl.selectList(vo);
	}

	@Override
	public List<EgovMap> selectMenuList(MenuManageVO vo) {
		return godMenuServiceImpl.selectList(vo);
	}

	@Override
	public List<EgovMap> selectMenuList(Map<String, Object> vo) {
		return godMenuServiceImpl.selectList(vo);
	}

	@Override
	public void selectMenuList(Map<String, Object> vo, ModelMap model) {
		vo.put("menuNo", 0);
		vo.put("authorCode", "ROLE_USER");

		model.addAttribute("items", godMenuServiceImpl.selectList(vo));
	}

	@Override
	public void mergeFileInfs(CmmVO vo, ModelMap model,
			MultipartHttpServletRequest request) {
		String atchFileId = vo.getAtchFileId();
		String keyStr = "GOD_";
		String storePath = "Globals.fileStorePath.god";

		if ("GOD".equals(vo.getKeyStr())) {
			keyStr = "GOD_";
			storePath = "Globals.fileStorePath.god";
		} else {
			keyStr = "";
			storePath = "";
		}

		try {
			atchFileId = mergeFileInfs(atchFileId, keyStr, storePath, request);
		} catch (Exception e) {
			egovLogger.error(e.getMessage());
		}

		model.addAttribute("atchFileId", atchFileId);
	}

	@Override
	public void code(CmmVO vo, ModelMap model) {
		CmmnDetailCode cmmnDetailCode = new CmmnDetailCode();

		// vo.setCodeId("test");

		// ModelMap model = new ModelMap();

		cmmnDetailCodeService.code(cmmnDetailCode, model);
	}

}
