package godsoft.com.table.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.rte.fdl.excel.EgovExcelService;
import egovframework.rte.fdl.excel.util.EgovExcelUtil;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:egovframework/spring/com/**/context-*.xml",
// "classpath:godsoft/spring/com/**/context-*.xml" })
@ContextConfiguration(locations = { "classpath:godsoft/spring/com/context-excel.xml" })
public class ComTnRoleInfoTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	@Autowired
	private EgovExcelService egovExcelService;

	@Test
	public void test() throws Exception {
		String filepath = new ClassPathResource(
				"godsoft/excel/com/table/롤정보_V1.0_20161109.xlsx").getFile()
				.getCanonicalPath();

		XSSFWorkbook type = null;

		XSSFWorkbook loadWorkbook = egovExcelService.loadWorkbook(filepath,
				type);

		Sheet sheet1 = loadWorkbook.getSheet("Sheet1");

		sheet1(sheet1);
	}

	public void sheet1(Sheet sheet) throws Exception {
		StringBuffer sb = new StringBuffer();

		for (Row row : sheet) {
			int rowNum = row.getRowNum();

			String a = EgovExcelUtil.getValue(row.getCell(0));
			String b = EgovExcelUtil.getValue(row.getCell(1));
			String c = EgovExcelUtil.getValue(row.getCell(2));
			String d = EgovExcelUtil.getValue(row.getCell(3));
			String e = EgovExcelUtil.getValue(row.getCell(4));
			String f = EgovExcelUtil.getValue(row.getCell(5));
			String g = EgovExcelUtil.getValue(row.getCell(6));

			if (rowNum <= 4) {
				continue;
			} else if (StringUtils.isEmpty(a)) {
				continue;
			}

			egovLogger.debug("a=" + a);

			sb.append("INSERT INTO COMTNROLEINFO ("); // 롤정보
			sb.append("ROLE_CODE"); // 롤코드
			sb.append(", ROLE_NM"); // 롤명
			sb.append(", ROLE_PTTRN"); // 롤패턴
			sb.append(", ROLE_DC"); // 롤설명
			sb.append(", ROLE_TY"); // 롤유형
			sb.append(", ROLE_SORT"); // 롤정렬
			sb.append(", ROLE_CREAT_DE"); // 롤생성일
			sb.append(") VALUES (");
			sb.append("'" + a + "'"); // 롤코드
			sb.append(", '" + b + "'"); // 롤명
			sb.append(", '" + c + "'"); // 롤패턴
			sb.append(", '" + d + "'"); // 롤설명
			sb.append(", '" + e + "'"); // 롤유형
			sb.append(", '" + f + "'"); // 롤정렬
			sb.append(", '" + g + "'"); // 롤생성일
			sb.append(");");
			sb.append("\n");
		}

		System.out.println(sb);
	}

}
