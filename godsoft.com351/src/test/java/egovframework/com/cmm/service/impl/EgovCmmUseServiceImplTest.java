package egovframework.com.cmm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.com.cmm.service.EgovCmmUseService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
// @ContextConfiguration(locations = {
// "classpath:godsoft/spring/com/test-dao-context.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/test-dao-context.xml" })
public class EgovCmmUseServiceImplTest {

	protected Logger egovLogger = LoggerFactory
			.getLogger(EgovAbstractServiceImpl.class);

	// @Autowired
	@Resource(name = "EgovCmmUseService")
	private EgovCmmUseService egovCmmUseService;

	@Test
	public void test() {
		List<ComDefaultCodeVO> voList = new ArrayList<ComDefaultCodeVO>();

		ComDefaultCodeVO vo = new ComDefaultCodeVO();
		vo.setCodeId("COM001");
		voList.add(vo);

		vo = new ComDefaultCodeVO();
		vo.setCodeId("COM002");
		voList.add(vo);

		Map<String, List<CmmnDetailCode>> selectCmmCodeDetails = null;

		try {
			selectCmmCodeDetails = egovCmmUseService
					.selectCmmCodeDetails(voList);
		} catch (Exception e) {
			egovLogger.error(e.getMessage());
		}

		egovLogger.debug("selectCmmCodeDetails=" + selectCmmCodeDetails);

		List<CmmnDetailCode> COM001 = selectCmmCodeDetails.get("COM001");

		debug(COM001);
	}

	private void debug(List<CmmnDetailCode> items) {
		for (CmmnDetailCode item : items) {
			egovLogger.debug("item=" + item);
			egovLogger.debug("getCodeId=" + item.getCodeId());
			egovLogger.debug("getCodeIdNm=" + item.getCodeIdNm());
			egovLogger.debug("getCode=" + item.getCode());
			egovLogger.debug("getCodeNm=" + item.getCodeNm());
			egovLogger.debug("getCodeDc=" + item.getCodeDc());
			egovLogger.debug("getUseAt=" + item.getUseAt());
			egovLogger.debug("getFrstRegisterId=" + item.getFrstRegisterId());
			egovLogger.debug("getLastUpdusrId=" + item.getLastUpdusrId());
		}
	}

}
