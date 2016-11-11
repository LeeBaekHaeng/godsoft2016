package godsoft.com.dic.service.impl;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import egovframework.rte.fdl.excel.util.EgovExcelUtil;

public class Insert {

	public static String insert(Sheet sheet, String tableName) {
		StringBuffer col = new StringBuffer();
		StringBuffer values = new StringBuffer();
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
					col.append("    " + c + "\n");

					if ("NUMBER".equals(d)) {
						values.append("    0\n");
					} else if ("DATE".equals(d)) {
						values.append("    sysdate\n");
					} else {
						values.append("    '" + ak + "'\n");
					}
				} else {
					col.append("    , " + c + "\n");

					if ("NUMBER".equals(d)) {
						values.append("    0\n");
					} else if ("DATE".equals(d)) {
						values.append("    , sysdate\n");
					} else {
						values.append("    , '" + ak + "'\n");
					}
				}

				i++;
			}
		}

		sql.append("insert into ");
		sql.append(tableName);
		sql.append(" (\n");
		sql.append(col);
		sql.append(") values (\n");
		sql.append(values);
		sql.append(");\n");

		return sql.toString();
	}

	public static String insertIbatis(Sheet sheet, String tableName) {
		StringBuffer col = new StringBuffer();
		StringBuffer values = new StringBuffer();
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
					col.append("    " + c + "\n");

					if ("NUMBER".equals(d)) {
						values.append("    #" + al + "#\n");
					} else if ("DATE".equals(d)) {
						values.append("    sysdate\n");
					} else {
						values.append("    #" + al + "#\n");
					}
				} else {
					col.append("    , " + c + "\n");

					if ("NUMBER".equals(d)) {
						values.append("    #" + al + "#\n");
					} else if ("DATE".equals(d)) {
						values.append("    , sysdate\n");
					} else {
						values.append("    , #" + al + "#\n");
					}
				}

				i++;
			}
		}

		sql.append("<![CDATA[\n");
		sql.append("insert into ");
		sql.append(tableName);
		sql.append(" (\n");
		sql.append(col);
		sql.append(") values (\n");
		sql.append(values);
		sql.append(")\n");
		sql.append("]]>\n");

		return sql.toString();
	}

}
