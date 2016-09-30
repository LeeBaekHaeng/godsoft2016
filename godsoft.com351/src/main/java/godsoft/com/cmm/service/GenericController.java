package godsoft.com.cmm.service;

import org.springframework.ui.ModelMap;

public interface GenericController<T> {

	void init();

	/**
	 * 등록 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void insertForm(T vo, ModelMap model);

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void insert(T vo, ModelMap model);

	/**
	 * 등록 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void insertForm2(T vo, ModelMap model);

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void insert2(T vo, ModelMap model);

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void select(T vo, ModelMap model);

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void select2(T vo, ModelMap model);

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void selectList(T vo, ModelMap model);

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void selectList2(T vo, ModelMap model);

	/**
	 * 수정 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void updateForm(T vo, ModelMap model);

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void update(T vo, ModelMap model);

	/**
	 * 수정 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void updateForm2(T vo, ModelMap model);

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void update2(T vo, ModelMap model);

	/**
	 * 삭제 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void deleteForm(T vo, ModelMap model);

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void delete(T vo, ModelMap model);

	/**
	 * 삭제 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void deleteForm2(T vo, ModelMap model);

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void delete2(T vo, ModelMap model);

	/**
	 * 등록/수정 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void mergeForm(T vo, ModelMap model);

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void merge(T vo, ModelMap model);

	/**
	 * 등록/수정 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void mergeForm2(T vo, ModelMap model);

	/**
	 * 등록/수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void merge2(T vo, ModelMap model);

	/**
	 * 등록/수정/삭제 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void multiForm(T vo, ModelMap model);

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void multi(T vo, ModelMap model);

	/**
	 * 등록/수정/삭제 서식
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void multiForm2(T vo, ModelMap model);

	/**
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	void multi2(T vo, ModelMap model);

}
