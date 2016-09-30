package godsoft.com.sub.service;

import egovframework.com.cmm.ComDefaultVO;

/**
 * 서브0101 VO
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@SuppressWarnings("serial")
public class Sub0101VO extends ComDefaultVO {

	private String codeId;

	private String useAt;

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getUseAt() {
		return useAt;
	}

	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

}
