package godsoft.com.cmm.service;

import org.springframework.ui.ModelMap;

/**
 * business 처리 관련 Service
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 * @param <T>
 *            파라미터 VO
 * @param <E>
 *            리절트 VO, EgovMap
 */
public interface GodBusinessEgovAbstractService<T, E> {

	// business 처리 관련

	/**
	 * 내용검증
	 * 
	 * @param vo
	 * @param model
	 */
	void validate(T vo) throws Exception;

	/**
	 * 조건확인
	 * 
	 * @param vo
	 * @param model
	 */
	void check(T vo) throws Exception;

	/**
	 * 검색
	 * 
	 * @param vo
	 * @param model
	 */
	void search(T vo) throws Exception;

	/**
	 * 연계
	 * 
	 * @param vo
	 * @param model
	 */
	void contact(T vo) throws Exception;

	/**
	 * action
	 * 
	 * @param vo
	 * @param model
	 */
	void action(T vo) throws Exception;

	/**
	 * 파일관리-읽기
	 * 
	 * @param vo
	 * @param model
	 */
	void read(T vo) throws Exception;

	/**
	 * 파일관리-쓰기
	 * 
	 * @param vo
	 * @param model
	 */
	void write(T vo) throws Exception;

	// ModelMap

	/**
	 * 내용검증
	 * 
	 * @param vo
	 * @param model
	 */
	void validate(T vo, ModelMap model) throws Exception;

	/**
	 * 조건확인
	 * 
	 * @param vo
	 * @param model
	 */
	void check(T vo, ModelMap model) throws Exception;

	/**
	 * 검색
	 * 
	 * @param vo
	 * @param model
	 */
	void search(T vo, ModelMap model) throws Exception;

	/**
	 * 연계
	 * 
	 * @param vo
	 * @param model
	 */
	void contact(T vo, ModelMap model) throws Exception;

	/**
	 * action
	 * 
	 * @param vo
	 * @param model
	 */
	void action(T vo, ModelMap model) throws Exception;

	/**
	 * 파일관리-읽기
	 * 
	 * @param vo
	 * @param model
	 */
	void read(T vo, ModelMap model) throws Exception;

	/**
	 * 파일관리-쓰기
	 * 
	 * @param vo
	 * @param model
	 */
	void write(T vo, ModelMap model) throws Exception;

}
