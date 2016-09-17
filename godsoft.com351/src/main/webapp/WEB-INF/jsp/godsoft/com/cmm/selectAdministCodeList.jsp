<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>행정코드 법정동</title>
</head>
<body>

	<select id="sidoCd">
		<option value="">시도 선택</option>
	</select>

	<select id="sggCd">
		<option value="">시군구 선택</option>
	</select>

	<select id="umdCd">
		<option value="">읍면동 선택</option>
	</select>

	<select id="riCd">
		<option value="">리 선택</option>
	</select>

	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.1.0.min.js"></script>

	<script type="text/javascript">
		var contextPath = "${pageContext.request.contextPath}";

		$(document).ready(function() {
			fn_godsoft_sido();

			$("#sidoCd").on({
				"change" : function() {
					fn_godsoft_sgg();
					$("#umdCd").html('<option value="">읍면동 선택</option>');
					$("#riCd").html('<option value="">리 선택</option>');
				}
			});

			$("#sggCd").on({
				"change" : function() {
					fn_godsoft_umd();
					$("#riCd").html('<option value="">리 선택</option>');
				}
			});

			$("#umdCd").on({
				"change" : function() {
					fn_godsoft_ri();
				}
			});
		});

		function fn_godsoft_sido() {
			var url = contextPath + "/selectSidoList.do";
			var data = {};
			// 			var success
			var dataType = "json";

			$.post(url, data, success, dataType);

			function success(data, textStatus, jqXHR) {
				var html = '<option value="">시도 선택</option>';

				var length = data.items.length;

				for (var i = 0; i < length; i++) {
					html += '<option value="' + data.items[i].sidoCd + '">'
							+ data.items[i].administZoneNm + '</option>';
				}

				$("#sidoCd").html(html);
			}
		}

		function fn_godsoft_sgg() {
			var url = contextPath + "/selectSggList.do";
			var data = {
				administZoneCode : $("#sidoCd").val(),
				administZoneNm : $("#sidoCd option:selected").text(),
				sidoNm : $("#sidoCd option:selected").text()
			};
			// 			var success
			var dataType = "json";

			$.post(url, data, success, dataType);

			function success(data, textStatus, jqXHR) {
				var html = '<option value="">시군구 선택</option>';

				var length = data.items.length;

				for (var i = 0; i < length; i++) {
					// 					html += '<option value="' + data.items[i].sggCd + '">'
					// 							+ data.items[i].administZoneNm + '</option>';
					html += '<option value="' + data.items[i].sggCd + '">'
							+ data.items[i].sggNm + '</option>';
				}

				$("#sggCd").html(html);
			}
		}

		function fn_godsoft_umd() {
			var url = contextPath + "/selectUmdList.do";
			var data = {
				administZoneCode : $("#sidoCd").val() + $("#sggCd").val(),
				administZoneNm : $("#sidoCd option:selected").text() + " "
						+ $("#sggCd option:selected").text(),
				sidoNm : $("#sidoCd option:selected").text(),
				sggNm : $("#sggCd option:selected").text()
			};
			// 			var success
			var dataType = "json";

			$.post(url, data, success, dataType);

			function success(data, textStatus, jqXHR) {
				var html = '<option value="">읍면동 선택</option>';

				var length = data.items.length;

				for (var i = 0; i < length; i++) {
					// 					html += '<option value="' + data.items[i].umdCd + '">'
					// 							+ data.items[i].administZoneNm + '</option>';
					html += '<option value="' + data.items[i].umdCd + '">'
							+ data.items[i].umdNm + '</option>';
				}

				$("#umdCd").html(html);
			}
		}

		function fn_godsoft_ri() {
			var url = contextPath + "/selectRiList.do";
			var data = {
				administZoneCode : $("#sidoCd").val() + $("#sggCd").val()
						+ $("#umdCd").val(),
				administZoneNm : $("#sidoCd option:selected").text() + " "
						+ $("#sggCd option:selected").text() + " "
						+ $("#umdCd option:selected").text(),
				sidoNm : $("#sidoCd option:selected").text(),
				sggNm : $("#sggCd option:selected").text(),
				umdNm : $("#umdCd option:selected").text()
			};
			// 			var success
			var dataType = "json";

			$.post(url, data, success, dataType);

			function success(data, textStatus, jqXHR) {
				var html = '<option value="">리 선택</option>';

				var length = data.items.length;

				for (var i = 0; i < length; i++) {
					// 					html += '<option value="' + data.items[i].riCd + '">'
					// 							+ data.items[i].administZoneNm + '</option>';
					html += '<option value="' + data.items[i].riCd + '">'
							+ data.items[i].riNm + '</option>';
				}

				$("#riCd").html(html);
			}
		}
	</script>

</body>
</html>
