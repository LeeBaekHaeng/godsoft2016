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
public interface GodEgovAbstractService<T, E> {

	void postConstruct();

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
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int insert(T vo) throws Exception;

	/**
	 * 상세 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	T select(T vo) throws Exception;

	/**
	 * 목록 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	List<E> selectList(T vo) throws Exception;

	/**
	 * 목록 카운트 조회(단건)
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
	 * @throws Exception
	 */
	int selectCount(T vo) throws Exception;

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int update(T vo) throws Exception;

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int delete(T vo) throws Exception;

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int merge(T vo) throws Exception;

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int multi(T vo) throws Exception;

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
	 * 상세 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void select(T vo, ModelMap model) throws Exception;

	/**
	 * 목록 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void selectList(T vo, ModelMap model) throws Exception;

	/**
	 * 수정폼
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
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void delete(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정폼
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void mergeFrom(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void merge(T vo, ModelMap model) throws Exception;

	/**
	 * 등록/수정/삭제폼
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

	// jsp

	/**
	 * 목록
	 * 
	 * @param vo
	 * @param model
	 * @throws Exception
	 */
	void list(T vo, ModelMap model) throws Exception;

	/**
	 * 등록폼
	 * 
	 * @param vo
	 * @param model
	 * @throws Exception
	 */
	void regist(T vo, ModelMap model) throws Exception;

	/**
	 * 상세
	 * 
	 * @param vo
	 * @param model
	 * @throws Exception
	 */
	void detail(T vo, ModelMap model) throws Exception;

	/**
	 * 수정폼
	 * 
	 * @param vo
	 * @param model
	 * @throws Exception
	 */
	void updt(T vo, ModelMap model) throws Exception;

	/**
	 * 팝업
	 * 
	 * @param vo
	 * @param model
	 * @throws Exception
	 */
	void popup(T vo, ModelMap model) throws Exception;

	/**
	 * 조회
	 * 
	 * @param vo
	 * @param model
	 * @throws Exception
	 */
	void search(T vo, ModelMap model) throws Exception;

}
