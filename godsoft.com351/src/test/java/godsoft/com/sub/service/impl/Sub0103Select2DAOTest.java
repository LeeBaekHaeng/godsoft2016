package godsoft.com.sub.service.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.rte.psl.dataaccess.util.EgovMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml" })
public class Sub0103Select2DAOTest {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private Sub0103Select2DAO sub0103Select2DAO;

	// @Test
	public void select2() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("mssageId", "1");
		vo.put("mssageId", "201611010857171");

		EgovMap item = sub0103Select2DAO.select2(vo);

		logger.debug("item=" + item);
		logger.debug("mssageId=" + item.get("mssageId"));
		logger.debug("emailCn=" + item.get("emailCn"));
		logger.debug("sndr=" + item.get("sndr"));
	}

	// @Test
	public void select2ForEgovMap() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("mssageId", "1");
		vo.put("mssageId", "201611010857171");

		EgovMap item = sub0103Select2DAO.select2ForEgovMap(vo);

		logger.debug("item=" + item);
		logger.debug("mssageId=" + item.get("mssageId"));
		logger.debug("emailCn=" + item.get("emailCn"));
		logger.debug("sndr=" + item.get("sndr"));
	}

	// @Test
	public void select2ForMap() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("mssageId", "1");
		vo.put("mssageId", "201611010857171");

		Map<String, Object> item = sub0103Select2DAO.select2ForMap(vo);

		logger.debug("item=" + item);
		logger.debug("mssageId=" + item.get("mssageId"));
		logger.debug("emailCn=" + item.get("emailCn"));
		logger.debug("sndr=" + item.get("sndr"));

		// debug(item);
		// debug2(item);
		debug3(item);
	}

	@Test
	public void select2ForListOrderedMap() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("mssageId", "1");
		vo.put("mssageId", "201611010857171");

		Map<?, ?> item = sub0103Select2DAO.select2ForListOrderedMap(vo);

		debug3(item);
	}

	void debug(Map<?, ?> map) {
		logger.debug("map=" + map);

		@SuppressWarnings("unchecked")
		Iterator<String> keys = (Iterator<String>) map.keySet().iterator();

		while (keys.hasNext()) {
			String key = keys.next();

			logger.debug(key + "=" + map.get(key));
		}
	}

	void debug2(Map<?, ?> map) {
		logger.debug("map=" + map);

		for (Map.Entry<?, ?> entry : map.entrySet()) {
			logger.debug(entry.getKey() + "=" + entry.getValue());
		}
	}

	void debug3(Map<?, ?> map) {
		logger.debug("map=" + map);

		for (Object key : map.keySet()) {
			logger.debug(key + "=" + map.get(key));
		}
	}

}
