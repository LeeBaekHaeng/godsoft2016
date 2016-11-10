package godsoft.com.cmm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.com.sym.mnu.mpm.service.MenuManage;
import egovframework.com.sym.mnu.mpm.service.MenuManageVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Repository
public class GodMenuDAO extends EgovComAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(MenuManage vo) {
		return (List<EgovMap>) list("GodMenuDAO.selectList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(MenuManageVO vo) {
		return (List<EgovMap>) list("GodMenuDAO.selectList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(Map<String, Object> vo) {
		return (List<EgovMap>) list("GodMenuDAO.selectList", vo);
	}

}
