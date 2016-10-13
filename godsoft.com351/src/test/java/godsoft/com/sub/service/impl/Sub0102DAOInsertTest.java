package godsoft.com.sub.service.impl;

import egovframework.rte.fdl.string.EgovDateUtil;
import godsoft.com.sub.service.Sub0102VO;

import java.util.Date;
import java.util.HashMap;
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
public class Sub0102DAOInsertTest {

	// protected final Log logger = LogFactory.getLog(getClass());
	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private Sub0102DAO sub0102DAO;

	@Test
	public void test() throws Exception {
		insert();
		// insert2();
		// insert3();
	}

	public void insert() throws Exception {
		Sub0102VO vo = new Sub0102VO();

		// String today = EgovDateUtil.toString(new Date(), "", null);
		String today = EgovDateUtil.toString(new Date(), "MM/dd/yyyy HH:mm:ss",
				null);

		// vo.setCodeId("GOD001"); // 코드ID
		vo.setCodeId("COM001"); // 코드ID
		vo.setCode("01"); // 코드
		vo.setCodeNm("코드명01"); // 코드명
		vo.setCodeDc("코드설명01"); // 코드설명
		vo.setUseAt("Y"); // 사용여부
		// vo.setFrstRegistPnttm(null); // 최초등록시점
		vo.setFrstRegistPnttm(today); // 최초등록시점
		vo.setFrstRegisterId("SYSTEM2"); // 최초등록자ID
		vo.setLastUpdtPnttm(null); // 최종수정시점
		vo.setLastUpdusrId(null); // 최종수정자ID

		Object selectKey = sub0102DAO.insert(vo);

		egovLogger.debug("selectKey=" + selectKey);
	}

	public void insert2() throws Exception {
		Sub0102VO vo = new Sub0102VO();

		// String today = EgovDateUtil.toString(new Date(), "", null);
		String today = EgovDateUtil.toString(new Date(), "MM/dd/yyyy HH:mm:ss",
				null);

		// vo.setCodeId("GOD001"); // 코드ID
		vo.setCodeId("COM001"); // 코드ID
		vo.setCode("01"); // 코드
		vo.setCodeNm("코드명01"); // 코드명
		vo.setCodeDc("코드설명01"); // 코드설명
		vo.setUseAt("Y"); // 사용여부
		// vo.setFrstRegistPnttm(null); // 최초등록시점
		vo.setFrstRegistPnttm(today); // 최초등록시점
		vo.setFrstRegisterId("SYSTEM2"); // 최초등록자ID
		vo.setLastUpdtPnttm(null); // 최종수정시점
		vo.setLastUpdusrId(null); // 최종수정자ID

		Object selectKey = sub0102DAO.insert2(vo);

		egovLogger.debug("selectKey=" + selectKey);
	}

	public void insert3() throws Exception {
		Map<String, Object> vo = new HashMap<String, Object>();

		// String today = EgovDateUtil.toString(new Date(), "", null);
		String today = EgovDateUtil.toString(new Date(), "MM/dd/yyyy HH:mm:ss",
				null);

		// vo.setCodeId("GOD001"); // 코드ID
		vo.put("codeId", "COM001"); // 코드ID
		// vo.setCode("01"); // 코드
		// vo.setCodeNm("코드명01"); // 코드명
		// vo.setCodeDc("코드설명01"); // 코드설명
		// vo.setUseAt("Y"); // 사용여부
		// // vo.setFrstRegistPnttm(null); // 최초등록시점
		vo.put("frstRegistPnttm", today); // 최초등록시점
		// vo.setFrstRegisterId("SYSTEM2"); // 최초등록자ID
		// vo.setLastUpdtPnttm(null); // 최종수정시점
		// vo.setLastUpdusrId(null); // 최종수정자ID

		Object selectKey = sub0102DAO.insert3(vo);

		egovLogger.debug("selectKey=" + selectKey);
	}

}
