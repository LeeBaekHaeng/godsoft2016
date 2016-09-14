package godsoft.code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

import egovframework.rte.fdl.string.EgovDateUtil;

public class ComTcAdministCodeTest {

	/**
	 * https://code.mogaha.go.kr/jsp/index.jsp
	 * https://www.code.go.kr/jsp/index.jsp
	 * 
	 * 행정표준코드관리시스템 > 법정동 > 법정동코드 전체자료
	 *
	 * <pre>
	 * sqlplus test/test@localhost:1521/orcl "@C:\Users\godsoft\Downloads\법정동코드 전체자료\법정동코드 전체자료-20160914170339.sql"
	 * </pre>
	 * 
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		String fileName = SystemUtils.USER_HOME
				+ "/Downloads/법정동코드 전체자료/법정동코드 전체자료.txt";

		// Reader in = new FileReader(fileName);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream(fileName), "ms949"));

		Iterable<CSVRecord> records = CSVFormat.TDF.withHeader().parse(in);

		StringBuffer sb = new StringBuffer();

		sb.append("set define off;");
		sb.append(SystemUtils.LINE_SEPARATOR);
		sb.append("insert into COMTCADMINISTCODE (ADMINIST_ZONE_SE, ADMINIST_ZONE_CODE, USE_AT, ADMINIST_ZONE_NM, FRST_REGIST_PNTTM) values ('1', '3600000000', 'Y', '세종특별자치시 세종특별자치시', sysdate);");
		sb.append(SystemUtils.LINE_SEPARATOR);

		for (CSVRecord record : records) {
			// System.out.println("record=" + record);

			String a = record.get("법정동코드");
			String b = record.get("법정동명");
			String c = record.get("폐지여부");

			sb.append("insert into COMTCADMINISTCODE (");

			sb.append("ADMINIST_ZONE_SE");
			sb.append(", ADMINIST_ZONE_CODE");
			sb.append(", USE_AT");
			sb.append(", ADMINIST_ZONE_NM");
			sb.append(", FRST_REGIST_PNTTM");

			sb.append(") values (");

			// 행정구역구분
			sb.append("'1'"); // 법정동
			// sb.append("'2'"); // 행정동

			// 행정구역코드
			sb.append(", '");
			sb.append(a);
			sb.append("'");

			// 사용여부
			sb.append(", '");
			sb.append(("존재".equals(c) ? "Y" : "N"));
			sb.append("'");

			// 행정구역명
			sb.append(", '");
			sb.append(b);
			sb.append("'");

			// 최초등록시점
			sb.append(", sysdate");

			sb.append(");");
			sb.append(SystemUtils.LINE_SEPARATOR);
		}

		sb.append("update COMTCADMINISTCODE set ADMINIST_ZONE_NM = replace(ADMINIST_ZONE_NM, '  ', ' ') where ADMINIST_ZONE_SE = '1' and ADMINIST_ZONE_CODE like '36%';");
		sb.append(SystemUtils.LINE_SEPARATOR);

		sb.append("commit;");

		System.out.println(sb);

		FileUtils.writeStringToFile(
				new File(fileName.replaceAll(".txt",
						"-" + EgovDateUtil.getCurrentDateTimeAsString()
								+ ".sql")), sb.toString(), "MS949");
	}

}
