package godsoft.com.dic.service.impl;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import egovframework.rte.fdl.excel.util.EgovExcelUtil;

public class Select {

	public static String select(Sheet sheet, String tableName) {
		StringBuffer col = new StringBuffer();
		StringBuffer where = new StringBuffer();
		StringBuffer sql = new StringBuffer();

		for (Row row : sheet) {
			String b = EgovExcelUtil.getValue(row.getCell(1));

			if (tableName.equals(b)) {
				String c = EgovExcelUtil.getValue(row.getCell(2));
				String d = EgovExcelUtil.getValue(row.getCell(3));

				String aj = EgovExcelUtil.getValue(row.getCell(35));
				String ak = EgovExcelUtil.getValue(row.getCell(36));
				String al = EgovExcelUtil.getValue(row.getCell(37));
				String am = EgovExcelUtil.getValue(row.getCell(38));

				if (c.indexOf("_CODE") != -1) {
					col.append("    , " + c + "\n");
					col.append("    , null as " + c.replaceAll("_CODE", "_NM")
							+ "\n");
				} else {
					col.append("    , " + c + "\n");
				}

				if ("NUMBER".equals(d)) {
					where.append("    AND " + c + " = 0\n");
				} else {
					where.append("    AND " + c + " = ''\n");
				}
			}
		}

		sql.append("select\n");
		sql.append("    ROWNUM as ROWNUM_01\n");
		sql.append(col);
		sql.append("from " + tableName + "\n");
		sql.append("where 1 = 1\n");
		sql.append(where);
		sql.append(";\n");

		return sql.toString();
	}

	public static String selectIbatis(Sheet sheet, String tableName) {
		StringBuffer col = new StringBuffer();
		StringBuffer where = new StringBuffer();
		StringBuffer sql = new StringBuffer();

		for (Row row : sheet) {
			String b = EgovExcelUtil.getValue(row.getCell(1));

			if (tableName.equals(b)) {
				String c = EgovExcelUtil.getValue(row.getCell(2));
				String d = EgovExcelUtil.getValue(row.getCell(3));

				String aj = EgovExcelUtil.getValue(row.getCell(35));
				String ak = EgovExcelUtil.getValue(row.getCell(36));
				String al = EgovExcelUtil.getValue(row.getCell(37));
				String am = EgovExcelUtil.getValue(row.getCell(38));

				if (c.indexOf("_CODE") != -1) {
					col.append("    , " + c + "\n");
					col.append("    , null as " + c.replaceAll("_CODE", "_NM")
							+ "\n");
				} else {
					col.append("    , " + c + "\n");
				}

				if ("NUMBER".equals(d)) {
					where.append("    AND " + c + " = 0\n");
				} else {
					where.append("    AND " + c + " = ''\n");
				}
			}
		}

		sql.append("select\n");
		sql.append("    ROWNUM as ROWNUM_01\n");
		sql.append(col);
		sql.append("from " + tableName + "\n");
		sql.append("where 1 = 1\n");
		sql.append(where);
		sql.append(";\n");

		return sql.toString();
	}

}
