package godsoft.com.sub.service.impl;

import egovframework.rte.fdl.string.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.sub.service.Sub0103VO;

import java.util.Date;
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml" })
public class Sub0103DAOTest {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private Sub0103DAO sub0103DAO;

	// @Test
	public void selectList() {
		Sub0103VO vo = new Sub0103VO();

		vo.setFirstIndex(0);
		// vo.setRecordCountPerPage(10);
		vo.setRecordCountPerPage(Integer.MAX_VALUE);

		List<EgovMap> items = sub0103DAO.selectList(vo);

		debugEgovMap(items);
	}

	// @Test
	public void selectListMap() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("firstIndex", 0);
		// vo.setRecordCountPerPage(10);
		vo.put("recordCountPerPage", Integer.MAX_VALUE);

		List<EgovMap> items = sub0103DAO.selectList(vo);

		debugEgovMap(items);
	}

	// @Test
	public void selectListMapForEgovMap() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("firstIndex", 0);
		vo.put("recordCountPerPage", Integer.MAX_VALUE);

		List<EgovMap> items = sub0103DAO.selectListMapForEgovMap(vo);

		debugEgovMap(items);
	}

	// @Test
	public void selectListMapForVO() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("firstIndex", 0);
		vo.put("recordCountPerPage", Integer.MAX_VALUE);

		List<Sub0103VO> items = sub0103DAO.selectListMapForVO(vo);

		debugVO(items);
	}

	// @Test
	public void selectListMapForResultMap() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("firstIndex", 0);
		vo.put("recordCountPerPage", Integer.MAX_VALUE);

		List<EgovMap> items = sub0103DAO.selectListMapForResultMap(vo);

		debugEgovMap(items);
	}

	// @Test
	public void selectListMapForResultMapMap() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("firstIndex", 0);
		vo.put("recordCountPerPage", Integer.MAX_VALUE);

		List<Map<String, Object>> items = sub0103DAO
				.selectListMapForResultMapMap(vo);

		debugMap(items);
	}

	private void debugEgovMap(List<EgovMap> items) {
		if (items != null) {
			logger.debug("items=" + items);

			for (EgovMap item : items) {
				logger.debug("item=" + item);
				logger.debug("mssageId=" + item.get("mssageId"));
			}
		}
	}

	private void debugVO(List<Sub0103VO> items) {
		if (items != null) {
			logger.debug("items=" + items);

			for (Sub0103VO item : items) {
				logger.debug("item=" + item);
				logger.debug("mssageId=" + item.getMssageId());
			}
		}
	}

	private void debugMap(List<Map<String, Object>> items) {
		if (items != null) {
			logger.debug("items=" + items);

			for (Map<String, Object> item : items) {
				logger.debug("item=" + item);
				logger.debug("mssageId=" + item.get("mssageId"));
			}
		}
	}

	@Test
	public void select() {
		Map<String, Object> vo = new HashMap<String, Object>();

		vo.put("mssageId", "1");
		vo.put("mssageId", "201611010857171");

		EgovMap item = sub0103DAO.select(vo);

		logger.debug("item=" + item);
		logger.debug("mssageId=" + item.get("mssageId"));
		logger.debug("emailCn=" + item.get("emailCn"));
		logger.debug("sndr=" + item.get("sndr"));
	}

	// @Test
	public void testData() throws Exception {
		String today = EgovDateUtil
				.toString(new Date(), "yyyyMMddHHmmss", null);

		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= 100; i++) {
			sb.append("insert into COMTHEMAILDSPTCHMANAGE (");
			sb.append("MSSAGE_ID");
			sb.append(", EMAIL_CN");
			sb.append(", SNDR");
			sb.append(", RCVER");
			sb.append(", SJ");
			sb.append(", SNDNG_RESULT_CODE");
			sb.append(", DSPTCH_DT");
			sb.append(", ATCH_FILE_ID");
			sb.append(") values (");

			// 메시지ID
			sb.append("'" + today + i + "'");

			// 이메일내용
			sb.append(", '이메일내용" + i + "'");

			// 발신자
			sb.append(", '발신자" + i + "'");

			// 수신자
			sb.append(", '수신자" + i + "'");

			// 제목
			sb.append(", '제목" + i + "'");

			// 발송결과코드
			sb.append(", null");

			// 발신일시
			sb.append(", sysdate");

			// 첨부파일ID
			sb.append(", null");

			sb.append(");\n");
		}

		System.out.println(sb);
	}

}
