package godsoft.com.sub.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import godsoft.com.cmm.service.impl.CmmServiceImpl;
import godsoft.com.sub.service.Sub0103Service;

@Service
public class Sub0103ServiceImpl extends EgovAbstractServiceImpl implements
		Sub0103Service {

	@Autowired
	private Sub0103DAO sub0103DAO;

	// @Autowired
	// private GodPaginationInfoServiceImpl paginationInfoServiceImpl;

	@Autowired
	private CmmServiceImpl godCmmService;

	@Override
	public void selectList(Map<String, Object> vo, ModelMap model) {
		// vo.put("firstIndex", 0);
		// vo.put("recordCountPerPage", Integer.MAX_VALUE);

		// PaginationInfo paginationInfo = paginationInfoServiceImpl
		// .selectListPrefix(vo);
		PaginationInfo paginationInfo = godCmmService.selectListPrefix(vo);

		model.addAttribute("items", sub0103DAO.selectList(vo));

		paginationInfo.setTotalRecordCount(sub0103DAO.selectListCount(vo));
		model.addAttribute("paginationInfo", paginationInfo);
	}

	@Override
	public void select(Map<String, Object> vo, ModelMap model) {
		model.addAttribute("item2", sub0103DAO.select(vo));
		model.addAttribute("selectForEgovMap", sub0103DAO.selectForEgovMap(vo));
	}

}
