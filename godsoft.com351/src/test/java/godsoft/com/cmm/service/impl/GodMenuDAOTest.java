package godsoft.com.cmm.service.impl;

import java.util.HashMap;
import java.util.List;
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
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/test-context.xml" })
public class GodMenuDAOTest {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private GodMenuDAO godMenuDAO;

	@Test
	public void test() throws Exception {
		Map<String, Object> vo = new HashMap<String, Object>();
		vo.put("menuNo", 0);
		vo.put("authorCode", "ROLE_USER");

		List<EgovMap> items = godMenuDAO.selectList(vo);

		logger.debug("items=" + items);

		for (EgovMap item : items) {
			logger.debug("item=" + item);
			logger.debug("item=" + item.get("menuNm"));
		}
	}

}
