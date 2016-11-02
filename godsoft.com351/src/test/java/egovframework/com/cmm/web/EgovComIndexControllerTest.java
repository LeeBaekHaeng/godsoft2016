package egovframework.com.cmm.web;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.com.cmm.IncludedCompInfoVO;
import egovframework.com.cmm.annotation.IncludedInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml",
		"file:src/main/webapp/WEB-INF/config/egovframework/springmvc/egov-com-servlet.xml" })
public class EgovComIndexControllerTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private ApplicationContext applicationContext;

	// @Test
	public void setLeftMenu() {
		Map<Integer, IncludedCompInfoVO> map = new TreeMap<Integer, IncludedCompInfoVO>();

		IncludedInfo includedInfo;
		IncludedCompInfoVO includedCompInfoVO;
		RequestMapping requestMapping;

		Map<String, Object> controllers = applicationContext
				.getBeansWithAnnotation(Controller.class);

		egovLogger.debug("controllers.size=" + controllers.size());

		for (Object controller : controllers.values()) {
			Class<? extends Object> controllerClass = controller.getClass();

			Method[] methods = controllerClass.getMethods();

			egovLogger.debug("controllerClass=" + controllerClass);

			for (int i = 0; i < methods.length; i++) {
				includedInfo = methods[i].getAnnotation(IncludedInfo.class);

				if (includedInfo != null) {
					includedCompInfoVO = new IncludedCompInfoVO();
					includedCompInfoVO.setName(includedInfo.name());
					includedCompInfoVO.setOrder(includedInfo.order());
					includedCompInfoVO.setGid(includedInfo.gid());

					requestMapping = methods[i]
							.getAnnotation(RequestMapping.class);

					if ("".equals(includedInfo.listUrl())) {
						includedCompInfoVO
								.setListUrl(requestMapping.value()[0]);
					} else {
						includedCompInfoVO.setListUrl(includedInfo.listUrl());
					}

					map.put(includedCompInfoVO.getOrder(), includedCompInfoVO);
				}
			}
		}

		egovLogger.debug("map=" + map);

		for (Integer key : map.keySet()) {
			egovLogger.debug(key + "=" + map.get(key));

			includedCompInfoVO = map.get(key);

			egovLogger.debug("key=" + key);
			egovLogger.debug("name=" + includedCompInfoVO.getName());
			egovLogger.debug("listUrl=" + includedCompInfoVO.getListUrl());
			egovLogger.debug("order=" + includedCompInfoVO.getOrder());
			egovLogger.debug("gid=" + includedCompInfoVO.getGid());
		}
	}

	@Test
	public void setLeftMenu2() {
		Map<String, Object> beansWithAnnotation = applicationContext
				.getBeansWithAnnotation(Controller.class);

		egovLogger.debug("controllers.size=" + beansWithAnnotation.size());

		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		for (Object beanWithAnnotation : beansWithAnnotation.values()) {
			Class<?> clazz = beanWithAnnotation.getClass();

			String packageName = clazz.getPackage().getName();

			if (packageName.indexOf("godsoft.com") == -1) {
				continue;
			}

			egovLogger.debug("package=" + packageName);

			Method[] methods = clazz.getMethods();

			for (Method method : methods) {
				// egovLogger.debug("method=" + method);
				// egovLogger.debug("getName=" + method.getName());

				RequestMapping requestMapping = method
						.getAnnotation(RequestMapping.class);

				if (requestMapping != null) {
					String[] value = requestMapping.value();

					egovLogger.debug("value=" + value);
					egovLogger.debug("length=" + value.length);
					egovLogger.debug("value[0]=" + value[0]);

					sb.append(value[0]);
					sb.append("\n");

					sb2.append(value[0].substring(0,
							value[0].lastIndexOf("/") + 1));
					sb2.append("\n");
				}
			}
		}

		egovLogger.debug(sb.toString());
		egovLogger.debug(sb2.toString());
	}

	// @Test
	public void getListableBeanFactory() {
		// getBeanDefinitionCount
		int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
		egovLogger.debug("beanDefinitionCount=" + beanDefinitionCount);

		// getBeanDefinitionNames
		String[] beanDefinitionNames = applicationContext
				.getBeanDefinitionNames();
		egovLogger.debug("beanDefinitionNames=" + beanDefinitionNames);
		for (String beanDefinitionName : beanDefinitionNames) {
			egovLogger.debug("beanDefinitionName=" + beanDefinitionName);
		}

		// getBeanNamesForAnnotation
		String[] beanNamesForAnnotation = applicationContext
				.getBeanNamesForAnnotation(RequestMapping.class);

		// beanNamesForAnnotation = applicationContext
		// .getBeanNamesForAnnotation(Controller.class);
		//
		// beanNamesForAnnotation = applicationContext
		// .getBeanNamesForAnnotation(Service.class);
		//
		// beanNamesForAnnotation = applicationContext
		// .getBeanNamesForAnnotation(Repository.class);

		egovLogger.debug("beanNamesForAnnotation=" + beanNamesForAnnotation);

		egovLogger.debug("beanNamesForAnnotation.length="
				+ beanNamesForAnnotation.length);

		for (String beanNameForAnnotation : beanNamesForAnnotation) {
			egovLogger.debug("beanNameForAnnotation=" + beanNameForAnnotation);
		}

		// getBeansWithAnnotation
		Map<String, Object> beansWithAnnotation = applicationContext
				.getBeansWithAnnotation(RequestMapping.class);

		egovLogger.debug("beansWithAnnotation=" + beansWithAnnotation);

		egovLogger.debug("beansWithAnnotation.size="
				+ beansWithAnnotation.size());

		for (Object beanWithAnnotation : beansWithAnnotation.values()) {
			egovLogger.debug("beanWithAnnotation=" + beanWithAnnotation);
		}
	}

}
