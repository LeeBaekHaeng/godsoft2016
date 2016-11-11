package godsoft.com.dic.service.impl;

public class TabColsVO {

	private String owner;
	private String tableName;
	private String columnName;
	private String dataType;
	private Integer dataLength;
	private Integer dataPrecision;
	private Integer dataScale;
	private String nullable;
	private Integer columnId;

	private String tableComment;
	private String columnComment;
	private String columnCamelCase;
	private String columnPascalCase;

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

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getDataLength() {
		return dataLength;
	}

	public void setDataLength(Integer dataLength) {
		this.dataLength = dataLength;
	}

	public Integer getDataPrecision() {
		return dataPrecision;
	}

	public void setDataPrecision(Integer dataPrecision) {
		this.dataPrecision = dataPrecision;
	}

	public Integer getDataScale() {
		return dataScale;
	}

	public void setDataScale(Integer dataScale) {
		this.dataScale = dataScale;
	}

	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	public Integer getColumnId() {
		return columnId;
	}

	public void setColumnId(Integer columnId) {
		this.columnId = columnId;
	}

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	public String getColumnCamelCase() {
		return columnCamelCase;
	}

	public void setColumnCamelCase(String columnCamelCase) {
		this.columnCamelCase = columnCamelCase;
	}

	public String getColumnPascalCase() {
		return columnPascalCase;
	}

	public void setColumnPascalCase(String columnPascalCase) {
		this.columnPascalCase = columnPascalCase;
	}

}
