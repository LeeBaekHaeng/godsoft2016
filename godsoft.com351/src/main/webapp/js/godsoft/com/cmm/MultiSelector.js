var multi_selector = null;

function fn_MultiSelector_onload() {
	multi_selector = new MultiSelector(document.getElementById("files_list"),
			-1);

	multi_selector.addElement(document.getElementById("first_file_element"));
}

function fn_MultiSelector_ajaxSubmit(param) {
	if (multi_selector.count == 1) {
		return;
	}

	$(param.formId).ajaxSubmit({
		async : false,
		dataType : "json",
		error : function() {
			alert("첨부파일 업로드 실패하였습니다.");
		},
		// method : "POST",
		success : param.success,
		url : contextPath + "/cmm/mergeFileInfs.do",
		enctype : "multipart/form-data",
	});
}

function fn_MultiSelector_ajaxSubmit1(param) {
	fn_MultiSelector_ajaxSubmit({
		formId : param.formId,
		success : function(data) {
			$("#attchFileId").val(data.atchFileId);
		},
	});
}

function fn_MultiSelector_ajaxSubmit2(param) {
	fn_MultiSelector_ajaxSubmit({
		formId : param.formId,
		success : function(data) {
			$("#attchFileId01").val(data.atchFileId);
		},
	});

	fn_MultiSelector_ajaxSubmit({
		formId : param.formId,
		success : function(data) {
			$("#attchFileId02").val(data.atchFileId);
		},
	});
}
