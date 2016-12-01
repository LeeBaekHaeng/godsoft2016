package godsoft.com.listener;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.mail.EmailException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import egovframework.com.cop.ems.service.EgovMultiPartEmail;
import egovframework.rte.fdl.string.EgovDateUtil;

public class GodServletContextListener implements ServletContextListener {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	private EgovMultiPartEmail egovMultiPartEmail;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("WAS 시작");

		ServletContext sc = sce.getServletContext();

		WebApplicationContext webApplicationContext = WebApplicationContextUtils
				.getWebApplicationContext(sc);

		egovMultiPartEmail = (EgovMultiPartEmail) webApplicationContext
				.getBean("egovMultiPartEmail");

		// send2();

		// try {
		// test();
		// } catch (Exception e) {
		// egovLogger.error(e.getMessage());
		// }
	}

	private void test() throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet(
					"http://localhost:8080/com351/cmm/test.do");

			System.out.println("Executing request " + httpget.getRequestLine());

			// Create a custom response handler
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

				@Override
				public String handleResponse(final HttpResponse response)
						throws ClientProtocolException, IOException {
					int status = response.getStatusLine().getStatusCode();
					if (status >= 200 && status < 300) {
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity)
								: null;
					} else {
						throw new ClientProtocolException(
								"Unexpected response status: " + status);
					}
				}

			};
			String responseBody = httpclient.execute(httpget, responseHandler);
			System.out.println("----------------------------------------");
			System.out.println(responseBody);
		} finally {
			httpclient.close();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("WAS 중지");

		ServletContext sc = sce.getServletContext();

		WebApplicationContext webApplicationContext = WebApplicationContextUtils
				.getWebApplicationContext(sc);

		egovMultiPartEmail = (EgovMultiPartEmail) webApplicationContext
				.getBean("egovMultiPartEmail");

		// send();
	}

	private void send() {
		try {
			String addTo = "dlqorgod@naver.com";
			String subject = "WAS 종료 "
					+ EgovDateUtil.toString(new Date(), null, null);
			String msg = subject;

			String send = egovMultiPartEmail.send(addTo, subject, msg);

			egovLogger.debug("send=" + send);
		} catch (EmailException e) {
			egovLogger.error(e.getMessage());
		}
	}

	private void send2() {
		try {
			String addTo = "dlqorgod@naver.com";
			String subject = "WAS 시작 "
					+ EgovDateUtil.toString(new Date(), null, null);
			String msg = subject;

			String send = egovMultiPartEmail.send(addTo, subject, msg);

			egovLogger.debug("send=" + send);
		} catch (EmailException e) {
			egovLogger.error(e.getMessage());
		}
	}

}
