package god.codegen.crud.sys.alltabcomments.service;

import java.util.List;

import egovframework.com.cmm.ComDefaultVO;

@SuppressWarnings("serial")
public class AllTabCommentsVO extends ComDefaultVO {

	private String owner;

	private List<String> owners;

	private String tableName;

	private List<String> tableNames;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<String> getOwners() {
		return owners;
	}

	public void setOwners(List<String> owners) {
		this.owners = owners;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<String> getTableNames() {
		return tableNames;
	}

	public void setTableNames(List<String> tableNames) {
		this.tableNames = tableNames;
	}

}
