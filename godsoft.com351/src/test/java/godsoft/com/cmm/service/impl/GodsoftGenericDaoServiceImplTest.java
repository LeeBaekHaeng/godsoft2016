package godsoft.com.cmm.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.cmm.service.GodsoftGenericDaoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml" })
public class GodsoftGenericDaoServiceImplTest {

	@Autowired
	private GodsoftGenericDaoService<Map<String, Object>> godsoftGenericDaoService;

	@Test
	public void test() throws Exception {
		Map<String, Object> vo = new HashMap<String, Object>();

		List<EgovMap> items = godsoftGenericDaoService.selectList(vo);

		System.out.println("items=" + items);

		for (EgovMap item : items) {
			System.out.println("item=" + item);
			System.out.println("administZoneCode="
					+ item.get("administZoneCode"));
			System.out.println("administZoneNm=" + item.get("administZoneNm"));
		}
	}

}
