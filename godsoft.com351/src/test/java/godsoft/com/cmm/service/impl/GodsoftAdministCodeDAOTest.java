package godsoft.com.cmm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.rte.psl.dataaccess.util.EgovMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml" })
public class GodsoftAdministCodeDAOTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private GodsoftAdministCodeDAO godsoftAdministCodeDAO;

	@Test
	public void test() throws Exception {
		Map<String, Object> vo = new HashMap<String, Object>();

		List<EgovMap> items = godsoftAdministCodeDAO.selectList(vo);

		System.out.println("items=" + items);

		for (EgovMap item : items) {
			System.out.println("item=" + item);
			System.out.println("administZoneCode="
					+ item.get("administZoneCode"));
			System.out.println("administZoneNm=" + item.get("administZoneNm"));
		}

		if (egovLogger.isDebugEnabled()) {
			egovLogger.debug("items=" + items);
		}

		for (EgovMap item : items) {
			if (egovLogger.isDebugEnabled()) {
				egovLogger.debug("item=" + item);
				egovLogger.debug("administZoneCode="
						+ item.get("administZoneCode"));
				egovLogger
						.debug("administZoneNm=" + item.get("administZoneNm"));
			}
		}
	}

}
