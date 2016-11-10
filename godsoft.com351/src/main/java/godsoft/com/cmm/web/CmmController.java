package godsoft.com.cmm.web;

import godsoft.com.cmm.service.GodCmmService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CmmController {

	@Autowired
	private GodCmmService godCmmService;

	@RequestMapping("/cmm/selectMenuList.do")
	public String selectMenuList(@RequestParam Map<String, Object> vo,
			ModelMap model) throws Exception {
		godCmmService.selectMenuList(vo, model);
		return "godsoft/com/cmm/selectMenuList";
	}

}
