package godsoft.com.cmm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class AdministCodeDAOTest {

	@Autowired
	private AdministCodeDAO administCodeDAO;

	@Test
	public void test() throws Exception {
		Map<String, Object> vo = new HashMap<String, Object>();
		vo.put("administZoneSe", "1"); // 법정동
		// vo.put("administZoneSe", "2"); // 행정동

		// vo.put("administZoneCode", "__00000000"); // 행정코드.행정구역코드 시도
		vo.put("administZoneCode", "30___00000"); // 행정코드.행정구역코드 대전 시군구

		vo.put("useAt", "Y"); // 행정코드.사용여부

		List<EgovMap> items = administCodeDAO.selectList(vo);

		System.out.println("items=" + items);

		for (EgovMap item : items) {
			System.out.println("item=" + item);
			System.out.println("item=" + item.get("administZoneNm"));
		}
	}

}
