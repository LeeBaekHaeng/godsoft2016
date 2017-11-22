package god.codegen.crud.sys.alltabcomments.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.codegen.crud.sys.alltabcomments.service.AllTabCommentsVO;

@Repository
public class GodCodegenCrudSysAllTabCommentsDAO extends EgovComAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(AllTabCommentsVO vo) throws Exception {
		return (List<EgovMap>) list("GodCodegenCrudSysAllTabCommentsDAO.selectList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectList2(AllTabCommentsVO vo) throws Exception {
		return (List<Map<String, Object>>) list("GodCodegenCrudSysAllTabCommentsDAO.selectList", vo);
	}

}
