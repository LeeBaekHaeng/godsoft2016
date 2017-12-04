package god.codegen.crud.sys.allobjects.service;

import god.codegen.crud.sys.alltabcomments.service.AllTabCommentsVO;

/**
 * @Class Name : AllObjectsVO.java
 * @Description : GodCodegenCrudSysAllObjects VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2017-11-29 11:48:45
 * @version 1.0
 * @see
 * 
 * 		Copyright (C) All right reserved.
 */
@SuppressWarnings("serial")
public class AllObjectsVO extends AllTabCommentsVO {
	private static final long serialVersionUID = 1L;

	/** OWNER */
	private String owner;

	/** OBJECT_NAME */
	private String objectName;

	/** SUBOBJECT_NAME */
	private String subobjectName;

	/** OBJECT_ID */
	private Integer objectId;

	/** DATA_OBJECT_ID */
	private int dataObjectId;

	/** OBJECT_TYPE */
	private String objectType;

	/** CREATED */
	private String created;

	/** LAST_DDL_TIME */
	private String lastDdlTime;

	/** TIMESTAMP */
	private String timestamp;

	/** STATUS */
	private String status;

	/** TEMPORARY */
	private String temporary;

	/** GENERATED */
	private String generated;

	/** SECONDARY */
	private String secondary;

	/** NAMESPACE */
	private Integer namespace;

	/** EDITION_NAME */
	private String editionName;

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getSubobjectName() {
		return this.subobjectName;
	}

	public void setSubobjectName(String subobjectName) {
		this.subobjectName = subobjectName;
	}

	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public int getDataObjectId() {
		return this.dataObjectId;
	}

	public void setDataObjectId(int dataObjectId) {
		this.dataObjectId = dataObjectId;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getLastDdlTime() {
		return this.lastDdlTime;
	}

	public void setLastDdlTime(String lastDdlTime) {
		this.lastDdlTime = lastDdlTime;
	}

	public String getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemporary() {
		return this.temporary;
	}

	public void setTemporary(String temporary) {
		this.temporary = temporary;
	}

	public String getGenerated() {
		return this.generated;
	}

	public void setGenerated(String generated) {
		this.generated = generated;
	}

	public String getSecondary() {
		return this.secondary;
	}

	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}

	public Integer getNamespace() {
		return this.namespace;
	}

	public void setNamespace(Integer namespace) {
		this.namespace = namespace;
	}

	public String getEditionName() {
		return this.editionName;
	}

	public void setEditionName(String editionName) {
		this.editionName = editionName;
	}

}
