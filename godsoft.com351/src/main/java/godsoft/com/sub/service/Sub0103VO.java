package godsoft.com.sub.service;

import egovframework.com.cmm.ComDefaultVO;

/**
 * 서브0103 VO
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@SuppressWarnings("serial")
public class Sub0103VO extends ComDefaultVO {

	/**
	 * <pre>
	 *  COMTHEMAILDSPTCHMANAGE.MSSAGE_ID
	 * 메일발신관리.메시지ID
	 * </pre>
	 */
	private String mssageId;

	public String getMssageId() {
		return mssageId;
	}

	public void setMssageId(String mssageId) {
		this.mssageId = mssageId;
	}

}
