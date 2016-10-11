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

	@PostConstruct
	public void postConstruct() {
	}

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public Object insert(T vo) throws Exception {
		return insert(queryId.get("insert"), vo);
	}

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public T select(T vo) throws Exception {
		return (T) select(queryId.get("select"), vo);
	}

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(T vo) throws Exception {
		return (List<EgovMap>) list(queryId.get("selectListMap"), vo);
	}

	/**
	 * 카운트
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int selectListCount(T vo) throws Exception {
		return (int) select(queryId.get("selectListCount"), vo);
	}

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int update(T vo) throws Exception {
		return update(queryId.get("update"), vo);
	}

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int delete(T vo) throws Exception {
		return delete(queryId.get("delete"), vo);
	}

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int merge(T vo) throws Exception {
		return update(queryId.get("merge"), vo);
	}

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int multi(T vo) throws Exception {
		return update(queryId.get("multi"), vo);
	}

}
