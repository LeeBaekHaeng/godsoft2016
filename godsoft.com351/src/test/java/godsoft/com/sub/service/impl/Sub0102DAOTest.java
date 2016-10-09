package godsoft.com.sub.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.sub.service.Sub0102VO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml" })
public class Sub0102DAOTest {

	@Autowired
	private Sub0102DAO sub0102DAO;

	@Test
	public void test() throws Exception {
		selectListMap();
	}

	public void selectListMap() throws Exception {
		Sub0102VO vo = new Sub0102VO();

		vo.setCodeId("COM001");

		vo.setUseAt("Y");

		vo.setFirstIndex(0);
		// vo.setRecordCountPerPage(10);
		vo.setRecordCountPerPage(Integer.MAX_VALUE);

		List<EgovMap> items = sub0102DAO.selectListMap(vo);

		System.out.println("items=" + items);

		for (EgovMap item : items) {
			System.out.println("item=" + item);
			System.out.println("item=" + item.get("codeId"));
		}
	}

}
