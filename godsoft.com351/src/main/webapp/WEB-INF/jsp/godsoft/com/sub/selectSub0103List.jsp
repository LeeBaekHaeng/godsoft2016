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
<title>서브0103</title>

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

	<div class="container-fluid">

		<h1>서브0103</h1>

		<div class="table-responsive">
			<table class="table table-bordered">
				<caption>목록</caption>
				<thead>
					<tr>
						<th scope="col">번호</th>
						<th scope="col">메시지ID</th>
						<th scope="col">이메일내용</th>
						<th scope="col">발신자</th>
						<th scope="col">수신자</th>
						<th scope="col">제목</th>
						<th scope="col">발송결과코드</th>
						<th scope="col">발신일시</th>
						<th scope="col">첨부파일ID</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${items}" var="item" varStatus="i">
						<tr>
							<td>${i.count}</td>
							<td title="메시지ID">${item.mssageId}</td>
							<td title="이메일내용">${item.emailCn}</td>
							<td title="발신자">${item.sndr}</td>
							<td title="수신자">${item.rcver}</td>
							<td title="제목">${item.sj}</td>
							<td title="발송결과코드">${item.sndngResultCode}</td>
							<td title="발신일시">${item.dsptchDt}</td>
							<td title="첨부파일ID">${item.atchFileId}</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot></tfoot>
			</table>
			<ui:pagination paginationInfo="${paginationInfo}" type="image"
				jsFunction="Pagination" />
		</div>

	</div>

	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>