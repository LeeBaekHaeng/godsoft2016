package egovframework.rte.fdl.excel.impl;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.rte.fdl.excel.EgovExcelService;
import egovframework.rte.fdl.excel.util.EgovExcelUtil;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/context-excel.xml" })
public class EgovExcelServiceImplTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private EgovExcelService egovExcelService;

	@Test
	public void test() throws Exception {
		String filepath = new ClassPathResource(
				"godsoft/excel/com/table/권한롤관계_V1.0_20161109.xlsx").getFile()
				.getCanonicalPath();

		XSSFWorkbook wb = null;

		wb = egovExcelService.loadWorkbook(filepath, wb);

		for (Sheet sheet : wb) {
			for (Row row : sheet) {
				for (Cell cell : row) {
					egovLogger.debug("cell=" + cell);
					egovLogger.debug("getSheetName="
							+ cell.getSheet().getSheetName());
					egovLogger.debug("getRowIndex=" + cell.getRowIndex());
					egovLogger.debug("getColumnIndex=" + cell.getColumnIndex());
					egovLogger
							.debug("getValue=" + EgovExcelUtil.getValue(cell));
				}
			}
		}
	}

}
