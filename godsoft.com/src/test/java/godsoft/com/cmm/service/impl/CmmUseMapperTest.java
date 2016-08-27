package godsoft.com.cmm.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.service.CmmnDetailCode;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/context-*.xml",
		"classpath:egovframework/spring/com/idgn/context-*.xml",
		"classpath:godsoft/spring/com/context-*.xml" })
public class CmmUseMapperTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private CmmUseMapper cmmUseMapper;

	@Test
	public void test() throws Exception {
		ComDefaultCodeVO vo = new ComDefaultCodeVO();
		vo.setCodeId("COM001");

		List<CmmnDetailCode> items = cmmUseMapper.selectCmmCodeDetail(vo);

		if (egovLogger.isDebugEnabled()) {
			egovLogger.debug("items=" + items);

			for (CmmnDetailCode item : items) {
				egovLogger.debug("getCodeNm=" + item.getCodeNm());
			}
		}
	}

}