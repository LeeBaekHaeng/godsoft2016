package godsoft.com.cmm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * 갓소프트 ibatis DAO
 * 
 * 
 * @author 이백행<dlqorgod@naver.com>
 *
 * @param <T>
 */
@Repository
public class GodEgovAbstractDAO<T> extends EgovComAbstractDAO {

	protected Map<String, String> queryId = new HashMap<String, String>();

	protected String queryIdPrefix;

	@PostConstruct
	public void postConstruct() {
		queryId.put("selectList", queryIdPrefix + ".selectList");
	}

	public Object insert(T vo) throws Exception {
		return insert(queryIdPrefix + ".insert", vo);
	}

	@SuppressWarnings("unchecked")
	public T select(T vo) throws Exception {
		return (T) select(queryId.get("select"), vo);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectListMap(T vo) throws Exception {
		return (List<EgovMap>) list(queryId.get("selectList"), vo);
	}

	@SuppressWarnings("unchecked")
	public List<T> selectListType(T vo) throws Exception {
		return (List<T>) list(queryId.get("selectList"), vo);
	}

	public int selectListCount(T vo) throws Exception {
		return (int) select(queryId.get("selectListCount"), vo);
	}

	public int update(T vo) throws Exception {
		return update(queryId.get("update"), vo);
	}

	public int delete(T vo) throws Exception {
		return delete(queryId.get("delete"), vo);
	}

	public int merge(T vo) throws Exception {
		return update(queryId.get("merge"), vo);
	}

	public int multi(T vo) throws Exception {
		return update(queryId.get("multi"), vo);
	}

}
