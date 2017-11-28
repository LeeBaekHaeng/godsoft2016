package god.codegen.crud.sys.allcolcomments.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.codegen.crud.sys.allcolcomments.service.AllColCommentsVO;

@Repository
public class GodCodegenCrudSysAllColCommentsDAO extends EgovComAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(AllColCommentsVO vo) throws Exception {
		return (List<EgovMap>) list("GodCodegenCrudSysAllColCommentsDAO.selectList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectList2(AllColCommentsVO vo) throws Exception {
		return (List<Map<String, Object>>) list("GodCodegenCrudSysAllColCommentsDAO.selectList", vo);
	}

}
