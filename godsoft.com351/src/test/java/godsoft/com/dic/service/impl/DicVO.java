package godsoft.com.dic.service.impl;

import java.util.Map;

public class DicVO {

	private String filepathTable;
	private String filepathColumn;

	private Map<String, TablesVO> tablesMap;

	public Map<String, TablesVO> getTablesMap() {
		return tablesMap;
	}

	public void setTablesMap(Map<String, TablesVO> tablesMap) {
		this.tablesMap = tablesMap;
	}

	public String getFilepathTable() {
		return filepathTable;
	}

	public void setFilepathTable(String filepathTable) {
		this.filepathTable = filepathTable;
	}

	public String getFilepathColumn() {
		return filepathColumn;
	}

	public void setFilepathColumn(String filepathColumn) {
		this.filepathColumn = filepathColumn;
	}

}
