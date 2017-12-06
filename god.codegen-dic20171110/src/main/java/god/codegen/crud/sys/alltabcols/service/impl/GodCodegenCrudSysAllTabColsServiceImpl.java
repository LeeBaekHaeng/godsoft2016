package god.codegen.crud.sys.alltabcols.service.impl;

import java.util.List;

import org.apache.commons.collections4.MapUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.excel.EgovExcelService;
import egovframework.rte.fdl.excel.impl.EgovExcelServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.codegen.crud.sys.alltabcols.service.AllTabColsService;
import god.codegen.crud.sys.alltabcols.service.AllTabColsVO;

@Service
public class GodCodegenCrudSysAllTabColsServiceImpl extends EgovAbstractServiceImpl implements AllTabColsService {

	@Autowired
	private GodCodegenCrudSysAllTabColsDAO dao;

	private EgovExcelService egovExcelService = new EgovExcelServiceImpl();

	@Override
	public List<EgovMap> selectList(AllTabColsVO vo) throws Exception {
		return dao.selectList(vo);
	}

	@Override
	public void createWorkbook(AllTabColsVO vo) throws Exception {
		List<EgovMap> results = dao.selectList(vo);

		createWorkbook(vo, results);
	}

	@SuppressWarnings("unchecked")
	private void createWorkbook(AllTabColsVO vo, List<EgovMap> results) throws Exception {
		String sheetname = "ALL_TAB_COLS";

		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet(sheetname);

		header(sheet);

		int rownum = 1;

		for (EgovMap result : results) {
			Row row = sheet.createRow(rownum);

			// @SuppressWarnings("unchecked")
			List<String> keyList = result.keyList();

			int column = 0;

			for (String key : keyList) {
				Cell cell = row.createCell(column);
				// cell.setCellValue(result.get(key).toString());
				cell.setCellValue(MapUtils.getString(result, key));

				column++;
			}

			rownum++;
		}

		for (int i = 0, lastCellNum = sheet.getRow(0).getLastCellNum(); i < lastCellNum; i++) {
			sheet.autoSizeColumn(i);
		}

		String filepath = vo.getFilepath() + "/" + sheetname + ".xls";
		wb = egovExcelService.createWorkbook(wb, filepath);
	}

	private void header(Sheet sheet) {
		int rownum = 0;

		Row row = sheet.createRow(rownum);

		int column = 0;

		Cell cell = null;

		cell = row.createCell(column++);
		cell.setCellValue("OWNER");

		cell = row.createCell(column++);
		cell.setCellValue("TABLE_NAME");

		cell = row.createCell(column++);
		cell.setCellValue("COLUMN_NAME");

		cell = row.createCell(column++);
		cell.setCellValue("DATA_TYPE");

		cell = row.createCell(column++);
		cell.setCellValue("DATA_TYPE_MOD");

		cell = row.createCell(column++);
		cell.setCellValue("DATA_TYPE_OWNER");

		cell = row.createCell(column++);
		cell.setCellValue("DATA_LENGTH");

		cell = row.createCell(column++);
		cell.setCellValue("DATA_PRECISION");

		cell = row.createCell(column++);
		cell.setCellValue("DATA_SCALE");

		cell = row.createCell(column++);
		cell.setCellValue("NULLABLE");

		cell = row.createCell(column++);
		cell.setCellValue("COLUMN_ID");

		cell = row.createCell(column++);
		cell.setCellValue("DEFAULT_LENGTH");

		cell = row.createCell(column++);
		cell.setCellValue("DATA_DEFAULT");

		cell = row.createCell(column++);
		cell.setCellValue("NUM_DISTINCT");

		cell = row.createCell(column++);
		cell.setCellValue("LOW_VALUE");

		cell = row.createCell(column++);
		cell.setCellValue("HIGH_VALUE");

		cell = row.createCell(column++);
		cell.setCellValue("DENSITY");

		cell = row.createCell(column++);
		cell.setCellValue("NUM_NULLS");

		cell = row.createCell(column++);
		cell.setCellValue("NUM_BUCKETS");

		cell = row.createCell(column++);
		cell.setCellValue("LAST_ANALYZED");

		cell = row.createCell(column++);
		cell.setCellValue("SAMPLE_SIZE");

		cell = row.createCell(column++);
		cell.setCellValue("CHARACTER_SET_NAME");

		cell = row.createCell(column++);
		cell.setCellValue("CHAR_COL_DECL_LENGTH");

		cell = row.createCell(column++);
		cell.setCellValue("GLOBAL_STATS");

		cell = row.createCell(column++);
		cell.setCellValue("USER_STATS");

		cell = row.createCell(column++);
		cell.setCellValue("AVG_COL_LEN");

		cell = row.createCell(column++);
		cell.setCellValue("CHAR_LENGTH");

		cell = row.createCell(column++);
		cell.setCellValue("CHAR_USED");

		cell = row.createCell(column++);
		cell.setCellValue("V80_FMT_IMAGE");

		cell = row.createCell(column++);
		cell.setCellValue("DATA_UPGRADED");

		cell = row.createCell(column++);
		cell.setCellValue("HIDDEN_COLUMN");

		cell = row.createCell(column++);
		cell.setCellValue("VIRTUAL_COLUMN");

		cell = row.createCell(column++);
		cell.setCellValue("SEGMENT_COLUMN_ID");

		cell = row.createCell(column++);
		cell.setCellValue("INTERNAL_COLUMN_ID");

		cell = row.createCell(column++);
		cell.setCellValue("HISTOGRAM");

		cell = row.createCell(column++);
		cell.setCellValue("QUALIFIED_COL_NAME");
	}

}
