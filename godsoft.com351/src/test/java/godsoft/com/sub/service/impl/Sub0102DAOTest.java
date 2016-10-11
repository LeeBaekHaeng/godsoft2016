package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.sub.service.Sub0102VO;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml" })
public class Sub0102DAOTest {

	// protected final Log logger = LogFactory.getLog(getClass());
	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private Sub0102DAO sub0102DAO;

	@Test
	public void test() throws Exception {
		selectList();
		// selectListMap();
		// selectListType();
	}

	public void selectList() throws Exception {
		Sub0102VO vo = new Sub0102VO();

		vo.setCodeId("COM001");

		vo.setUseAt("Y");

		vo.setFirstIndex(0);
		// vo.setRecordCountPerPage(10);
		vo.setRecordCountPerPage(Integer.MAX_VALUE);

		List<EgovMap> items = sub0102DAO.selectList(vo);

		egovLogger.debug("items=" + items);

		for (EgovMap item : items) {
			egovLogger.debug("item=" + item);
			egovLogger.debug("item=" + item.get("codeId"));
		}
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

	public void selectListType() throws Exception {
		Sub0102VO vo = new Sub0102VO();

		vo.setCodeId("COM001");

		vo.setUseAt("Y");

		vo.setFirstIndex(0);
		// vo.setRecordCountPerPage(10);
		vo.setRecordCountPerPage(Integer.MAX_VALUE);

		List<Sub0102VO> items = sub0102DAO.selectListType(vo);

		System.out.println("items=" + items);

		for (Sub0102VO item : items) {
			System.out.println("item=" + item);
			System.out.println("item=" + item.getCodeNm());
		}
	}

	public void selectListMapForMap() throws Exception {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("codeId", "COM001");

		vo.put("useAt", "Y");

		vo.put("firstIndex", 0);
		vo.put("recordCountPerPage", Integer.MAX_VALUE);

		List<EgovMap> items = sub0102DAO.selectListMapForMap(vo);

		System.out.println("items=" + items);

		for (EgovMap item : items) {
			System.out.println("item=" + item);
			System.out.println("item=" + item.get("codeId"));
		}
	}

}
