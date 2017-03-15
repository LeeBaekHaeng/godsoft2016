godsoft.com.test.Date2 = function() {
	var varDate = new Date();

	var html = '';

	var varOwnPropertyNames = Object.getOwnPropertyNames(Date.prototype);

	for (var i = 0; i < varOwnPropertyNames.length; i++) {
		html += '<li>';
		html += 'varOwnPropertyNames[' + i + '] : ' + varOwnPropertyNames[i];

		if (varOwnPropertyNames[i].indexOf('set') == -1) {
			html += ', '
					+ eval('Date.prototype.' + varOwnPropertyNames[i]
							+ '.apply(new Date())');
		}

		html += '</li>';
	}

	html += '<li>';
	html += 'new Date().getDate() : ' + new Date().getDate();
	html += '</li>';

	html += '<li>';
	html += 'Date.prototype.getDate.apply(new Date()) : '
			+ Date.prototype.getDate.apply(new Date());
	html += '</li>';

	html += '<li>';
	html += 'Date.prototype.getDate.call(new Date()) : '
			+ Date.prototype.getDate.call(new Date());
	html += '</li>';

	$('#godsoft-com-test-ul2').empty();

	$('#godsoft-com-test-ul2').html(html);
}

godsoft.com.test.Date2();
