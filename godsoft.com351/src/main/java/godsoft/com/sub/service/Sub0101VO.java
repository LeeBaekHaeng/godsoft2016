package godsoft.com.sub.service;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.cmm.service.FileVO;

/**
 * 서브0101 VO
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@SuppressWarnings("serial")
public class Sub0101VO extends ComDefaultVO {

	/**
	 * COMTCCMMNDETAILCODE.CODE_ID 공통상세코드.코드ID
	 */
	private String codeId;

	private String code;

	/**
	 * COMTCCMMNDETAILCODE.USE_AT 공통상세코드.사용여부
	 */
	private String useAt;

	private FileVO fileVO = new FileVO();

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public FileVO getFileVO() {
		return fileVO;
	}

	public void setFileVO(FileVO fileVO) {
		this.fileVO = fileVO;
	}

}
