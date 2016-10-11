package godsoft.com.sub.service;

import java.util.Map;

import egovframework.com.cmm.ComDefaultVO;

/**
 * 서브0102 VO
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@SuppressWarnings("serial")
public class Sub0102VO extends ComDefaultVO {

	/** COMTCCMMNDETAILCODE.CODE_ID, 공통상세코드.코드ID */
	private String codeId;

	/** COMTCCMMNDETAILCODE.CODE, 공통상세코드.코드 */
	private String code;

	/** COMTCCMMNDETAILCODE.CODE_NM, 공통상세코드.코드명 */
	private String codeNm;

	/** COMTCCMMNDETAILCODE.CODE_DC, 공통상세코드.코드설명 */
	private String codeDc;

	/** COMTCCMMNDETAILCODE.USE_AT, 공통상세코드.사용여부 */
	private String useAt;

	/** COMTCCMMNDETAILCODE.FRST_REGIST_PNTTM, 공통상세코드.최초등록시점 */
	private String frstRegistPnttm;

	/** COMTCCMMNDETAILCODE.FRST_REGISTER_ID, 공통상세코드.최초등록자ID */
	private String frstRegisterId;

	/** COMTCCMMNDETAILCODE.LAST_UPDT_PNTTM, 공통상세코드.최종수정시점 */
	private String lastUpdtPnttm;

	/** COMTCCMMNDETAILCODE.LAST_UPDUSR_ID, 공통상세코드.최종수정자ID */
	private String lastUpdusrId;

	private Sub0102VO sk;
	private Map<String, Object> selectKey;

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeNm() {
		return codeNm;
	}

	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}

	public String getCodeDc() {
		return codeDc;
	}

	public void setCodeDc(String codeDc) {
		this.codeDc = codeDc;
	}

	public String getUseAt() {
		return useAt;
	}

	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

	public String getFrstRegistPnttm() {
		return frstRegistPnttm;
	}

	public void setFrstRegistPnttm(String frstRegistPnttm) {
		this.frstRegistPnttm = frstRegistPnttm;
	}

	public String getFrstRegisterId() {
		return frstRegisterId;
	}

	public void setFrstRegisterId(String frstRegisterId) {
		this.frstRegisterId = frstRegisterId;
	}

	public String getLastUpdtPnttm() {
		return lastUpdtPnttm;
	}

	public void setLastUpdtPnttm(String lastUpdtPnttm) {
		this.lastUpdtPnttm = lastUpdtPnttm;
	}

	public String getLastUpdusrId() {
		return lastUpdusrId;
	}

	public void setLastUpdusrId(String lastUpdusrId) {
		this.lastUpdusrId = lastUpdusrId;
	}

	public Sub0102VO getSk() {
		return sk;
	}

	public void setSk(Sub0102VO sk) {
		this.sk = sk;
	}

	public Map<String, Object> getSelectKey() {
		return selectKey;
	}

	public void setSelectKey(Map<String, Object> selectKey) {
		this.selectKey = selectKey;
	}

}
