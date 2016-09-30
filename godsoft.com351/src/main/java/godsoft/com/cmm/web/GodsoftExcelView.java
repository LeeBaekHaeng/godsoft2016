package godsoft.com.cmm.web;

import godsoft.com.cmm.util.GodUtils;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class GodsoftExcelView extends AbstractExcelView {

	// pom.xml
	// <!-- <dependency> -->
	// <!-- <groupId>xmlbeans</groupId> -->
	// <!-- <artifactId>xbean</artifactId> -->
	// <!-- <version>2.2.0</version> -->
	// <!-- </dependency> -->

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// filename
		String filename = (String) model.get("filename");
		GodUtils.setDisposition(filename, request, response);

		// jxls
		XLSTransformer transformer = new XLSTransformer();

		Resource resource = new ClassPathResource(
				(String) model.get("template"));

		Workbook workbook2 = transformer.transformXLS(
				resource.getInputStream(), model);

		workbook2.write(response.getOutputStream());
	}

}
