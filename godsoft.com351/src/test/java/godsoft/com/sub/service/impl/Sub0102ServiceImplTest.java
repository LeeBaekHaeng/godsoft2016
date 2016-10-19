package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.sub.service.Sub0102Service;
import godsoft.com.sub.service.Sub0102VO;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml" })
public class Sub0102ServiceImplTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private Sub0102Service sub0102Service;

	@Test
	public void test() throws Exception {
		selectList();
	}

	public void selectList() throws Exception {
		Sub0102VO vo = new Sub0102VO();

		vo.setCodeId("COM001");

		vo.setUseAt("Y");

		vo.setFirstIndex(0);
		// vo.setRecordCountPerPage(10);
		vo.setRecordCountPerPage(Integer.MAX_VALUE);

		List<EgovMap> items = sub0102Service.selectList(vo);

		egovLogger.debug("items=" + items);

		for (EgovMap item : items) {
			egovLogger.debug("item=" + item);
			egovLogger.debug("item=" + item.get("codeId"));
		}
	}

}
