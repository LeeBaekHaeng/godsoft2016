package godsoft.com.sub.service;

import egovframework.com.cmm.ComDefaultVO;

/**
 * 서브0109 VO
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@SuppressWarnings("serial")
public class Sub0109VO extends ComDefaultVO {

	/**
	 * COMTCCMMNDETAILCODE.CODE_ID 공통상세코드.코드ID
	 */
	private String codeId;

	/**
	 * COMTCCMMNDETAILCODE.USE_AT 공통상세코드.사용여부
	 */
	private String useAt;

	/**
	 * COMTCCMMNDETAILCODE.CODE_ID 공통상세코드.코드ID 값읽기
	 * 
	 * @return
	 */
	public String getCodeId() {
		return codeId;
	}

	/**
	 * COMTCCMMNDETAILCODE.CODE_ID 공통상세코드.코드ID 값설정
	 * 
	 * @param codeId
	 */
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	/**
	 * COMTCCMMNDETAILCODE.USE_AT 공통상세코드.사용여부 값읽기
	 * 
	 * @return
	 */
	public String getUseAt() {
		return useAt;
	}

	/**
	 * COMTCCMMNDETAILCODE.USE_AT 공통상세코드.사용여부 값설정
	 * 
	 * @param useAt
	 */
	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

}
