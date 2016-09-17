package godsoft.com.cmm.web;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.cmm.service.impl.AdministCodeDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdministCodeController {

	@Autowired
	private AdministCodeDAO administCodeDAO;

	@RequestMapping("/selectAdministCodeList.do")
	public String selectList(@RequestParam Map<String, Object> vo,
			ModelMap model) throws Exception {
		// List<EgovMap> selectAdministCodeList =
		// administCodeDAO.selectList(vo);
		//
		// model.addAttribute("selectAdministCodeList", selectAdministCodeList);

		return "godsoft/com/cmm/selectAdministCodeList";
	}

	@RequestMapping("/selectSidoList.do")
	public String selectSidoList(@RequestParam Map<String, Object> vo,
			ModelMap model) throws Exception {
		List<EgovMap> items = administCodeDAO.selectSidoList(vo);

		model.addAttribute("items", items);

		return "jsonView";
	}

	@RequestMapping("/selectSggList.do")
	public String selectSggList(@RequestParam Map<String, Object> vo,
			ModelMap model) throws Exception {
		List<EgovMap> items = administCodeDAO.selectSggList(vo);

		model.addAttribute("items", items);

		return "jsonView";
	}

	@RequestMapping("/selectUmdList.do")
	public String selectUmdList(@RequestParam Map<String, Object> vo,
			ModelMap model) throws Exception {
		List<EgovMap> items = administCodeDAO.selectUmdList(vo);

		model.addAttribute("items", items);

		return "jsonView";
	}

	@RequestMapping("/selectRiList.do")
	public String selectRiList(@RequestParam Map<String, Object> vo,
			ModelMap model) throws Exception {
		List<EgovMap> items = administCodeDAO.selectRiList(vo);

		model.addAttribute("items", items);

		return "jsonView";
	}

}
