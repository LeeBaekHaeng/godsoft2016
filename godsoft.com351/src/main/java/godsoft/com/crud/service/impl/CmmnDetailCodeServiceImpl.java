package godsoft.com.crud.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import godsoft.com.crud.service.CmmnDetailCodeService;

@Service
public class CmmnDetailCodeServiceImpl extends EgovAbstractServiceImpl
		implements CmmnDetailCodeService {

	@Autowired
	private CmmnDetailCodeDAO cmmnDetailCodeDAO;

	@Override
	public void code(CmmnDetailCode vo, ModelMap model) {
		// Map<String, List<CmmnDetailCode>> cmmnDetailCodeMap = new
		// HashMap<String, List<CmmnDetailCode>>();

		Map<String, List<CmmnDetailCode>> cmmnDetailCodeMap = new LinkedHashMap<String, List<CmmnDetailCode>>();

		// CmmnDetailCode vo = new CmmnDetailCode();

		vo.setUseAt("Y");

		List<CmmnDetailCode> items = cmmnDetailCodeDAO
				.selectListForCmmnDetailCode(vo);

		egovLogger.debug("items=" + items);

		egovLogger.debug("size=" + items.size());

		// codeA1(items, cmmnDetailCodeMap);
		//
		// codeA2(items, cmmnDetailCodeMap);

		codeB1(items, cmmnDetailCodeMap);

		model.addAttribute("cmmnDetailCodeMap", cmmnDetailCodeMap);
	}

	public void debug(CmmnDetailCode item) {
		egovLogger.debug("item=" + item);
		egovLogger.debug("getCodeId=" + item.getCodeId());
		egovLogger.debug("getCode=" + item.getCode());
		egovLogger.debug("getCodeNm=" + item.getCodeNm());
		egovLogger.debug("getCodeDc=" + item.getCodeDc());
		egovLogger.debug("getUseAt=" + item.getUseAt());
		egovLogger.debug("getFrstRegisterId=" + item.getFrstRegisterId());
		egovLogger.debug("getLastUpdusrId=" + item.getLastUpdusrId());
	}

	public void codeA1(List<CmmnDetailCode> items,
			Map<String, List<CmmnDetailCode>> cmmnDetailCodeMap) {
		for (CmmnDetailCode item : items) {
			debug(item);

			cmmnDetailCodeMap.put(item.getCodeId(), null);
		}
	}

	public void codeA2(List<CmmnDetailCode> items,
			Map<String, List<CmmnDetailCode>> cmmnDetailCodeMap) {
		for (String key : cmmnDetailCodeMap.keySet()) {
			egovLogger.debug(key + "=" + cmmnDetailCodeMap.get(key));

			List<CmmnDetailCode> cmmnDetailCodes = new ArrayList<CmmnDetailCode>();

			for (CmmnDetailCode item : items) {
				debug(item);

				if (item.getCodeId().equals(key)) {
					cmmnDetailCodes.add(item);
				}
			}

			cmmnDetailCodeMap.put(key, cmmnDetailCodes);
		}
	}

	public void codeB1(List<CmmnDetailCode> items,
			Map<String, List<CmmnDetailCode>> cmmnDetailCodeMap) {
		String codeId2 = null;

		List<CmmnDetailCode> cmmnDetailCodes = null;

		for (CmmnDetailCode item : items) {
			// debug(item);

			if (item.getCodeId().equals(codeId2)) {
				cmmnDetailCodes.add(item);
			} else {
				cmmnDetailCodeMap.put(codeId2, cmmnDetailCodes);

				cmmnDetailCodes = new ArrayList<CmmnDetailCode>();

				cmmnDetailCodes.add(item);
			}

			codeId2 = item.getCodeId();
		}

		cmmnDetailCodeMap.put(codeId2, cmmnDetailCodes);
	}

}
