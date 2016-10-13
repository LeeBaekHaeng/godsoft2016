package godsoft.com.sub.service.impl;

import godsoft.com.sub.service.Sub0102VO;

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
public class Sub0102DAOSelectKeyTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private Sub0102DAO sub0102DAO;

	@Test
	public void test() throws Exception {
		selectKey();
	}

	public void selectKey() throws Exception {
		Sub0102VO vo = new Sub0102VO();

		vo.setCodeId("COM001");

		Sub0102VO item = sub0102DAO.selectKey(vo);

		egovLogger.debug("item=" + item);
		egovLogger.debug("getCode=" + item.getCode());
		egovLogger.debug("getCodeNm=" + item.getCodeNm());
		egovLogger.debug("getCodeDc=" + item.getCodeDc());
	}

}
