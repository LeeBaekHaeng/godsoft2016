package godsoft.com.cmm.service;

import java.util.List;

import org.springframework.ui.ModelMap;

/**
 * data 처리관련(Controller, Business , DAO 공통) Service
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 * @param <T>
 *            파리미터 VO
 * @param <E>
 *            리절트 VO, EgovMap
 */
public interface GodEgovAbstractService2<T, E> {

	// data 처리관련(Controller, Business , DAO 공통)

	/**
	 * 기본키 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	T selectKey(T vo) throws Exception;

	/**
	 * 기본키 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	T selectKey2(T vo) throws Exception;

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int insert(T vo) throws Exception;

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int insert2(T vo) throws Exception;

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	T select(T vo) throws Exception;

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	T select2(T vo) throws Exception;

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	List<E> selectList(T vo) throws Exception;

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	List<E> selectList2(T vo) throws Exception;

	/**
	 * 카운트 조회(단건)
	 * 
	 * @param vo
	 * @return
	 */
	int selectListCount(T vo) throws Exception;

	/**
	 * 카운트 조회(단건)
	 * 
	 * @param vo
	 * @return
	 */
	int selectListCount2(T vo) throws Exception;

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int update(T vo) throws Exception;

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int update2(T vo) throws Exception;

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int delete(T vo) throws Exception;

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int delete2(T vo) throws Exception;

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int merge(T vo) throws Exception;

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int merge2(T vo) throws Exception;

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int multi(T vo) throws Exception;

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int multi2(T vo) throws Exception;

	// ModelMap

	/**
	 * 등록폼
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void insertForm(T vo, ModelMap model) throws Exception;

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void insert(T vo, ModelMap model) throws Exception;

	/**
	 * 등록폼
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void insertForm2(T vo, ModelMap model) throws Exception;

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void insert2(T vo, ModelMap model) throws Exception;

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void select(T vo, ModelMap model) throws Exception;

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void select2(T vo, ModelMap model) throws Exception;

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void selectList(T vo, ModelMap model) throws Exception;

	/**
	 * 목록
	 * 
	 * @param vo
	 * @param model
	 * @throws Exception
	 */
	void list(T vo, ModelMap model) throws Exception;

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void selectList2(T vo, ModelMap model) throws Exception;

	/**
	 * 수정 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void updateForm(T vo, ModelMap model) throws Exception;

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void update(T vo, ModelMap model) throws Exception;

	/**
	 * 수정 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void updateForm2(T vo, ModelMap model) throws Exception;

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void update2(T vo, ModelMap model) throws Exception;

	/**
	 * 삭제 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void deleteForm(T vo, ModelMap model) throws Exception;

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void delete(T vo, ModelMap model) throws Exception;

	/**
	 * 삭제 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void deleteForm2(T vo, ModelMap model) throws Exception;

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void delete2(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void mergeForm(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void merge(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void mergeForm2(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void merge2(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정/삭제 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void multiForm(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void multi(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정/삭제 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void multiForm2(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void multi2(T vo, ModelMap model) throws Exception;

}
