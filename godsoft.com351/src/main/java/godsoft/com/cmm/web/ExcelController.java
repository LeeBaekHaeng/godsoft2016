package godsoft.com.cmm.web;

import egovframework.rte.fdl.string.EgovDateUtil;
import godsoft.com.cmm.service.impl.AdministCodeDAO;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExcelController {

	@Autowired
	private AdministCodeDAO administCodeDAO;

	@RequestMapping("/excelDownload.do")
	public String selectList(@RequestParam Map<String, Object> vo,
			ModelMap model) throws Exception {
		model.addAttribute("items", administCodeDAO.selectSidoList(vo));

		model.addAttribute("template",
				"godsoft/excel/com/cmm/시도_V1.0_20160928.xlsx");

		model.addAttribute(
				"filename",
				"시도-"
						+ EgovDateUtil.toString(new Date(),
								"yyyy-MM-dd HH-mm-ss", null) + ".xlsx");

		return "godsoft.com.cmm.web.GodsoftExcelView";
	}

}
