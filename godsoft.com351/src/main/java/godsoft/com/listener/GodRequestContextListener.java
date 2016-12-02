package godsoft.com.listener;

import godsoft.com.cmm.util.GodUtils;

import javax.servlet.ServletRequestEvent;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextListener;

public class GodRequestContextListener extends RequestContextListener {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Override
	public void requestInitialized(ServletRequestEvent requestEvent) {
		super.requestInitialized(requestEvent);

		String schemeServerNameServerPortContextPath = (String) requestEvent
				.getServletContext().getAttribute(
						"schemeServerNameServerPortContextPath");

		egovLogger.debug("schemeServerNameServerPortContextPath="
				+ schemeServerNameServerPortContextPath);

		if (schemeServerNameServerPortContextPath == null) {
			HttpServletRequest request = (HttpServletRequest) requestEvent
					.getServletRequest();

			schemeServerNameServerPortContextPath = GodUtils
					.getSchemeServerNameServerPortContextPath(request);

			requestEvent.getServletContext().setAttribute(
					"schemeServerNameServerPortContextPath",
					schemeServerNameServerPortContextPath);

			egovLogger.debug("setAttribute="
					+ schemeServerNameServerPortContextPath);
		}
	}

	@Override
	public void requestDestroyed(ServletRequestEvent requestEvent) {
		super.requestDestroyed(requestEvent);
	}

}
