package godsoft.com.cmm.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

public interface GodCmmService {

	String mergeFileInfs(String atchFileId, String KeyStr, String storePath,
			MultipartHttpServletRequest request) throws Exception;

	PaginationInfo selectListPrefix(ComDefaultVO vo);

	PaginationInfo selectListPrefix(Map<String, Object> vo);

}
