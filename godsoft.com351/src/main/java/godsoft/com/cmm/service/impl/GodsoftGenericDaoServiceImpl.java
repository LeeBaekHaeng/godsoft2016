package godsoft.com.cmm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.cmm.service.GodsoftGenericDaoService;

/**
 * 제네릭 Dao ServiceImpl
 * 
 * @author 이백행<dlqorgod@naver.com>
 *
 * @param <T>
 */
@Repository
public class GodsoftGenericDaoServiceImpl<T> extends EgovComAbstractDAO
		implements GodsoftGenericDaoService<T> {

	protected Map<String, String> queryId = new HashMap<String, String>();

	@Override
	@PostConstruct
	public void init() {
	}

	@Override
	public int insert(T vo) {
		return (Integer) insert(queryId.get("insert"), vo);
	}

	@Override
	public int insert2(T vo) {
		return (Integer) insert(queryId.get("insert2"), vo);
	}

	@Override
	public EgovMap select(T vo) {
		return (EgovMap) select(queryId.get("select"), vo);
	}

	@Override
	public EgovMap select2(T vo) {
		return (EgovMap) select(queryId.get("select2"), vo);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(T vo) {
		// return (List<EgovMap>) list(queryId.get("selectList"), vo);
		return (List<EgovMap>) list("AdministCodeDAO.selectSidoList", vo);
	}

	@Override
	public int selectListCount(T vo) {
		return (Integer) select(queryId.get("selectListCount"), vo);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList2(T vo) {
		return (List<EgovMap>) list(queryId.get("selectList2"), vo);
	}

	@Override
	public int selectListCount2(T vo) {
		return (Integer) select(queryId.get("selectListCount2"), vo);
	}

	@Override
	public int update(T vo) {
		return update(queryId.get("update"), vo);
	}

	@Override
	public int update2(T vo) {
		return update(queryId.get("update2"), vo);
	}

	@Override
	public int delete(T vo) {
		return delete(queryId.get("delete"), vo);
	}

	@Override
	public int delete2(T vo) {
		return delete(queryId.get("delete2"), vo);
	}

	@Override
	public int merge(T vo) {
		return update(queryId.get("merge"), vo);
	}

	@Override
	public int merge2(T vo) {
		return update(queryId.get("merge2"), vo);
	}

	@Override
	public int multi(T vo) {
		return update(queryId.get("multi"), vo);
	}

	@Override
	public int multi2(T vo) {
		return update(queryId.get("multi2"), vo);
	}

}
