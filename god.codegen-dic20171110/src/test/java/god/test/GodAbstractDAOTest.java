package god.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StopWatch;

import egovframework.rte.psl.dataaccess.util.EgovMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:egovframework/spring/**/context-*.xml" })
public class GodAbstractDAOTest {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	protected ApplicationContext applicationContext;

	protected void getBeanDefinitionNames() {
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

		for (String beanDefinitionName : beanDefinitionNames) {
			logger.debug("beanDefinitionName=" + beanDefinitionName);
		}
	}

	protected StopWatch createStopWatch() {
		StopWatch stopWatch = new StopWatch("Stop Watch");
		stopWatch.start();
		return stopWatch;
	}

	protected long millis(StopWatch stopWatch) {
		stopWatch.stop();
		long time = stopWatch.getLastTaskTimeMillis();
		stopWatch.start();
		return time;
	}

	protected void debugResults(List<EgovMap> results) {
		for (EgovMap result : results) {
			// logger.debug("keyList=" + result.keyList());
			// logger.debug("keySet=" + result.keySet());

			@SuppressWarnings("unchecked")
			List<String> keyList = result.keyList();

			for (String key : keyList) {
				logger.debug(key + "=" + result.get(key));
			}

			// @SuppressWarnings("unchecked")
			// Set<String> keySet = result.keySet();
			//
			// for (String key : keySet) {
			// logger.debug(key + "=" + result.get(key));
			// }
		}
	}

}
