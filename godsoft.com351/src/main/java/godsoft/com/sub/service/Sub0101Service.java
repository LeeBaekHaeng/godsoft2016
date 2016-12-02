package godsoft.com.sub.service;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface Sub0101Service {

	void selectList(Sub0101VO vo, ModelMap model);

	void insertFormMultipart(Sub0101VO vo, ModelMap model) throws Exception;

	void insertMultipart(Sub0101VO vo, ModelMap model,
			MultipartHttpServletRequest request) throws Exception;

	String getScheme();

}
