package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.sub.service.Sub0101VO;

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
public class Sub0101DAOTest {

	@Autowired
	private Sub0101DAO Sub0101DAO;

	@Test
	public void test() throws Exception {
		select();
		// selectList();
	}

	public void select() throws Exception {
		Sub0101VO vo = new Sub0101VO();

		vo.setCodeId("COM001");
		// vo.setCode("REGC01");

		vo.setUseAt("Y");

		Sub0101VO item = Sub0101DAO.selectForObject(vo);

		System.out.println("item=" + item);

		if (item != null) {
			System.out.println("getCodeId=" + item.getCodeId());
			System.out.println("getCode" + item.getCode());
			System.out.println("getUseAt=" + item.getUseAt());
		}
	}

	public void selectList() throws Exception {
		Sub0101VO vo = new Sub0101VO();

		vo.setCodeId("COM001");

		vo.setUseAt("Y");

		vo.setFirstIndex(0);
		// vo.setRecordCountPerPage(10);
		vo.setRecordCountPerPage(Integer.MAX_VALUE);

		List<EgovMap> items = Sub0101DAO.selectList(vo);
		int cnt = Sub0101DAO.selectListCount(vo);

		System.out.println("items=" + items);
		System.out.println("cnt=" + cnt);

		for (EgovMap item : items) {
			System.out.println("item=" + item);
			System.out.println("item=" + item.get("codeId"));
		}
	}

}
