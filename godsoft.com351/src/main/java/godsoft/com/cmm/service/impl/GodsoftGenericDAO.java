package godsoft.com.cmm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

/**
 * 갓소프트 제네릭 DAO
 * 
 * @author 이백행<dlqorgod@naver.com>
 *
 * @param <T1>
 * @param <T2>
 */
@Repository
public class GodsoftGenericDAO<T1, T2> extends EgovComAbstractDAO {

	protected Map<String, String> queryId = new HashMap<String, String>();

	@PostConstruct
	public void postConstruct() {
	}

	public Object insert(T1 vo) throws Exception {
		return insert(queryId.get("insert"), vo);
	}

	public Object insert2(T1 vo) throws Exception {
		return insert(queryId.get("insert2"), vo);
	}

	@SuppressWarnings("unchecked")
	public T2 select(T1 vo) throws Exception {
		return (T2) select(queryId.get("select"), vo);
	}

	@SuppressWarnings("unchecked")
	public T2 select2(T1 vo) throws Exception {
		return (T2) select(queryId.get("select2"), vo);
	}

	@SuppressWarnings("unchecked")
	public List<T2> selectList(T1 vo) throws Exception {
		return (List<T2>) list(queryId.get("selectList"), vo);
	}

	public int selectListCount(T1 vo) throws Exception {
		return (Integer) select(queryId.get("selectListCount"), vo);
	}

	@SuppressWarnings("unchecked")
	public List<T2> selectList2(T1 vo) throws Exception {
		return (List<T2>) list(queryId.get("selectList2"), vo);
	}

	public int selectListCount2(T1 vo) throws Exception {
		return (Integer) select(queryId.get("selectListCount2"), vo);
	}

	public int update(T1 vo) throws Exception {
		return update(queryId.get("update"), vo);
	}

	public int update2(T1 vo) throws Exception {
		return update(queryId.get("update2"), vo);
	}

	public int delete(T1 vo) throws Exception {
		return delete(queryId.get("delete"), vo);
	}

	public int delete2(T1 vo) throws Exception {
		return delete(queryId.get("delete2"), vo);
	}

	public int merge(T1 vo) throws Exception {
		return update(queryId.get("merge"), vo);
	}

	public int merge2(T1 vo) throws Exception {
		return update(queryId.get("merge2"), vo);
	}

	public int multi(T1 vo) throws Exception {
		return update(queryId.get("multi"), vo);
	}

	public int multi2(T1 vo) throws Exception {
		return update(queryId.get("multi2"), vo);
	}

}
