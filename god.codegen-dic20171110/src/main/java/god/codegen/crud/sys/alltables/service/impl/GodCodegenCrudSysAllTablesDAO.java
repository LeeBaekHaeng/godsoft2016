package god.codegen.crud.sys.alltables.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.codegen.crud.sys.alltables.service.AllTablesVO;

@Repository
public class GodCodegenCrudSysAllTablesDAO extends EgovComAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(AllTablesVO vo) throws Exception {
		return (List<EgovMap>) list("GodCodegenCrudSysAllTablesDAO.selectList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectList2(AllTablesVO vo) throws Exception {
		return (List<Map<String, Object>>) list("GodCodegenCrudSysAllTablesDAO.selectList", vo);
	}

}
