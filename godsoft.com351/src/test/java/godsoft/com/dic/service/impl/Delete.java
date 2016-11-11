package godsoft.com.dic.service.impl;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import egovframework.rte.fdl.excel.util.EgovExcelUtil;

public class Delete {

	public static String sql(Sheet sheet, String tableName) {
		StringBuffer col = new StringBuffer();
		StringBuffer where = new StringBuffer();
		StringBuffer sql = new StringBuffer();

		int i = 0;

		for (Row row : sheet) {
			String b = EgovExcelUtil.getValue(row.getCell(1));

			if (tableName.equals(b)) {
				String c = EgovExcelUtil.getValue(row.getCell(2));
				String d = EgovExcelUtil.getValue(row.getCell(3));

				// DATA_LENGTH
				String g = EgovExcelUtil.getValue(row.getCell(6));

				String aj = EgovExcelUtil.getValue(row.getCell(35));
				String ak = EgovExcelUtil.getValue(row.getCell(36));
				String al = EgovExcelUtil.getValue(row.getCell(37));
				String am = EgovExcelUtil.getValue(row.getCell(38));

				if (i == 0) {
					if ("NUMBER".equals(d)) {
						col.append("    AND " + c + " = 0\n");
						where.append("    0\n");
					} else if ("DATE".equals(d)) {
						col.append("    " + c + " = sysdate\n");
						where.append("    AND " + c + " = sysdate\n");
					} else {
						col.append("    " + c + " = '" + ak + "'\n");
						where.append("    AND " + c + " = '" + ak + "'\n");
					}
				} else {
					if ("NUMBER".equals(d)) {
						col.append("    " + c + " = 0\n");
						where.append("    AND " + c + " = 0\n");
					} else if ("DATE".equals(d)) {
						col.append("    , " + c + " = sysdate\n");
						where.append("    AND " + c + " = sysdate\n");
					} else {
						col.append("    , " + c + " = '" + ak + "'\n");
						where.append("    AND " + c + " = '" + ak + "'\n");
					}
				}

				i++;
			}
		}

		sql.append("delete from ");
		sql.append(tableName);
		sql.append("\nwhere 1 = 1\n");
		sql.append(where);
		sql.append(";\n");

		return sql.toString();
	}

	public static String ibatis(Sheet sheet, String tableName) {
		StringBuffer col = new StringBuffer();
		StringBuffer where = new StringBuffer();
		StringBuffer sql = new StringBuffer();

		int i = 0;

		for (Row row : sheet) {
			String b = EgovExcelUtil.getValue(row.getCell(1));

			if (tableName.equals(b)) {
				String c = EgovExcelUtil.getValue(row.getCell(2));
				String d = EgovExcelUtil.getValue(row.getCell(3));

				// DATA_LENGTH
				String g = EgovExcelUtil.getValue(row.getCell(6));

				String aj = EgovExcelUtil.getValue(row.getCell(35));
				String ak = EgovExcelUtil.getValue(row.getCell(36));
				String al = EgovExcelUtil.getValue(row.getCell(37));
				String am = EgovExcelUtil.getValue(row.getCell(38));

				if (i == 0) {
					if ("NUMBER".equals(d)) {
						col.append("    AND " + c + " = 0\n");
						where.append("    0\n");
					} else if ("DATE".equals(d)) {
						col.append("    " + c + " = sysdate\n");
						where.append("    AND " + c + " = sysdate\n");
					} else {
						col.append("    " + c + " = '" + ak + "'\n");
						where.append("    AND " + c + " = #" + al + "#\n");
					}
				} else {
					if ("NUMBER".equals(d)) {
						col.append("    " + c + " = 0\n");
						where.append("    AND " + c + " = 0\n");
					} else if ("DATE".equals(d)) {
						col.append("    , " + c + " = sysdate\n");
						where.append("    AND " + c + " = sysdate\n");
					} else {
						col.append("    , " + c + " = '" + ak + "'\n");
						where.append("    AND " + c + " = #" + al + "#\n");
					}
				}

				i++;
			}
		}

		sql.append("<![CDATA[\n");
		sql.append("delete from ");
		sql.append(tableName);
		sql.append("\nwhere 1 = 1\n");
		sql.append(where);
		sql.append("]]>\n");

		return sql.toString();
	}

}
