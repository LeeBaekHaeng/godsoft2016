package god.codegen.crud.sys.alltabcols.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface AllTabColsService {

	List<EgovMap> selectList(AllTabColsVO vo) throws Exception;

	void createWorkbook(AllTabColsVO vo) throws Exception;

}
