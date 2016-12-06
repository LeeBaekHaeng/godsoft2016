package egovframework.com.cmm.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.service.CmmnDetailCode;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
// @ContextConfiguration(locations = {
// "classpath:godsoft/spring/com/test-dao-context.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/test-dao-context.xml" })
public class CmmUseDAOTest {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	// @Resource(name = "cmmUseDAO")
	private CmmUseDAO cmmUseDAO;

	// @Test
	public void test() {
		ComDefaultCodeVO vo = new ComDefaultCodeVO();

		vo.setCodeId("COM001");

		List<CmmnDetailCode> items = null;

		try {
			items = cmmUseDAO.selectCmmCodeDetail(vo);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

		logger.debug("items=" + items);

		logger.debug("size=" + items.size());

		for (CmmnDetailCode item : items) {
			logger.debug("item=" + item);
			logger.debug("getCodeId=" + item.getCodeId());
			logger.debug("getCodeIdNm=" + item.getCodeIdNm());
			logger.debug("getCode=" + item.getCode());
			logger.debug("getCodeNm=" + item.getCodeNm());
			logger.debug("getCodeDc=" + item.getCodeDc());
			logger.debug("getUseAt=" + item.getUseAt());
			logger.debug("getFrstRegisterId=" + item.getFrstRegisterId());
			logger.debug("getLastUpdusrId=" + item.getLastUpdusrId());
		}
	}

	@Test
	public void test2() {
		ComDefaultCodeVO vo = new ComDefaultCodeVO();

		vo.setTableNm("ORGNZT_0000000000000");

		// vo.setHaveDetailCondition("Y");
		// vo.setDetailCondition("ORGNZT_0000000000000");

		List<CmmnDetailCode> items = null;

		try {
			items = cmmUseDAO.selectOgrnztIdDetail(vo);
		} catch (Exception e) {
			logger.error(e);
		}

		for (CmmnDetailCode item : items) {
			logger.debug("item=" + item);
			logger.debug("getCodeId=" + item.getCodeId());
			logger.debug("getCode=" + item.getCode());
			logger.debug("getCodeNm=" + item.getCodeNm());
			logger.debug("getCodeDc=" + item.getCodeDc());
		}
	}

}
