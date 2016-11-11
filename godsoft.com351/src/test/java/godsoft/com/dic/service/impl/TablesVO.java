package godsoft.com.dic.service.impl;

import java.util.List;

public class TablesVO {

	private String owner;
	private String tableName;

	private String tableComment;
	private String tableCamelCase;
	private String tablePascalCase;

	private List<TabColsVO> tabColsVOs;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}

	public String getTableCamelCase() {
		return tableCamelCase;
	}

	public void setTableCamelCase(String tableCamelCase) {
		this.tableCamelCase = tableCamelCase;
	}

	public String getTablePascalCase() {
		return tablePascalCase;
	}

	public void setTablePascalCase(String tablePascalCase) {
		this.tablePascalCase = tablePascalCase;
	}

	public List<TabColsVO> getTabColsVOs() {
		return tabColsVOs;
	}

	public void setTabColsVOs(List<TabColsVO> tabColsVOs) {
		this.tabColsVOs = tabColsVOs;
	}

}
