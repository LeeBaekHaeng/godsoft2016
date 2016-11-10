package godsoft.com.sub.web;

import godsoft.com.sub.service.Sub0101Service;
import godsoft.com.sub.service.Sub0101VO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * 서브0101 Controller
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@Controller
public class Sub0101Controller {

	@Autowired
	private Sub0101Service sub0101Service;

	@RequestMapping("/sub/selectSub0101List.do")
	public String selectList(Sub0101VO vo, ModelMap model) throws Exception {
		return "godsoft/com/sub/selectSub0101List";
	}

	@RequestMapping("/sub/insertFormMultipartSub0101.do")
	public String insertFormMultipart(Sub0101VO vo, ModelMap model)
			throws Exception {
		sub0101Service.insertFormMultipart(vo, model);
		return "godsoft/com/sub/insertFormMultipartSub0101";
	}

	@RequestMapping("/sub/insertMultipartSub0101.do")
	public String insertMultipart(Sub0101VO vo, ModelMap model,
			MultipartHttpServletRequest request) throws Exception {
		sub0101Service.insertMultipart(vo, model, request);
		// return "godsoft/com/sub/insertMultipartSub0101";
		return "jsonView";
	}

}
