package godsoft.com.crud.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.rte.fdl.string.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/test-dao-context.xml" })
public class CmmnDetailCodeDAOTest {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private CmmnDetailCodeDAO cmmnDetailCodeDAO;

	public void debug(EgovMap item) {
		logger.debug("item=" + item);
		logger.debug("codeId=" + item.get("codeId"));
		logger.debug("code=" + item.get("code"));
		logger.debug("codeNm=" + item.get("codeNm"));
		logger.debug("codeDc=" + item.get("codeDc"));
		logger.debug("lastUpdusrId=" + item.get("lastUpdusrId"));
		logger.debug("frstRegistPnttm=" + item.get("frstRegistPnttm"));
		logger.debug("frstRegisterId=" + item.get("frstRegisterId"));
		logger.debug("lastUpdtPnttm=" + item.get("lastUpdtPnttm"));
		logger.debug("lastUpdusrId=" + item.get("lastUpdusrId"));
	}

	public void debug(CmmnDetailCode item) {
		logger.debug("item=" + item);
		logger.debug("getCodeId=" + item.getCodeId());
		logger.debug("getCode=" + item.getCode());
		logger.debug("getCodeNm=" + item.getCodeNm());
		logger.debug("getCodeDc=" + item.getCodeDc());
		logger.debug("getUseAt=" + item.getUseAt());
		logger.debug("getFrstRegisterId=" + item.getFrstRegisterId());
		logger.debug("getLastUpdusrId=" + item.getLastUpdusrId());
	}

	public void debugEgovMap(List<EgovMap> items) {
		logger.debug("items=" + items);

		logger.debug("size=" + items.size());

		for (EgovMap item : items) {
			debug(item);
		}
	}

	public void debugCmmnDetailCode(List<CmmnDetailCode> items) {
		logger.debug("items=" + items);

		logger.debug("size=" + items.size());

		for (CmmnDetailCode item : items) {
			debug(item);
		}
	}

	// @Test
	public void test() {
		CmmnDetailCode vo = new CmmnDetailCode();

		vo.setUseAt("Y");

		List<EgovMap> items = cmmnDetailCodeDAO.selectList(vo);

		debugEgovMap(items);
	}

	// @Test
	public void test2() {
		CmmnDetailCode vo = new CmmnDetailCode();

		vo.setUseAt("Y");

		List<CmmnDetailCode> items = cmmnDetailCodeDAO
				.selectListForCmmnDetailCode(vo);

		debugCmmnDetailCode(items);
	}

	// @Test
	public void test3() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("useAt", "Y");

		List<EgovMap> items = cmmnDetailCodeDAO.selectList(vo);

		debugEgovMap(items);
	}

	// @Test
	public void test4() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("useAt", "Y");

		List<CmmnDetailCode> items = cmmnDetailCodeDAO
				.selectListForCmmnDetailCode(vo);

		debugCmmnDetailCode(items);
	}

	@Test
	public void test5() {
		CmmnDetailCode vo = new CmmnDetailCode();

		// vo.setUseAt("Y");

		List<EgovMap> items = cmmnDetailCodeDAO.selectListA1(vo);

		logger.debug("items=" + items);

		int size = items.size();

		logger.debug("size=" + size);

		StringBuffer sb = new StringBuffer();

		int j = 1;

		String codeId2 = null;

		for (int i = 0; i < size; i++) {
			EgovMap item = items.get(i);

			String codeId = (String) item.get("codeId");
			String code = (String) item.get("code");

			// debug(item);

			logger.debug("codeId=" + codeId);
			logger.debug("codeId2=" + codeId2);

			if (codeId.equals(codeId2)) {
				j++;
			} else {
				j = 1;
			}

			logger.debug("j=" + j);

			String jString = String.format("%02d", j);

			codeId2 = codeId;

			sb.append("update COMTCCMMNDETAILCODE set");
			sb.append(" CODE_DC = '");
			sb.append(jString);
			sb.append("'");
			sb.append(" where CODE_ID = '");
			sb.append(codeId);
			sb.append("'");
			sb.append(" and CODE = '");
			sb.append(code);
			sb.append("'");
			sb.append(";\n");
		}

		sb.append("\n--commit;\n");

		logger.debug(sb);

		writeStringToFile(sb);
	}

	public void writeStringToFile(StringBuffer sb) {
		try {
			FileUtils.writeStringToFile(
					new File(SystemUtils.USER_HOME
							+ "/Desktop/update 코드설명_V1.0_"
							+ EgovDateUtil.toString(new Date(),
									"yyyy-MM-dd HH-mm-ss", null) + ".sql"),
					sb.toString(), "ms949");
		} catch (IOException e) {
			logger.error(e);
		}
	}

}
