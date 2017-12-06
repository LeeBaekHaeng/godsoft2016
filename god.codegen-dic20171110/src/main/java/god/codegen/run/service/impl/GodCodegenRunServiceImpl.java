package god.codegen.run.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.SystemUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.string.EgovDateUtil;
import god.codegen.crud.sys.alltabcols.service.AllTabColsService;
import god.codegen.crud.sys.alltabcols.service.AllTabColsVO;
import god.codegen.crud.sys.alltabcomments.service.AllTabCommentsService;
import god.codegen.crud.sys.alltabcomments.service.AllTabCommentsVO;
import god.codegen.run.service.RunService;

@Service
public class GodCodegenRunServiceImpl extends EgovAbstractServiceImpl implements RunService {

	@Autowired
	private AllTabCommentsService allTabCommentsService;

	@Autowired
	private AllTabColsService allTabColsService;

	@Override
	public void run() throws Exception {
		AllTabCommentsVO vo = new AllTabCommentsVO();
		List<String> owners = new ArrayList<String>();
		owners.add("SYS");
		// owners.add("TEST");
		// owners.add("TEST2");
		vo.setOwners(owners);

		List<String> tableNames = new ArrayList<String>();
		tableNames.add("ALL_TAB_COMMENTS");
		// tableNames.add("ALL_TABLES");

		// tableNames.add("ALL_OBJECTS");

		tableNames.add("ALL_TAB_COLS");
		tableNames.add("ALL_COL_COMMENTS");

		// tableNames.add("ALL_CONSTRAINTS");
		tableNames.add("ALL_CONS_COLUMNS");

		tableNames.add("ALL_INDEXES");
		vo.setTableNames(tableNames);

		String filepath = SystemUtils.USER_HOME + "/Desktop/god.codegen/god "
				+ EgovDateUtil.toString(new Date(), "yyyy-MM-dd HH-mm-ss", null);
		vo.setFilepath(filepath);

		allTabCommentsService.createWorkbook(vo);

		AllTabColsVO allTabColsVO = new AllTabColsVO();
		BeanUtils.copyProperties(vo, allTabColsVO);
		allTabColsService.createWorkbook(allTabColsVO);
	}

}
