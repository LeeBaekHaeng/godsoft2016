<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/godsoft/com/cmm/taglib.jsp"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
<title>서브0101</title>

<!-- 부트스트랩 -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"
	rel="stylesheet">

<!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
<!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<form:form commandName="sub0101VO"
		action="${pageContext.request.contextPath}/insertMultipartSub0101.do"
		enctype="multipart/form-data">
		<input type="file" name="file1">

		<input type="text" name="fileVO.atchFileId"
			value="FILE_000000000000232">

		<button type="submit">첨부파일 업로드</button>

		<input type="hidden" name="attchFileId" id="attchFileId">

		<input type="hidden" name="keyStr" value="GOD">

		<input type="file" name="first_file_element" id="first_file_element">

		<div id="files_list"></div>
	</form:form>

	<%-- 	<c:import url="/cmm/fms/selectFileInfs.do"> --%>
	<%-- 		<c:param name="param_atchFileId" value="FILE_000000000000232" /> --%>
	<%-- 	</c:import> --%>

	<form>
		<!-- 		<input type="text" name="returnUrl" -->
		<!-- 			value="/insertFormMultipartSub0101.do">  -->

		<input type="text" name="returnUrl"
			value="${pageContext.request.contextPath}/insertFormMultipartSub0101.do">

		<c:import url="/cmm/fms/selectFileInfsForUpdate.do">
			<c:param name="param_atchFileId" value="FILE_000000000000211" />
		</c:import>
	</form>

	<%-- 	<c:import url="/cmm/fms/selectImageFileInfs.do"> --%>
	<%-- 		<c:param name="atchFileId" value="FILE_000000000000232" /> --%>
	<%-- 	</c:import> --%>

	<div class="container-fluid">

		<h1>서브0101</h1>

		<div class="table-responsive">
			<table class="table table-bordered">
				<caption>목록</caption>
				<thead>
					<tr>
						<th scope="col">번호</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
					</tr>
				</tbody>
				<tfoot></tfoot>
			</table>
		</div>

	</div>

	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/vendor/jquery/jquery.form.min.js"></script>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/egovframework/com/cmm/fms/EgovMultiFile.js"></script>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/godsoft/com/cmm/MultiSelector.js"></script>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/godsoft/com/sub/insertFormMultipartSub0101.js"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			fn_insertFormMultipartSub0101_onload();
		});
	</script>

</body>
</html>
