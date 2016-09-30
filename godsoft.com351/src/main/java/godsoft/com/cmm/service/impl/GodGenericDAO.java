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
 * @param <PVO>
 *            파라미터 VO
 * @param <SVO>
 *            조회(단건) 리턴 VO
 * @param <LVO>
 *            조회(멀티건) 리턴 VO
 */
@Repository
public class GodGenericDAO<PVO, SVO, LVO> extends EgovComAbstractDAO {

	protected Map<String, String> queryId = new HashMap<String, String>();

	@PostConstruct
	public void postConstruct() {
	}

	public Object insert(PVO vo) throws Exception {
		return insert(queryId.get("insert"), vo);
	}

	public Object insert2(PVO vo) throws Exception {
		return insert(queryId.get("insert2"), vo);
	}

	@SuppressWarnings("unchecked")
	public SVO select(PVO vo) throws Exception {
		return (SVO) select(queryId.get("select"), vo);
	}

	@SuppressWarnings("unchecked")
	public SVO select2(PVO vo) throws Exception {
		return (SVO) select(queryId.get("select2"), vo);
	}

	@SuppressWarnings("unchecked")
	public List<LVO> selectList(PVO vo) throws Exception {
		return (List<LVO>) list(queryId.get("selectList"), vo);
	}

	public int selectListCount(PVO vo) throws Exception {
		return (int) select(queryId.get("selectListCount"), vo);
	}

	@SuppressWarnings("unchecked")
	public List<LVO> selectList2(PVO vo) throws Exception {
		return (List<LVO>) list(queryId.get("selectList2"), vo);
	}

	public int selectListCount2(PVO vo) throws Exception {
		return (int) select(queryId.get("selectListCount2"), vo);
	}

	public int update(PVO vo) throws Exception {
		return update(queryId.get("update"), vo);
	}

	public int update2(PVO vo) throws Exception {
		return update(queryId.get("update2"), vo);
	}

	public int delete(PVO vo) throws Exception {
		return delete(queryId.get("delete"), vo);
	}

	public int delete2(PVO vo) throws Exception {
		return delete(queryId.get("delete2"), vo);
	}

	public int merge(PVO vo) throws Exception {
		return update(queryId.get("merge"), vo);
	}

	public int merge2(PVO vo) throws Exception {
		return update(queryId.get("merge2"), vo);
	}

	public int multi(PVO vo) throws Exception {
		return update(queryId.get("multi"), vo);
	}

	public int multi2(PVO vo) throws Exception {
		return update(queryId.get("multi2"), vo);
	}

}
