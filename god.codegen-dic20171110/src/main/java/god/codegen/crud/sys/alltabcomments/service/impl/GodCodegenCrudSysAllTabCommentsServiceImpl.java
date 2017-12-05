package god.codegen.crud.sys.alltabcomments.service.impl;

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
import god.codegen.crud.sys.alltabcomments.service.AllTabCommentsService;
import god.codegen.crud.sys.alltabcomments.service.AllTabCommentsVO;

@Service
public class GodCodegenCrudSysAllTabCommentsServiceImpl extends EgovAbstractServiceImpl
		implements AllTabCommentsService {

	@Autowired
	private GodCodegenCrudSysAllTabCommentsDAO dao;

	private EgovExcelService egovExcelService = new EgovExcelServiceImpl();

	@Override
	public List<EgovMap> selectList(AllTabCommentsVO vo) throws Exception {
		return dao.selectList(vo);
	}

	@Override
	public void createWorkbook(AllTabCommentsVO vo) throws Exception {
		List<EgovMap> results = dao.selectList(vo);

		createWorkbook(vo, results);
	}

	@SuppressWarnings("unchecked")
	private void createWorkbook(AllTabCommentsVO vo, List<EgovMap> results) throws Exception {
		String sheetname = "ALL_TAB_COMMENTS";

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

		Cell cell = row.createCell(column++);
		cell.setCellValue("OWNER");

		cell = row.createCell(column++);
		cell.setCellValue("TABLE_NAME");

		cell = row.createCell(column++);
		cell.setCellValue("TABLE_TYPE");

		cell = row.createCell(column++);
		cell.setCellValue("COMMENTS");

		cell = row.createCell(column++);
		cell.setCellValue("ORIGIN_CON_ID");
	}

}
