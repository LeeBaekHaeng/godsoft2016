package godsoft.com.cmm.service;

import egovframework.com.cmm.service.EgovProperties;
import egovframework.com.cmm.service.Globals;

public class GodGlobals extends Globals {

	public static final String WEB_PATH = EgovProperties
			.getProperty("Globals.webPath");

	public static final String CONTEXT_PATH = EgovProperties
			.getProperty("Globals.contextPath");

}
