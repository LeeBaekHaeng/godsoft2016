package godsoft.com.cmm.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.sym.mnu.mpm.service.MenuManage;
import egovframework.com.sym.mnu.mpm.service.MenuManageVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

public interface CmmService {

	String mergeFileInfs(String atchFileId, String KeyStr, String storePath,
			MultipartHttpServletRequest request) throws Exception;

	PaginationInfo selectListPrefix(ComDefaultVO vo);

	PaginationInfo selectListPrefix(Map<String, Object> vo);

	List<EgovMap> selectMenuList(MenuManage vo);

	List<EgovMap> selectMenuList(MenuManageVO vo);

	List<EgovMap> selectMenuList(Map<String, Object> vo);

	void selectMenuList(Map<String, Object> vo, ModelMap model);

	void mergeFileInfs(CmmVO vo, ModelMap model,
			MultipartHttpServletRequest request);

	void code(CmmVO vo, ModelMap model);

}
