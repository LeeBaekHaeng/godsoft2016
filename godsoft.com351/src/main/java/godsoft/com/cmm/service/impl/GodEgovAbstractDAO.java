package godsoft.com.cmm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

/**
 * 갓소프트 ibatis DAO
 * 
 * 
 * @author 이백행<dlqorgod@naver.com>
 *
 * @param <T>
 */
public class GodEgovAbstractDAO<T, E> extends EgovComAbstractDAO {

	protected Map<String, String> queryId = new HashMap<String, String>();

	@PostConstruct
	public void postConstruct() {
	}

	/**
	 * 기본키 조회(단건)
	 * 
	 * @param vo
	 * @return @
	 */
	@SuppressWarnings("unchecked")
	public T selectKey(T vo) {
		return (T) select(queryId.get("selectKey"), vo);
	}

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return @
	 */
	public int insert(T vo) {
		return update(queryId.get("insert"), vo);
	}

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return @
	 */
	@SuppressWarnings("unchecked")
	public T select(T vo) {
		return (T) select(queryId.get("select"), vo);
	}

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return @
	 */
	@SuppressWarnings("unchecked")
	public List<E> selectList(T vo) {
		return (List<E>) list(queryId.get("selectListMap"), vo);
	}

	/**
	 * 카운트
	 * 
	 * @param vo
	 * @return @
	 */
	public int selectListCount(T vo) {
		return (int) select(queryId.get("selectListCount"), vo);
	}

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return @
	 */
	public int update(T vo) {
		return update(queryId.get("update"), vo);
	}

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return @
	 */
	public int delete(T vo) {
		return delete(queryId.get("delete"), vo);
	}

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return @
	 */
	public int merge(T vo) {
		return update(queryId.get("merge"), vo);
	}

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return @
	 */
	public int multi(T vo) {
		return update(queryId.get("multi"), vo);
	}

}
