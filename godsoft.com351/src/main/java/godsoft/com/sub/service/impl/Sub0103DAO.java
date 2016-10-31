package godsoft.com.sub.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.sub.service.Sub0103VO;

/**
 * 서브0103 DAO
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@Repository
public class Sub0103DAO extends EgovComAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(Sub0103VO vo) {
		List<EgovMap> items = null;

		try {
			items = (List<EgovMap>) list("Sub0103DAO.selectList", vo);
		} catch (Exception e) {
			logger.error("sqlMap=" + getClass());
		}

		return items;
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(Map<String, Object> vo) {
		List<EgovMap> items = null;

		try {
			items = (List<EgovMap>) list("Sub0103DAO.selectListMap", vo);
		} catch (Exception e) {
			logger.error("sqlMap=" + getClass());
			logger.error(e.getMessage());
		}

		return items;
	}

	public int selectListCount(Sub0103VO vo) {
		return (int) select("Sub0103DAO.selectListCount", vo);
	}

	public int selectListCount(Map<String, Object> vo) {
		return (int) select("Sub0103DAO.selectListCountMap", vo);
	}

}
