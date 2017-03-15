var godsoft = {

	com : {

		test : {

			Date : function() {

				var varDate = new Date();

				var html = '';

				html += '<li>';
				html += 'varDate: ' + varDate;
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getDate(): ' + varDate.getDate();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getDay(): ' + varDate.getDay();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getFullYear(): '
						+ varDate.getFullYear();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getHours(): ' + varDate.getHours();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getMilliseconds(): '
						+ varDate.getMilliseconds();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getMinutes(): ' + varDate.getMinutes();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getMonth(): ' + varDate.getMonth();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getSeconds(): ' + varDate.getSeconds();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getTime(): ' + varDate.getTime();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getTime(): ' + varDate.getTime();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getTimezoneOffset(): '
						+ varDate.getTimezoneOffset();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getUTCDate(): ' + varDate.getUTCDate();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getUTCDay(): ' + varDate.getUTCDay();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getUTCFullYear(): '
						+ varDate.getUTCFullYear();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getUTCHours(): '
						+ varDate.getUTCHours();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getUTCMilliseconds(): '
						+ varDate.getUTCMilliseconds();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getUTCMinutes(): '
						+ varDate.getUTCMinutes();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getUTCMonth(): '
						+ varDate.getUTCMonth();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getUTCSeconds(): '
						+ varDate.getUTCSeconds();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.getYear(): ' + varDate.getYear();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.toDateString(): '
						+ varDate.toDateString();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.toGMTString(): '
						+ varDate.toGMTString();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.toISOString(): '
						+ varDate.toISOString();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.toJSON(): ' + varDate.toJSON();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.toLocaleDateString(): '
						+ varDate.toLocaleDateString();
				html += '</li>';

				// html += '<li>';
				// html += 'Date.prototype.toLocaleFormat(): '
				// + varDate.toLocaleFormat();
				// html += '</li>';

				html += '<li style="font-weight: bold;">';
				html += 'Date.prototype.toLocaleString(): '
						+ varDate.toLocaleString();
				html += '</li>';

				html += '<li style="font-weight: bold;">';
				html += 'Date.prototype.toLocaleString(\'ko - KR\'): '
						+ varDate.toLocaleString('ko-KR');
				html += '</li>';

				var options = {
					year : 'numeric',
					// month : 'numeric',
					month : '2-digit',
					// day : 'numeric',
					day : '2-digit',
					hour : 'numeric',
					minute : 'numeric',
					second : 'numeric',
					hour12 : false
				};

				html += '<li style="font-weight: bold;">';
				html += 'Date.prototype.toLocaleString(\'ko - KR\', options): '
						+ varDate.toLocaleString('ko-KR', options);
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.toLocaleTimeString(): '
						+ varDate.toLocaleTimeString();
				html += '</li>';

				// html += '<li>';
				// html += 'Date.prototype.toSource(): ' + varDate.toSource();
				// html += '</li>';

				html += '<li>';
				html += 'Date.prototype.toString(): ' + varDate.toString();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.toTimeString(): '
						+ varDate.toTimeString();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.toUTCString(): '
						+ varDate.toUTCString();
				html += '</li>';

				html += '<li>';
				html += 'Date.prototype.valueOf(): ' + varDate.valueOf();
				html += '</li>';

				$('#godsoft-com-test-ul').empty();

				$('#godsoft-com-test-ul').html(html);

			}

		}

	}

};

// godsoft.com.test.Date();
