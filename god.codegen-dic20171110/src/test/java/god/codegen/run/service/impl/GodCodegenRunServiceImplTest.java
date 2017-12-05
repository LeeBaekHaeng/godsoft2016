package god.codegen.run.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;

import god.codegen.run.service.RunService;
import god.test.GodAbstractDAOTest;

public class GodCodegenRunServiceImplTest extends GodAbstractDAOTest {

	@Autowired
	private RunService runService;

	@Test
	public void test() throws Exception {
		StopWatch stopWatch = createStopWatch();

		getBeanDefinitionNames();

		runService.run();

		millis(stopWatch);
		logger.debug(stopWatch.prettyPrint());
	}

}
