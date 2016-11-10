package godsoft.com.cmm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.com.sym.mnu.mpm.service.MenuManage;
import egovframework.com.sym.mnu.mpm.service.MenuManageVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * 메뉴 조회(멀티건)
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 * 
 */
@Service
public class GodMenuServiceImpl extends EgovAbstractServiceImpl {

	@Autowired
	private GodMenuDAO godMenuDAO;

	@Autowired
	// @Resource(name = "propertiesService")
	protected EgovPropertyService egovPropertyService;

	public List<EgovMap> selectList(MenuManage vo) {
		return godMenuDAO.selectList(vo);
	}

	public List<EgovMap> selectList(MenuManageVO vo) {
		return godMenuDAO.selectList(vo);
	}

	public List<EgovMap> selectList(Map<String, Object> vo) {
		return godMenuDAO.selectList(vo);
	}

}
