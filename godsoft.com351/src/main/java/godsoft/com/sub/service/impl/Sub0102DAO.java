package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.cmm.service.impl.GodEgovAbstractDAO;
import godsoft.com.sub.service.Sub0102VO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class Sub0102DAO extends GodEgovAbstractDAO<Sub0102VO> {

	@Override
	public void postConstruct() {
		super.postConstruct();

		queryId.put("selectListMap", "Sub0102DAO.selectListMap");
		queryId.put("selectListType", "Sub0102DAO.selectListType");
	}

	@Override
	public List<EgovMap> selectListMap(Sub0102VO vo) throws Exception {
		return super.selectListMap(vo);
		// return (List<EgovMap>) list(queryId.get("selectListMap"), vo);
	}

	@Override
	public List<Sub0102VO> selectListType(Sub0102VO vo) throws Exception {
		return super.selectListType(vo);
	}

	@Override
	public List<EgovMap> selectListMapForMap(Map<String, Object> vo)
			throws Exception {
		return super.selectListMapForMap(vo);
	}

}
