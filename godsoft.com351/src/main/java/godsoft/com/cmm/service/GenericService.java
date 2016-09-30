package godsoft.com.cmm.service;

import java.util.List;

import org.springframework.ui.ModelMap;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface GenericService<T> {

	void init();

	/**
	 * 내용검증
	 * 
	 * @param vo
	 * @param model
	 */
	void validate(T vo, ModelMap model);

	/**
	 * 조건확인
	 * 
	 * @param vo
	 * @param model
	 */
	void check(T vo, ModelMap model);

	/**
	 * 검색
	 * 
	 * @param vo
	 * @param model
	 */
	void search(T vo, ModelMap model);

	/**
	 * 연계
	 * 
	 * @param vo
	 * @param model
	 */
	void contact(T vo, ModelMap model);

	/**
	 * action
	 * 
	 * @param vo
	 * @param model
	 */
	void action(T vo, ModelMap model);

	/**
	 * 파일관리-읽기
	 * 
	 * @param vo
	 * @param model
	 */
	void read(T vo, ModelMap model);

	/**
	 * 파일관리-쓰기
	 * 
	 * @param vo
	 * @param model
	 */
	void write(T vo, ModelMap model);

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int insert(T vo);

	/**
	 * 등록
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
	T select(T vo);

	/**
	 * 조회(단건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	T select2(T vo);

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	List<EgovMap> selectList(T vo);

	/**
	 * 조회(멀티건)
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	List<EgovMap> selectList2(T vo);

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int update(T vo);

	/**
	 * 수정
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
	 * 등록/수정
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
	 * 등록/수정/삭제
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int multi2(T vo);

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
