package godsoft.com;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class GodTest {

	@Test
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

}
