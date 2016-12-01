package godsoft.com.cmm.web;

import godsoft.com.cmm.service.CmmService;
import godsoft.com.cmm.service.CmmVO;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class CmmController {

	@Autowired
	private CmmService cmmService;

	@RequestMapping("/cmm/selectMenuList.do")
	public String selectMenuList(@RequestParam Map<String, Object> vo,
			ModelMap model) throws Exception {
		cmmService.selectMenuList(vo, model);
		return "godsoft/com/cmm/selectMenuList";
	}

	@RequestMapping("/cmm/mergeFileInfs.do")
	public String mergeFileInfs(CmmVO vo, ModelMap model,
			MultipartHttpServletRequest request) {
		cmmService.mergeFileInfs(vo, model, request);
		return "jsonView";
	}

	@RequestMapping("/cmm/test.do")
	public String test(CmmVO vo, ModelMap model, HttpServletRequest request) {
		model.addAttribute("scheme", request.getScheme());
		return "jsonView";
	}

}
