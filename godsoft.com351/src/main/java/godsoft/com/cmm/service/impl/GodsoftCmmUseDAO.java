package godsoft.com.cmm.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.service.CmmnDetailCode;

@Repository
public class GodsoftCmmUseDAO extends
		GodsoftGenericDAO<ComDefaultCodeVO, CmmnDetailCode> {

	@Override
	public void postConstruct() {
		super.postConstruct();

		queryId.put("selectList", "CmmUseDAO.selectCmmCodeDetail");
	}

	@Override
	public List<CmmnDetailCode> selectList(ComDefaultCodeVO vo)
			throws Exception {
		return super.selectList(vo);
	}

}
