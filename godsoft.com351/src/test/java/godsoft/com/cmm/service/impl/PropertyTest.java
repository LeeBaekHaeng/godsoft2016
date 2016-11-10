package godsoft.com.cmm.service.impl;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.rte.fdl.property.EgovPropertyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/test-property-context.xml" })
public class PropertyTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	// messageSource

	//
	// egovMessageSource

	@Autowired
	private EgovPropertyService propertiesService;

	@Autowired
	private EgovMessageSource egovMessageSource;

	@Autowired
	private MessageSource messageSource;

	@Autowired
	private Environment env;

	// @Test
	public void test() {
		egovLogger.debug("pageUnit=" + propertiesService.getInt("pageUnit"));
		egovLogger.debug("pageSize=" + propertiesService.getInt("pageSize"));

		// egovLogger.debug("pageUnit=" +
		// propertiesService.getLong("pageUnit"));
		// egovLogger.debug("pageSize=" +
		// propertiesService.getLong("pageSize"));

		// egovLogger.debug("pageUnit=" +
		// propertiesService.getFloat("pageUnit"));
		// egovLogger.debug("pageSize=" +
		// propertiesService.getFloat("pageSize"));

		// egovLogger.debug("pageUnit=" +
		// propertiesService.getDouble("pageUnit"));
		// egovLogger.debug("pageSize=" +
		// propertiesService.getDouble("pageSize"));

		// egovLogger.debug("pageUnit=" +
		// propertiesService.getString("pageUnit"));
		// egovLogger.debug("pageSize=" +
		// propertiesService.getString("pageSize"));

		Iterator<?> keys = propertiesService.getKeys();

		while (keys.hasNext()) {
			Object key = keys.next();

			egovLogger.debug("key=" + key);
		}

		Collection<?> allKeyValue = propertiesService.getAllKeyValue();

		for (Object keyValue : allKeyValue) {
			egovLogger.debug("keyValue=" + keyValue);
		}
	}

	@Test
	public void test2() {
		egovLogger.debug(egovMessageSource.getMessage("fail.common.msg"));

		ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource = egovMessageSource
				.getReloadableResourceBundleMessageSource();

		Locale locale = Locale.getDefault();
		ResourceBundle bundle = ResourceBundle.getBundle(
				"egovframework.message.com.message-common", locale);

		egovLogger.debug("bundle=" + bundle);

		Enumeration<String> keys = bundle.getKeys();

		for (Enumeration<String> e = keys; e.hasMoreElements();) {
			String key = e.nextElement();

			egovLogger.debug(key + "=" + egovMessageSource.getMessage(key));
		}
	}

}
