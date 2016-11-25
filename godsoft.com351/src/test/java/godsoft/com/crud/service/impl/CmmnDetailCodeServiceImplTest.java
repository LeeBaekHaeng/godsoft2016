package godsoft.com.crud.service.impl;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ModelMap;

import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import godsoft.com.crud.service.CmmnDetailCodeService;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/test-context.xml" })
public class CmmnDetailCodeServiceImplTest {

	protected Logger egovLogger = LoggerFactory
			.getLogger(EgovAbstractServiceImpl.class);

	@Autowired
	private CmmnDetailCodeService cmmnDetailCodeService;

	@Test
	public void test() {
		CmmnDetailCode vo = new CmmnDetailCode();

		// vo.setCodeId("test");

		ModelMap model = new ModelMap();

		cmmnDetailCodeService.code(vo, model);

		@SuppressWarnings("unchecked")
		Map<String, List<CmmnDetailCode>> cmmnDetailCodeMap = (Map<String, List<CmmnDetailCode>>) model
				.get("cmmnDetailCodeMap");

		// debug(cmmnDetailCodeMap);

		// debug(cmmnDetailCodeMap.get("COM001"));
		// debug(cmmnDetailCodeMap.get("COM002"));
		// debug(cmmnDetailCodeMap.get("COM076"));

		// debug(cmmnDetailCodeMap, "COM001");
		// debug(cmmnDetailCodeMap, "COM002");
		// debug(cmmnDetailCodeMap, "COM075");
		debug(cmmnDetailCodeMap, "COM076");
	}

	public void debug(CmmnDetailCode item) {
		egovLogger.debug("item=" + item);
		egovLogger.debug("getCodeId=" + item.getCodeId());
		egovLogger.debug("getCode=" + item.getCode());
		egovLogger.debug("getCodeNm=" + item.getCodeNm());
		egovLogger.debug("getCodeDc=" + item.getCodeDc());
		egovLogger.debug("getUseAt=" + item.getUseAt());
		egovLogger.debug("getFrstRegisterId=" + item.getFrstRegisterId());
		egovLogger.debug("getLastUpdusrId=" + item.getLastUpdusrId());
	}

	public void debug(Map<String, List<CmmnDetailCode>> cmmnDetailCodeMap) {
		for (String key : cmmnDetailCodeMap.keySet()) {
			List<CmmnDetailCode> value = cmmnDetailCodeMap.get(key);

			egovLogger.debug(key + "=" + value);

			for (CmmnDetailCode item : value) {
				debug(item);
			}
		}
	}

	public void debug(List<CmmnDetailCode> items) {
		egovLogger.debug("items=" + items);

		if (items == null) {
			return;
		}

		egovLogger.debug("size=" + items.size());

		for (CmmnDetailCode item : items) {
			debug(item);
		}
	}

	public void debug(Map<String, List<CmmnDetailCode>> cmmnDetailCodeMap,
			String codeId) {
		egovLogger.debug("codeId=" + codeId);

		debug(cmmnDetailCodeMap.get(codeId));
	}

}
