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

}
