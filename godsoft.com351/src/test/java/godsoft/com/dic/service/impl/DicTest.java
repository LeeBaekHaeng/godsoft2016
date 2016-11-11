package godsoft.com.dic.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.rte.fdl.excel.EgovExcelService;
import egovframework.rte.fdl.excel.util.EgovExcelUtil;
import egovframework.rte.fdl.string.EgovDateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/context-excel.xml" })
public class DicTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private EgovExcelService egovExcelService;

	@Test
	public void test() throws Exception {
		// final String FILEPATH_01 = SystemUtils.USER_HOME
		// + "/Documents/1table.xls";
		// final String FILEPATH_02 = SystemUtils.USER_HOME
		// + "/Documents/column.xls";
		//
		// Workbook tableWorkbook = egovExcelService.loadWorkbook(FILEPATH_01);
		// Sheet tableSheet1 = tableWorkbook.getSheetAt(0);
		//
		// Workbook columnWorkbook = egovExcelService.loadWorkbook(FILEPATH_02);
		// Sheet columnSheet1 = columnWorkbook.getSheetAt(0);
		//
		// tableSheet1(tableSheet1);
		// columnSheet1(columnSheet1);
		//
		// FileUtils.forceDeleteOnExit(new File(SystemUtils.USER_HOME
		// + "/Desktop/sql"));
		//
		// tables(tableSheet1, columnSheet1);

		DicVO vo = new DicVO();

		vo.setFilepathTable(SystemUtils.USER_HOME + "/Documents/table.xls");

		vo.setFilepathColumn(SystemUtils.USER_HOME + "/Documents/column.xls");

		String yyyyMMdd = EgovDateUtil.toString(new Date(), "yyyyMMdd", null);

		loadWorkbook(vo);

		getTablesMap(vo);
	}

	private void loadWorkbook(DicVO vo) throws Exception {
		Workbook workbookTable = egovExcelService.loadWorkbook(vo
				.getFilepathTable());
		Sheet sheet1Table = workbookTable.getSheetAt(0);

		Workbook workbookColumn = egovExcelService.loadWorkbook(vo
				.getFilepathColumn());
		Sheet sheet1Column = workbookColumn.getSheetAt(0);

		setTablesMap(vo, sheet1Table, sheet1Column);
	}

	private void setTablesMap(DicVO vo, Sheet sheet1Table, Sheet sheet1Column) {
		vo.setTablesMap(new LinkedHashMap<String, TablesVO>());

		for (Row row : sheet1Table) {
			int rowNum = row.getRowNum();

			if (rowNum == 0) {
				continue;
			}

			// OWNER
			String owner = EgovExcelUtil.getValue(row.getCell(0));

			// TABLE_NAME
			String tableName = EgovExcelUtil.getValue(row.getCell(1));

			// TABLE_COMMENT
			String tableComment = EgovExcelUtil.getValue(row.getCell(2));

			// TABLE_CAMEL_CASE
			String be = EgovExcelUtil.getValue(row.getCell(3));

			// TABLE_PASCAL_CASE
			String bf = EgovExcelUtil.getValue(row.getCell(4));

			TablesVO tablesVO = new TablesVO();
			tablesVO.setOwner(owner);
			tablesVO.setTableName(tableName);
			tablesVO.setTableComment(tableComment);
			// tablesVO.setYyyyMMdd(yyyyMMdd);

			vo.getTablesMap().put(tableName, tablesVO);

			setTabColsVO(vo, sheet1Column, tableName);
		}
	}

	private void setTabColsVO(DicVO vo, Sheet sheet1Column, String tableName2) {
		List<TabColsVO> tabColsVOs = new ArrayList<TabColsVO>();

		for (Row row : sheet1Column) {
			int rowNum = row.getRowNum();

			if (rowNum == 0) {
				continue;
			}

			// OWNER
			String owner = EgovExcelUtil.getValue(row.getCell(0));

			// TABLE_NAME
			String tableName = EgovExcelUtil.getValue(row.getCell(1));

			// COLUMN_NAME
			String columnName = EgovExcelUtil.getValue(row.getCell(2));

			// TABLE_COMMENT
			String tableComment = EgovExcelUtil.getValue(row.getCell(9));

			// COLUMN_COMMENT
			String columnComment = EgovExcelUtil.getValue(row.getCell(10));

			// TABLE_CAMEL_CASE
			String be = EgovExcelUtil.getValue(row.getCell(56));

			// TABLE_PASCAL_CASE
			String bf = EgovExcelUtil.getValue(row.getCell(57));

			String bg = EgovExcelUtil.getValue(row.getCell(58));
			String bh = EgovExcelUtil.getValue(row.getCell(59));

			if (tableName.equals(tableName2)) {
				TabColsVO tabColsVO = new TabColsVO();
				tabColsVO.setColumnName(columnName);
				tabColsVO.setColumnComment(columnComment);

				tabColsVOs.add(tabColsVO);
			}
		}

		vo.getTablesMap().get(tableName2).setTabColsVOs(tabColsVOs);
	}

	private void writeStringToFile(TablesVO tablesVO) {
		// tablesVO.setSqlCd("selectList");

		// writeStringToFile(new File(pathname(tablesVO)),
		// SqlSelectList.sql(columnSheet1, tableName), "utf-8");

		// System.out.println(DicSelect.select(columnSheet1, b));

		// System.out.println(DicInsert.insert(columnSheet1, b));
		// System.out.println(DicInsert.insertIbatis(columnSheet1, b));

		// System.out.println(DicUpdate.update(columnSheet1, b));
		// System.out.println(DicUpdate.updateIbatis(columnSheet1, b));

		// System.out.println(DicDelete.sql(columnSheet1, b));
		// System.out.println(SqlDelete.ibatis(columnSheet1, b));
	}

	private void tableSheet1(Sheet sheet) {
		for (Row row : sheet) {
			int rowNum = row.getRowNum();

			if (rowNum == 1) {
				break;
			}

			for (Cell cell : row) {
				egovLogger.debug("getValue=" + EgovExcelUtil.getValue(cell));
				egovLogger.debug("getColumnIndex=" + cell.getColumnIndex());
			}
		}
	}

	private void columnSheet1(Sheet sheet) {
		row: for (Row row : sheet) {
			int rowNum = row.getRowNum();

			if (rowNum == 1) {
				break row;
			}

			for (Cell cell : row) {
				egovLogger.debug("getValue=" + EgovExcelUtil.getValue(cell));
				egovLogger.debug("getColumnIndex=" + cell.getColumnIndex());
			}
		}
	}

	private String pathname(TablesVO tablesVO) {
		String tableComment = tablesVO.getTableComment().replaceAll("/", "");

		StringBuffer sb = new StringBuffer();
		sb.append(SystemUtils.USER_HOME);

		sb.append(File.separator);
		sb.append("Desktop");

		sb.append(File.separator);
		sb.append("sql");

		sb.append(File.separator);
		sb.append(tablesVO.getTableName());

		sb.append(" ");
		sb.append(tableComment);

		sb.append(File.separator);
		sb.append(tablesVO.getTableName());

		sb.append(" ");
		sb.append(tableComment);

		sb.append("-");
		// sb.append(tablesVO.getSqlCd());

		sb.append("_V1.0");

		sb.append("_");
		// sb.append(tablesVO.getYyyyMMdd());

		sb.append(".sql");

		return sb.toString();
	}

	private void writeStringToFile(File file, String data, String encoding) {
		try {
			FileUtils.writeStringToFile(file, data, encoding);
		} catch (IOException e) {
			egovLogger.error(e.getMessage());
		}
	}

	private void getTablesMap(DicVO vo) {
		for (String key : vo.getTablesMap().keySet()) {
			egovLogger.debug(key + "="
					+ vo.getTablesMap().get(key).getTableComment());

			List<TabColsVO> tabColsVOs = vo.getTablesMap().get(key)
					.getTabColsVOs();

			for (TabColsVO tabColsVO : tabColsVOs) {
				egovLogger.debug(tabColsVO.getColumnName());
				egovLogger.debug(tabColsVO.getColumnComment());
			}
		}
	}

}
