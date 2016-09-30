package godsoft.com.cmm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.util.EgovMap;

@Repository
public class GodsoftAdministCodeDAO extends
		GodGenericDAO<Map<String, Object>, EgovMap, EgovMap> {

	@Override
	public void postConstruct() {
		super.postConstruct();

		queryId.put("selectList", "AdministCodeDAO.selectSidoList");
	}

	@Override
	public List<EgovMap> selectList(Map<String, Object> vo) throws Exception {
		return super.selectList(vo);
	}

}
