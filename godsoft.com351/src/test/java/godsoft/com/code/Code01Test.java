package godsoft.com.code;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.rte.fdl.excel.EgovExcelService;
import egovframework.rte.fdl.excel.util.EgovExcelUtil;
import egovframework.rte.fdl.string.EgovDateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/context-excel.xml" })
public class Code01Test {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private EgovExcelService egovExcelService;

	@Test
	public void test() {
		test2();
		// classPathResource();
	}

	public void test2() {
		egovLogger.debug("test2");

		// String filepath = new ClassPathResource(
		// "godsoft/excel/com/GOD_D08_코드정의서_V1.0_20160830.xlsx")
		// .getFile().getCanonicalPath();

		String filepath = null;

		try {
			filepath = new File(SystemUtils.USER_HOME
					+ "/Desktop/GOD_D08_코드정의서_V1.0_20160830.xlsx")
					.getCanonicalPath();
		} catch (IOException e) {
			egovLogger.error(e.getMessage());
		}

		XSSFWorkbook type = null;

		XSSFWorkbook loadWorkbook = null;

		try {
			loadWorkbook = egovExcelService.loadWorkbook(filepath, type);
		} catch (Exception e) {
			egovLogger.error(e.getMessage());
		}

		Sheet sheet3 = loadWorkbook.getSheet("3.코드정의서");
		Sheet sheet4 = loadWorkbook.getSheet("4.코드값현황표");

		sheet3(sheet3);
		sheet4(sheet4);
	}

	public void sheet3(Sheet sheet) {
		StringBuffer sb = new StringBuffer();

		for (Row row : sheet) {
			int rowNum = row.getRowNum();

			String a = EgovExcelUtil.getValue(row.getCell(0)); // 코드명
			String b = EgovExcelUtil.getValue(row.getCell(1)); // 코드값

			// egovLogger.debug("row=" + row);
			// egovLogger.debug("row=" + row.getCell(0));
			egovLogger.debug("A=" + a);
			egovLogger.debug("B=" + b);

			if (rowNum <= 2) {
				continue;
			} else if (StringUtils.isEmpty(a)) {
				continue;
			}

			sb.append("insert into COMTCCMMNCODE (");
			sb.append("CL_CODE");
			sb.append(", CODE_ID");
			sb.append(", CODE_ID_NM");
			sb.append(", CODE_ID_DC");
			sb.append(", USE_AT");
			sb.append(", FRST_REGIST_PNTTM");
			sb.append(", FRST_REGISTER_ID");
			sb.append(",LAST_UPDT_PNTTM");
			sb.append(", LAST_UPDUSR_ID");
			sb.append(") values (");
			sb.append("'EFC'");
			sb.append(", '" + b + "'");
			sb.append(", '" + a + "'");
			sb.append(", null");
			sb.append(", 'Y'");
			sb.append(", sysdate");
			sb.append(", 'SYSTEM2'");
			sb.append(", null");
			sb.append(", null");
			sb.append(");");
			sb.append("\n");
		}

		sb.append("\ncommit;\n");

		System.out.println(sb);

		try {
			FileUtils.writeStringToFile(
					new File(SystemUtils.USER_HOME
							+ "/Desktop/COMTCCMMNCODE 공통코드_V1.0_"
							+ EgovDateUtil.toString(new Date(),
									"yyyy-MM-dd HH-mm-ss", null) + ".sql"),
					sb.toString(), "ms949");
		} catch (IOException e) {
			egovLogger.error(e.getMessage());
		}
	}

	public void sheet4(Sheet sheet) {
		StringBuffer sb = new StringBuffer();

		String d2 = null;

		int i = 1;

		for (Row row : sheet) {
			int rowNum = row.getRowNum();

			String a = EgovExcelUtil.getValue(row.getCell(0)); // 코드 명
			String b = EgovExcelUtil.getValue(row.getCell(1)); // 코드 값
			String c = EgovExcelUtil.getValue(row.getCell(2)); // 코드 값 의미
			String d = EgovExcelUtil.getValue(row.getCell(3)); // 상위 코드 값

			// egovLogger.debug("row=" + row);
			// egovLogger.debug("row=" + row.getCell(0));
			egovLogger.debug("A=" + a);
			egovLogger.debug("B=" + b);
			egovLogger.debug("C=" + c);
			egovLogger.debug("D=" + d);

			if (rowNum <= 2) {
				continue;
			} else if (StringUtils.isEmpty(a)) {
				continue;
			}

			if (d.equals(d2)) {
				i++;
			} else {
				i = 1;
			}

			String iString = String.format("%02d", i);

			sb.append("insert into COMTCCMMNDETAILCODE (");
			sb.append("CODE_ID");
			sb.append(", CODE");
			sb.append(", CODE_NM");
			sb.append(", CODE_DC");
			sb.append(", USE_AT");
			sb.append(", FRST_REGIST_PNTTM");
			sb.append(", FRST_REGISTER_ID");
			sb.append(", LAST_UPDT_PNTTM");
			sb.append(", LAST_UPDUSR_ID");
			sb.append(") values (");
			sb.append("'" + d + "'");
			sb.append(", '" + b + "'");
			sb.append(", '" + c + "'");
			// sb.append(", null");
			sb.append(", '" + iString + "'");
			sb.append(", 'Y'");
			sb.append(", sysdate");
			sb.append(", 'SYSTEM2'");
			sb.append(", null");
			sb.append(", null");
			sb.append(");");
			sb.append("\n");

			d2 = d;
		}

		sb.append("\ncommit;\n");

		System.out.println(sb);

		try {
			FileUtils.writeStringToFile(
					new File(SystemUtils.USER_HOME
							+ "/Desktop/COMTCCMMNDETAILCODE 공통상세코드_V1.0_"
							+ EgovDateUtil.toString(new Date(),
									"yyyy-MM-dd HH-mm-ss", null) + ".sql"),
					sb.toString(), "ms949");
		} catch (IOException e) {
			egovLogger.error(e.getMessage());
		}
	}

	public void classPathResource() throws Exception {
		Resource resource = new ClassPathResource(
				"godsoft/excel/com/GOD_D08_코드정의서_V1.0_20160830.xlsx");

		egovLogger.debug("resource=" + resource);
		egovLogger.debug("getCanonicalPath="
				+ resource.getFile().getCanonicalPath());
	}

}
