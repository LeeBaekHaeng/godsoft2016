package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.sub.service.Sub0103VO;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml" })
public class Sub0103DAOTest {

	@Autowired
	private Sub0103DAO Sub0103DAO;

	@Test
	public void selectList() throws Exception {
		Sub0103VO vo = new Sub0103VO();

		vo.setFirstIndex(0);
		// vo.setRecordCountPerPage(10);
		vo.setRecordCountPerPage(Integer.MAX_VALUE);

		List<EgovMap> items = Sub0103DAO.selectList(vo);

		if (items != null) {
			System.out.println("items=" + items);

			for (EgovMap item : items) {
				System.out.println("item=" + item);
				System.out.println("item=" + item.get("mssageId"));
			}
		}
	}

}
