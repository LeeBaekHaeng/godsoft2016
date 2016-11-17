package godsoft.com.cmm.service;

import egovframework.com.cmm.ComDefaultVO;

@SuppressWarnings("serial")
public class CmmVO extends ComDefaultVO {

	private String atchFileId;

	private String keyStr;

	public String getAtchFileId() {
		return atchFileId;
	}

	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
	}

	public String getKeyStr() {
		return keyStr;
	}

	public void setKeyStr(String keyStr) {
		this.keyStr = keyStr;
	}

}
