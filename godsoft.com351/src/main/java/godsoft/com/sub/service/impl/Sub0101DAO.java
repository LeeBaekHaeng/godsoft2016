package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.cmm.service.impl.GodGenericDAO;
import godsoft.com.sub.service.Sub0101VO;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Sub0101DAO extends
		GodGenericDAO<Sub0101VO, Sub0101VO, EgovMap> {

	@Override
	public void postConstruct() {
		super.postConstruct();

		queryId.put("selectList", "Sub0101DAO.selectList");
	}

	@Override
	public List<EgovMap> selectList(Sub0101VO vo) throws Exception {
		return super.selectList(vo);
	}

}
