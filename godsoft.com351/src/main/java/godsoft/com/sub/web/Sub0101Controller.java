package godsoft.com.sub.web;

import godsoft.com.sub.service.Sub0101VO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 서브0101 Controller
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@Controller
public class Sub0101Controller {

	@RequestMapping("/selectSub0101List.do")
	public String selectList(Sub0101VO vo, ModelMap model) {
		return "godsoft/com/sub/selectSub0101List";
	}

}
