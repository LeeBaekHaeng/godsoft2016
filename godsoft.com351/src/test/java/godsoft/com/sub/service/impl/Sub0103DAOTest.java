package godsoft.com.sub.service.impl;

import egovframework.rte.fdl.string.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.sub.service.Sub0103VO;

import java.util.Date;
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

	// @Test
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

	@Test
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
