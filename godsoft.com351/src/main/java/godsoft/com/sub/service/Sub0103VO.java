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

	private String emailCn;
	private String sndr;
	private String rcver;
	private String sj;
	private String sndngResultCode;
	private String dsptchDt;
	private String atchFileId;

	public String getMssageId() {
		return mssageId;
	}

	public void setMssageId(String mssageId) {
		this.mssageId = mssageId;
	}

	public String getEmailCn() {
		return emailCn;
	}

	public void setEmailCn(String emailCn) {
		this.emailCn = emailCn;
	}

	public String getSndr() {
		return sndr;
	}

	public void setSndr(String sndr) {
		this.sndr = sndr;
	}

	public String getRcver() {
		return rcver;
	}

	public void setRcver(String rcver) {
		this.rcver = rcver;
	}

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getSndngResultCode() {
		return sndngResultCode;
	}

	public void setSndngResultCode(String sndngResultCode) {
		this.sndngResultCode = sndngResultCode;
	}

	public String getDsptchDt() {
		return dsptchDt;
	}

	public void setDsptchDt(String dsptchDt) {
		this.dsptchDt = dsptchDt;
	}

	public String getAtchFileId() {
		return atchFileId;
	}

	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
	}

}
