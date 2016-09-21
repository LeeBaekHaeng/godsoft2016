package godsoft.code;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.rte.fdl.excel.EgovExcelService;
import egovframework.rte.fdl.excel.util.EgovExcelUtil;
import egovframework.rte.fdl.string.EgovDateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/**/context-*.xml" })
public class ComTcAdministCodeA1Test {

	@Autowired
	private EgovExcelService egovExcelService;

	/**
	 * <pre>
	 * http://www.moi.go.kr/frt/bbs/type001/commonSelectBoardList.do?bbsId=BBSMSTR_000000000052
	 * http://www.moi.go.kr/frt/bbs/type001/commonSelectBoardArticle.do?bbsId=BBSMSTR_000000000052&nttId=55940
	 * jscode20160905.zip
	 * 
	 * sqlplus test/test@localhost:1521/orcl "@C:\Users\LeeBaekHaeng\Downloads\jscode20160905\KIKcd_B.20160905-20160917080445.sql"
	 * </pre>
	 * 
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		String filepath = SystemUtils.USER_HOME
				+ "/Downloads/jscode20160905/KIKcd_B.20160905.xlsx";
		XSSFWorkbook type = null;

		XSSFWorkbook wb = egovExcelService.loadWorkbook(filepath, type);

		Sheet sheet = wb.getSheet("KIKcd_B");

		StringBuffer sb = new StringBuffer();

		sb.append("set define off;");
		sb.append(SystemUtils.LINE_SEPARATOR);
		sb.append(SystemUtils.LINE_SEPARATOR);
		// sb.append("insert into COMTCADMINISTCODE (ADMINIST_ZONE_SE, ADMINIST_ZONE_CODE, USE_AT, ADMINIST_ZONE_NM, FRST_REGIST_PNTTM) values ('1', '3600000000', 'Y', '세종특별자치시 세종특별자치시', sysdate);");
		// sb.append(SystemUtils.LINE_SEPARATOR);
		// sb.append(SystemUtils.LINE_SEPARATOR);

		for (Row row : sheet) {
			// System.out.println(row);

			// 법정동코드
			String a = EgovExcelUtil.getValue(row.getCell(0));

			// 시도명
			String b = EgovExcelUtil.getValue(row.getCell(1));

			// 시군구명
			String c = EgovExcelUtil.getValue(row.getCell(2));

			// 읍면동명
			String d = EgovExcelUtil.getValue(row.getCell(3));

			// 동리명
			String e = EgovExcelUtil.getValue(row.getCell(4));

			// 생성일자
			String f = EgovExcelUtil.getValue(row.getCell(5));

			// 말소일자
			String g = EgovExcelUtil.getValue(row.getCell(6));

			String administZoneNm = "";
			administZoneNm += b;
			administZoneNm += " " + c;
			administZoneNm += " " + d;
			administZoneNm += " " + e;
			administZoneNm = administZoneNm.trim();

			sb.append("insert into COMTCADMINISTCODE (");

			sb.append("ADMINIST_ZONE_SE");
			sb.append(", ADMINIST_ZONE_CODE");
			sb.append(", USE_AT");
			sb.append(", ADMINIST_ZONE_NM");
			sb.append(", CREAT_DE");
			sb.append(", ABL_DE");
			sb.append(", FRST_REGIST_PNTTM");
			sb.append(", FRST_REGISTER_ID");

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
			sb.append("Y");
			sb.append("'");

			// 행정구역명
			sb.append(", '");
			sb.append(administZoneNm);
			sb.append("'");

			// 생성일
			sb.append(", '");
			sb.append(f);
			sb.append("'");

			// 폐지일
			sb.append(", '");
			sb.append(g);
			sb.append("'");

			// 최초등록시점
			sb.append(", sysdate");

			// 최초등록자ID
			sb.append(", null");

			sb.append(");");
			sb.append(SystemUtils.LINE_SEPARATOR);
		}

		sb.append(SystemUtils.LINE_SEPARATOR);
		sb.append("commit;");
		sb.append(SystemUtils.LINE_SEPARATOR);

		System.out.println(sb);

		FileUtils.writeStringToFile(
				new File(filepath.replaceAll(".xlsx",
						"-" + EgovDateUtil.getCurrentDateTimeAsString()
								+ ".sql")), sb.toString(), "MS949");
	}

}
