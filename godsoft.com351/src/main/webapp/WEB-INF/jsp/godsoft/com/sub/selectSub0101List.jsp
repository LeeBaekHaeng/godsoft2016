<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
	href="${pageContext.request.contextPath}/web/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
<!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	${initParam['godWebPath']} ${initParam.godWebPath}

	<pre>${requestScope}</pre>

	${requestScope.contextPath} ${requestScope['contextPath']}

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

	<form>
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input
				type="email" class="form-control" id="exampleInputEmail1"
				placeholder="Email">
		</div>
		<label for="exampleInputEmail12">Email address</label> <input
			type="email" class="form-control" id="exampleInputEmail12"
			placeholder="Email">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				type="password" class="form-control" id="exampleInputPassword1"
				placeholder="Password">
		</div>
		<div class="form-group">
			<label for="exampleInputFile">File input</label> <input type="file"
				id="exampleInputFile">
			<p class="help-block">Example block-level help text here.</p>
		</div>
		<div class="checkbox">
			<label> <input type="checkbox"> Check me out
			</label>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>

	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script
		src="${pageContext.request.contextPath}/web/jquery-3.1.1.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script
		src="${pageContext.request.contextPath}/web/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

	<script type="text/javascript" language="JavaScript"
		src="${pageContext.request.contextPath}/web/jquery.i18n.properties.min.js"></script>

	<script>
		// 		jQuery.i18n.properties({
		// 			name : 'Messages',
		// 			callback : function() {
		// 				alert(one.two.three);
		// 			}
		// 		});

		jQuery.i18n.properties({
			name : 'message-common',
			path : 'test/',
			mode : 'both',
			callback : function() {
				$("#exampleInputEmail1").val(fail.common.msg);

				// 				$("#exampleInputEmail12").val($.i18n.prop("fail.common.msg"));
			}
		});

		$("#exampleInputEmail12").val($.i18n.prop("fail.common.msg"));
		// 		$("#exampleInputEmail12").val($.i18n.map['fail.common.msg']);
	</script>

</body>
</html>