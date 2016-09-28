package godsoft.com.cmm.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * 제네릭 Dao Service
 * 
 * @author 이백행<dlqorgod@naver.com>
 *
 * @param <T>
 */
public interface GodsoftGenericDaoService<T> {

	void init();

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int insert(T vo);

	/**
	 * 등록2
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int insert2(T vo);

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	EgovMap select(T vo);

	/**
	 * 조회2(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	EgovMap select2(T vo);

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	List<EgovMap> selectList(T vo);

	/**
	 * 카운트 조회(단건)
	 * 
	 * @param vo
	 * @return
	 */
	int selectListCount(T vo);

	/**
	 * 조회2(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	List<EgovMap> selectList2(T vo);

	/**
	 * 카운트 조회2(단건)
	 * 
	 * @param vo
	 * @return
	 */
	int selectListCount2(T vo);

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int update(T vo);

	/**
	 * 수정2
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int update2(T vo);

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int delete(T vo);

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int delete2(T vo);

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int merge(T vo);

	/**
	 * 등록/수정2
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int merge2(T vo);

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int multi(T vo);

	/**
	 * 등록/수정/삭제2
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int multi2(T vo);

}
