package god.codegen.crud.sys.alltabcomments.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface AllTabCommentsService {

	List<EgovMap> selectList(AllTabCommentsVO vo) throws Exception;

	void createWorkbook(AllTabCommentsVO vo) throws Exception;

}
