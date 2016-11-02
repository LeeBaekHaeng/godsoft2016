package godsoft.com.sub.web;

import godsoft.com.sub.service.Sub0103Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 서브0103 Controller
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@Controller
public class Sub0103Controller {

	@Autowired
	private Sub0103Service sub0103Service;

	@RequestMapping("/selectSub0103List.do")
	public String selectList(@RequestParam Map<String, Object> vo,
			ModelMap model) throws Exception {
		sub0103Service.selectList(vo, model);
		return "godsoft/com/sub/selectSub0103List";
	}

	@RequestMapping("/updateFormSub0103.do")
	public String updateForm(@RequestParam Map<String, Object> vo,
			ModelMap model) {
		sub0103Service.select(vo, model);
		return "godsoft/com/sub/updateFormSub0103";
	}

}
