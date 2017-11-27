package god.codegen.crud.sys.alltabcols.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.codegen.crud.sys.alltabcols.service.AllTabColsVO;

@Repository
public class GodCodegenCrudSysAllTabColsDAO extends EgovComAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(AllTabColsVO vo) throws Exception {
		return (List<EgovMap>) list("GodCodegenCrudSysAllTabColsDAO.selectList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectList2(AllTabColsVO vo) throws Exception {
		return (List<Map<String, Object>>) list("GodCodegenCrudSysAllTabColsDAO.selectList", vo);
	}

}
