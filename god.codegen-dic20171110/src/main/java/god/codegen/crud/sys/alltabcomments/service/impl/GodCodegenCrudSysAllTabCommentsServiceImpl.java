package god.codegen.crud.sys.alltabcomments.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.codegen.crud.sys.alltabcomments.service.AllTabCommentsService;
import god.codegen.crud.sys.alltabcomments.service.AllTabCommentsVO;

@Service
public class GodCodegenCrudSysAllTabCommentsServiceImpl extends EgovAbstractServiceImpl
		implements AllTabCommentsService {

	@Autowired
	private GodCodegenCrudSysAllTabCommentsDAO dao;

	@Override
	public List<EgovMap> selectList(AllTabCommentsVO vo) throws Exception {
		return dao.selectList(vo);
	}

}
