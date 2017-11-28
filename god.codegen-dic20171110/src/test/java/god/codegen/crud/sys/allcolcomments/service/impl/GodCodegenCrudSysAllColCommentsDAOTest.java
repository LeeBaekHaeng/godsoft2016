package god.codegen.crud.sys.allcolcomments.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;

import egovframework.rte.fdl.excel.EgovExcelService;
import egovframework.rte.fdl.excel.impl.EgovExcelServiceImpl;
import egovframework.rte.fdl.string.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.codegen.crud.sys.allcolcomments.service.AllColCommentsVO;
import god.test.GodAbstractDAOTest;

public class GodCodegenCrudSysAllColCommentsDAOTest extends GodAbstractDAOTest {

	@Autowired
	private GodCodegenCrudSysAllColCommentsDAO dao;

	// @Autowired
	// @Qualifier("excelZipService")
	private EgovExcelService egovExcelService;

	@Test
	public void test() throws Exception {
		StopWatch stopWatch = createStopWatch();

		egovExcelService = new EgovExcelServiceImpl();

		getBeanDefinitionNames();

		selectList();

		millis(stopWatch);
		logger.debug(stopWatch.prettyPrint());
	}

	public void selectList() throws Exception {
		logger.debug("EgovDateUtil.toString: " + EgovDateUtil.toString(new Date(), "", null));

		AllColCommentsVO vo = new AllColCommentsVO();

		List<String> owners = new ArrayList<String>();
		owners.add("TEST");
		vo.setOwners(owners);

		List<String> tableNames = new ArrayList<String>();
		tableNames.add("COMTCCMMNCLCODE");
		tableNames.add("COMTCCMMNCODE");
		tableNames.add("COMTCCMMNDETAILCODE");
		vo.setTableNames(tableNames);

		List<EgovMap> results = dao.selectList(vo);

		logger.debug("results=" + results);

		// debugResults(results);

		createWorkbook(results);
	}

	@SuppressWarnings("unchecked")
	public void createWorkbook(List<EgovMap> results) throws Exception {
		// String templateName = "";
		// Workbook wb = egovExcelService.loadExcelTemplate(templateName);

		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet("Sheet1");

		header(sheet);

		int rownum = 1;

		for (EgovMap result : results) {
			Row row = sheet.createRow(rownum);

			// @SuppressWarnings("unchecked")
			List<String> keyList = result.keyList();

			int column = 0;

			for (String key : keyList) {
				logger.debug(key + "=" + result.get(key));

				Cell cell = row.createCell(column);
				// cell.setCellValue(result.get(key).toString());
				cell.setCellValue(MapUtils.getString(result, key));

				column++;
			}

			rownum++;
		}

		String filepath = SystemUtils.USER_HOME + "/Desktop/god.codegen/ALL_COL_COMMENTS "
				+ EgovDateUtil.toString(new Date(), "yyyy-MM-dd HH-mm-ss", null) + ".xls";
		wb = egovExcelService.createWorkbook(wb, filepath);
	}

	public void header(Sheet sheet) {
		int rownum = 0;

		Row row = sheet.createRow(rownum);

		int column = 0;

		Cell cell = row.createCell(column++);
		cell.setCellValue("OWNER");

		cell = row.createCell(column++);
		cell.setCellValue("TABLE_NAME");

		cell = row.createCell(column++);
		cell.setCellValue("COLUMN_NAME");

		cell = row.createCell(column++);
		cell.setCellValue("COMMENTS");

	}

}
