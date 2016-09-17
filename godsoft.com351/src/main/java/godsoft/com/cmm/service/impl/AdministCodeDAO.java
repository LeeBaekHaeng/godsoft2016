package godsoft.com.cmm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Repository
public class AdministCodeDAO extends EgovComAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(Map<String, Object> vo) throws Exception {
		return (List<EgovMap>) list("AdministCodeDAO.selectList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectSidoList(Map<String, Object> vo)
			throws Exception {
		return (List<EgovMap>) list("AdministCodeDAO.selectSidoList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectSggList(Map<String, Object> vo) throws Exception {
		return (List<EgovMap>) list("AdministCodeDAO.selectSggList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectUmdList(Map<String, Object> vo) throws Exception {
		return (List<EgovMap>) list("AdministCodeDAO.selectUmdList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectRiList(Map<String, Object> vo) throws Exception {
		return (List<EgovMap>) list("AdministCodeDAO.selectRiList", vo);
	}

}
