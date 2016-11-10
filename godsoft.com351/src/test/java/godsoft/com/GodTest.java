package godsoft.com;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class GodTest {

	protected Logger egovLogger = LoggerFactory.getLogger(getClass());

	// @Test
	public void test() {
		String pathname = "C:/eGovFrameDev-3.5.1-64bit/workspace-godsoft2016/test.test2/src/main/resources/egovframework/sqlmap/com";

		List<String> list = new ArrayList<String>();
		list.add("Altibase");
		list.add("Cubrid");
		list.add("Mysql");
		// list.add("Oracle");
		// list.add("Tibero");

		File directory = new File(pathname);
		String[] extensions = { "xml" };
		boolean recursive = true;

		Collection<File> listFiles = FileUtils.listFiles(directory, extensions,
				recursive);

		// for (File listFile : listFiles) {
		// // System.out.println("listFile=" + listFile);
		//
		// String name = listFile.getName();
		//
		// // System.out.println("name=" + name);
		//
		// if (name.indexOf("Altibase") != -1 || name.indexOf("Cubrid") != -1
		// || name.indexOf("Mysql") != -1) {
		//
		// System.out.println("listFile=" + listFile);
		//
		// boolean delete = listFile.delete();
		//
		// System.out.println("delete=" + delete);
		// }
		// }

		for (File listFile : listFiles) {
			// System.out.println("listFile=" + listFile);

			String name = listFile.getName();

			name = name.substring(name.lastIndexOf("_") + 1).replaceAll(".xml",
					"");

			// System.out.println("name=" + name);

			if (list.contains(name)) {
				System.out.println("listFile=" + listFile);

				boolean delete = listFile.delete();

				System.out.println("delete=" + delete);
			}
		}
	}

	/**
	 * svnadmin-dump.bat
	 */
	// @Test
	public void test2() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = new StringBuffer();

		for (int i = 1; i < 8; i++) {
			// String iString = String.format("%02d", i);

			sb.append("set REPOS_PATH_01_A" + i
					+ "=%REPOS_PATH_01%%REPOS_PATH_A" + i + "%");
			sb.append("\n");

			sb.append("set REPOS_PATH_02_A" + i
					+ "=%REPOS_PATH_02%%REPOS_PATH_A" + i
					+ "%_%god_yyyymmddhhmmss_a1%.dump");
			sb.append("\n\n");

			// sb2
			sb2.append("svnadmin dump %REPOS_PATH_01_A" + i
					+ "% > %REPOS_PATH_02_A" + i + "%");
			sb2.append("\n\n");

			// sb3
			sb3.append("echo REPOS_PATH_01_A" + i + "=%REPOS_PATH_01_A" + i
					+ "%");
			sb3.append("\n");
			sb3.append("echo REPOS_PATH_02_A" + i + "=%REPOS_PATH_02_A" + i
					+ "%");
			sb3.append("\n\n");
		}

		// System.out.println(sb);
		// System.out.println(sb2);
		System.out.println(sb3);
	}

	@Test
	public void test3() throws Exception {
		Resource resource = new FileSystemResource("./");

		egovLogger.debug("resource=" + resource);
		egovLogger.debug("resource=" + resource.getFile().getCanonicalPath());

		String pathname = resource.getFile().getCanonicalPath()
				+ "/src/main/resources/egovframework/spring/com";

		egovLogger.debug("pathname=" + pathname);

		String pathname2 = pathname.replaceAll("/", "\\\\");

		egovLogger.debug("pathname2=" + pathname2);

		File directory = new File(pathname);
		String[] extensions = { "xml" };
		boolean recursive = true;

		Collection<File> listFiles = FileUtils.listFiles(directory, extensions,
				recursive);

		StringBuffer sb = new StringBuffer();

		for (File listFile : listFiles) {
			// egovLogger.debug("listFile=" + listFile);

			String canonicalPath = listFile.getCanonicalPath();

			egovLogger.debug("canonicalPath=" + canonicalPath);

			String name = listFile.getName();

			egovLogger.debug("name=" + name);

			if (canonicalPath.indexOf("idgn") == -1) {
				sb.append("<import resource=\"classpath:egovframework/spring/com/"
						+ name + "\" />");
			} else {
				sb.append("<import resource=\"classpath:egovframework/spring/com/idgn/"
						+ name + "\" />");
			}

			sb.append("\n");
		}

		egovLogger.debug(sb.toString());
	}

}
