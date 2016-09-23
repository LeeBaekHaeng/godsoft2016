package godsoft.com.code;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

import egovframework.rte.fdl.string.EgovDateUtil;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:egovframework/spring/com/test-dao-context.xml", })
public class InsttCodeRecptnDAOTest {

	// @Resource(name = "InsttCodeRecptnDAO")
	// private InsttCodeRecptnDAO insttCodeRecptnDAO;

	@Test
	public void test() throws Exception {
		insertInsttCode();
	}

	/**
	 * 기관코드
	 * 
	 * <pre>
	 * alter table TELNO VARCHAR2(200);
	 * alter table FXNUM VARCHAR2(200);
	 * </pre>
	 * 
	 * @throws Exception
	 */
	public void insertInsttCode() throws Exception {
		// TRUNCATE TABLE comtninsttcode;
		// http://www.mogaha.go.kr/frt/sub/a06/b04/codeSearch/screen.do
		// 자주찾는 코드 > 조회 순위 > 기관 > 기관코드 전체자료

		String pathname = SystemUtils.USER_HOME
				+ "/Downloads/기관코드 전체자료/기관코드 전체자료.txt";

		// List<String> readLines = FileUtils.readLines(new File(pathname));
		List<String> readLines = FileUtils.readLines(new File(pathname),
				"ms949");

		// insttCodeRecptnDAO.getSqlMapClient().startBatch();

		int i = 0;

		StringBuffer sb = new StringBuffer();
		sb.append("set define off;\n\n");

		for (String readLine : readLines) {
			if (i == 0) {
				i++;

				continue;
			}

			// System.out.println(readLine);

			String[] readLineSplit = readLine.split("\t");

			// INSTT_CODE 기관코드
			String insttCode = readLineSplit[0];

			// ALL_INSTT_NM 전체기관명
			String allInsttNm = readLineSplit[1];

			// LOWEST_INSTT_NM 최하위기관명
			String lowestInsttNm = readLineSplit[2];

			// ODR 차수
			String odr = readLineSplit[3];

			// ORD 서열
			String ord = readLineSplit[4];

			// INSTT_ODR 기관차수
			String insttOdr = readLineSplit[5];

			// UPPER_INSTT_CODE 상위기관코드
			String upperInsttCode = readLineSplit[6];

			// BEST_INSTT_CODE 최상위기관코드
			String bestInsttCode = readLineSplit[7];

			// REPRSNT_INSTT_CODE 대표기관코드
			String reprsntInsttCode = readLineSplit[8];

			// INSTT_TY_LCLAS 기관유형대분류
			String insttTyLclas = readLineSplit[9];

			// INSTT_TY_MLSFC 기관유형중분류
			String insttTyMclas = readLineSplit[10];

			// INSTT_TY_SCLAS 기관유형소분류
			String insttTySclas = readLineSplit[11];

			// 우편번호
			String zip = readLineSplit[12];

			// 행정동코드
			String adstrdCode = readLineSplit[13];

			// 소재지코드
			String locplcCode = readLineSplit[14];

			// 나머지주소
			String rmndrAdres = readLineSplit[15];

			// 지번
			String lnm = readLineSplit[16];

			// TELNO 전화번호
			String telno = readLineSplit[17];

			// FXNUM 팩스번호
			String fxnum = readLineSplit[18];

			// CREAT_DE 생성일
			String creatDe = readLineSplit[19];

			// ABL_DE 폐지일
			String ablDe = readLineSplit[20];

			// CHANGE_DE 변경일 변경일자
			String changede = readLineSplit[21];

			// ABL_ENNC 폐지유무
			String ablEnnc = readLineSplit[22];

			// 이전기관코드
			String beforeInsttCode = null;

			if (readLineSplit.length > 23) {
				beforeInsttCode = readLineSplit[23];
			}

			// INSTT_ABRV_NM 기관약어명
			String insttAbrvNm = null;

			// InsttCodeRecptn insttCodeRecptn = new InsttCodeRecptn();
			// insttCodeRecptn.setInsttCode(insttCode);
			// insttCodeRecptn.setAllInsttNm(allInsttNm);
			// insttCodeRecptn.setLowestInsttNm(lowestInsttNm);
			// insttCodeRecptn.setInsttAbrvNm(insttAbrvNm);
			// insttCodeRecptn.setOdr(odr);
			// insttCodeRecptn.setOrd(ord);
			// insttCodeRecptn.setInsttOdr(insttOdr);
			// insttCodeRecptn.setUpperInsttCode(upperInsttCode);
			// insttCodeRecptn.setBestInsttCode(bestInsttCode);
			// insttCodeRecptn.setReprsntInsttCode(reprsntInsttCode);
			// insttCodeRecptn.setInsttTyLclas(insttTyLclas);
			// insttCodeRecptn.setInsttTyMclas(insttTyMclas);
			// insttCodeRecptn.setInsttTySclas(insttTySclas);
			// insttCodeRecptn.setTelno(telno);
			// insttCodeRecptn.setFxnum(fxnum);
			// insttCodeRecptn.setCreatDe(creatDe);
			// insttCodeRecptn.setAblDe(ablDe);
			// insttCodeRecptn.setAblEnnc(ablEnnc);
			// insttCodeRecptn.setChangede(changede);

			sb.append("INSERT INTO COMTNINSTTCODE");
			sb.append("(INSTT_CODE");
			sb.append(", ALL_INSTT_NM");
			sb.append(", LOWEST_INSTT_NM");
			sb.append(", INSTT_ABRV_NM");
			sb.append(", ODR");
			sb.append(", ORD");
			sb.append(", INSTT_ODR");
			sb.append(", BEST_INSTT_CODE");
			sb.append(", UPPER_INSTT_CODE");
			sb.append(", REPRSNT_INSTT_CODE");
			sb.append(", INSTT_TY_LCLAS");
			sb.append(", INSTT_TY_MLSFC");
			sb.append(", INSTT_TY_SCLAS");
			sb.append(", TELNO");
			sb.append(", FXNUM");
			sb.append(", CREAT_DE");
			sb.append(", ABL_DE");
			sb.append(", ABL_ENNC");
			sb.append(", CHANGE_DE");
			sb.append(", CHANGE_TIME");
			sb.append(", BSIS_DE");
			sb.append(", SORT_ORDR");
			sb.append(", FRST_REGISTER_ID");
			sb.append(", FRST_REGIST_PNTTM");
			sb.append(", LAST_UPDUSR_ID");
			sb.append(", LAST_UPDT_PNTTM");
			sb.append(")");
			sb.append("VALUES");
			sb.append("( '" + insttCode + "'"); // insttCode
			sb.append(", '" + allInsttNm + "'"); // allInsttNm
			sb.append(", '" + lowestInsttNm + "'"); // lowestInsttNm
			sb.append(", '" + insttAbrvNm + "'"); // insttAbrvNm
			sb.append(", '" + odr + "'"); // odr
			sb.append(", '" + ord + "'"); // ord
			sb.append(", '" + insttOdr + "'"); // insttOdr
			sb.append(", '" + bestInsttCode + "'"); // bestInsttCode
			sb.append(", '" + upperInsttCode + "'"); // upperInsttCode
			sb.append(", '" + reprsntInsttCode + "'"); // reprsntInsttCode
			sb.append(", '" + insttTyLclas + "'"); // insttTyLclas
			sb.append(", '" + insttTyMclas + "'"); // insttTyMclas
			sb.append(", '" + insttTySclas + "'"); // insttTySclas
			sb.append(", '" + telno + "'"); // telno
			sb.append(", '" + fxnum + "'"); // fxnum
			sb.append(", '" + creatDe + "'"); // creatDe
			sb.append(", '" + ablDe + "'"); // ablDe
			sb.append(", '" + ablEnnc + "'"); // ablEnnc
			sb.append(", '" + changede + "'"); // changede
			sb.append(", null"); // changeTime 변경시간
			sb.append(", null"); // bsisDe 기초일
			sb.append(", null"); // sortOrdr 정렬순서
			sb.append(", 'SYSTEM2'"); // frstRegisterId 최초등록자ID
			sb.append(", sysdate"); //
			sb.append(", null"); // LAST_UPDUSR_ID
			sb.append(", null"); // LAST_UPDT_PNTTM
			sb.append(");\n");

			// Object insert = insttCodeRecptnDAO.insert(
			// "InsttCodeRecptnDAO.insertInsttCode", insttCodeRecptn);

			// System.out.println("insert=" + insert);

			// System.out.println("기관코드=" + insttCode);
			// System.out.println("전체기관명=" + allInsttNm);
			// System.out.println("최하위기관명=" + lowestInsttNm);
			// System.out.println("차수=" + odr);
			// System.out.println("서열=" + ord);
			// System.out.println("소속기관차수=" + insttOdr);
			// System.out.println("차상위기관코드=" + upperInsttCode);
			// System.out.println("최상위기관코드=" + bestInsttCode);
			// System.out.println("대표기관코드=" + reprsntInsttCode);
			// System.out.println("유형분류_대=" + insttTyLclas);
			// System.out.println("유형분류_중=" + insttTyMclas);
			// System.out.println("유형분류_소=" + insttTySclas);
			// System.out.println("x 우편번호=" + zip);
			// System.out.println("x 행정동코드=" + adstrdCode);
			// System.out.println("x 소재지코드=" + locplcCode);
			// System.out.println("x 나머지주소=" + rmndrAdres);
			// System.out.println("x 지번=" + lnm);
			// System.out.println("전화번호=" + telno);
			// System.out.println("팩스번호=" + fxnum);
			// System.out.println("생성일자=" + creatDe);
			// System.out.println("폐지일자=" + ablDe);
			// System.out.println("변경일자=" + changede);
			// System.out.println("존폐여부=" + ablEnnc);
			// System.out.println("x 이전기관코드=" + beforeInsttCode);
			//
			// System.out.println("기관약어명=" + insttAbrvNm);

			i++;
		}

		// int executeBatch =
		// insttCodeRecptnDAO.getSqlMapClient().executeBatch();
		//
		// System.out.println("executeBatch=" + executeBatch);

		sb.append("\ncommit;\n");

		System.out.println(sb);

		File file = new File(pathname.replaceAll(".txt",
				EgovDateUtil.toString(new Date(), "yyyy-MM-dd HH-mm-ss", null)
						+ ".sql"));
		String data = sb.toString();
		String encoding = "ms949";
		FileUtils.writeStringToFile(file, data, encoding);
	}

}
