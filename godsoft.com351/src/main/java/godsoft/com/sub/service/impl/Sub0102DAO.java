package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.cmm.service.impl.GodEgovAbstractDAO;
import godsoft.com.sub.service.Sub0102VO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 서브0102 DAO
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@Repository
public class Sub0102DAO extends GodEgovAbstractDAO<Sub0102VO, EgovMap> {

	@Override
	public void postConstruct() {
		super.postConstruct();

		queryId.put("selectKey", "Sub0102DAO.selectKey");
		queryId.put("insert", "Sub0102DAO.insert");
		queryId.put("selectListMap", "Sub0102DAO.selectListMap");

		// 추가
		queryId.put("selectListMap", "Sub0102DAO.selectListMap");
		queryId.put("selectListType", "Sub0102DAO.selectListType");
		queryId.put("selectListMapForMap", "Sub0102DAO.selectListMapForMap");
	}

	@Override
	public Sub0102VO selectKey(Sub0102VO vo) throws Exception {
		return super.selectKey(vo);
	}

	/**
	 * 서브0102 등록
	 */
	@Override
	public Object insert(Sub0102VO vo) throws Exception {
		return super.insert(vo);
	}

	public Object insert2(Sub0102VO vo) throws Exception {
		return insert("Sub0102DAO.insert2", vo);
	}

	public Object insert3(Map<String, Object> vo) throws Exception {
		return insert("Sub0102DAO.insert3", vo);
	}

	// public int insert2(Sub0102VO vo) throws Exception {
	// int insert2 = 0;
	//
	// String selectKey = (String) super.insert(vo);
	//
	// vo.setCodeId(selectKey);
	//
	// return insert2;
	// }

	@Override
	public Sub0102VO select(Sub0102VO vo) throws Exception {
		return super.select(vo);
	}

	@Override
	public List<EgovMap> selectList(Sub0102VO vo) throws Exception {
		return super.selectList(vo);
	}

	@Override
	public int selectListCount(Sub0102VO vo) throws Exception {
		return super.selectListCount(vo);
	}

	@Override
	public int update(Sub0102VO vo) throws Exception {
		return super.update(vo);
	}

	@Override
	public int delete(Sub0102VO vo) throws Exception {
		return super.delete(vo);
	}

	@Override
	public int merge(Sub0102VO vo) throws Exception {
		return super.merge(vo);
	}

	@Override
	public int multi(Sub0102VO vo) throws Exception {
		return super.multi(vo);
	}

	// 추가

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectListMap(Sub0102VO vo) throws Exception {
		return (List<EgovMap>) list(queryId.get("selectListMap"), vo);
	}

	@SuppressWarnings("unchecked")
	public List<Sub0102VO> selectListType(Sub0102VO vo) throws Exception {
		return (List<Sub0102VO>) list(queryId.get("selectListType"), vo);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectListMapForMap(Map<String, Object> vo)
			throws Exception {
		return (List<EgovMap>) list(queryId.get("selectListMapForMap"), vo);
	}

}
