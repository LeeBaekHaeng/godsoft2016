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
<title>메뉴</title>

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

	<ul class="nav nav-tabs">
		<c:forEach items="${items}" var="item" varStatus="i">
			<c:if test="${item.level01 == 2}">
				<li role="presentation" class="dropdown">
					<c:choose>
						<c:when test="${item.url == 'dir'}">
							<a class="dropdown-toggle" data-toggle="dropdown" role="button"
								aria-haspopup="true" aria-expanded="false">${item.menuNm}<span
									class="caret"></span>
							</a>
						</c:when>
						<c:otherwise>
							<a class="dropdown-toggle" data-toggle="dropdown"
								href="${pageContext.request.contextPath}${item.url}"
								role="button" aria-haspopup="true" aria-expanded="false">${item.menuNm}<span
									class="caret"></span>
							</a>
						</c:otherwise>
					</c:choose>

					<ul class="dropdown-menu">
						<c:forEach items="${items}" var="item2" varStatus="i2">
							<c:if test="${item2.upperMenuNo == item.menuNo}">
								<li>
									<c:choose>
										<c:when test="${item2.url == 'dir'}">
											<a>${item2.menuNm}</a>
										</c:when>
										<c:otherwise>
											<a href="${pageContext.request.contextPath}${item2.url}">${item2.menuNm}</a>
										</c:otherwise>
									</c:choose>

								</li>
							</c:if>
						</c:forEach>
					</ul>

				</li>
			</c:if>
		</c:forEach>
	</ul>

	<p></p>

	<ol>
		<c:forEach items="${items}" var="item" varStatus="i">
			<c:if test="${item.level01 == 2}">
				<li>${item.menuNm}

					<ol>
						<c:forEach items="${items}" var="item2" varStatus="i2">
							<c:if test="${item2.upperMenuNo == item.menuNo}">
								<li>${item2.menuNm}</li>
							</c:if>
						</c:forEach>
					</ol>

				</li>
			</c:if>
		</c:forEach>
	</ol>

	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>
