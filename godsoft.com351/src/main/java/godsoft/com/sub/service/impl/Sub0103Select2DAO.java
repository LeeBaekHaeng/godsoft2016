package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.cmm.service.impl.GodEgovComAbstractDAO;

import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

/**
 * 서브0103 DAO
 * 
 * @author 이백행&lt;dlqorgod@naver.com&gt;
 *
 */
@Repository
public class Sub0103Select2DAO extends GodEgovComAbstractDAO {

	public EgovMap select2(Map<String, Object> vo) {
		EgovMap item = null;

		try {
			item = (EgovMap) select("Sub0103DAO.select2", vo);
		} catch (DataAccessException e) {
			logger.error("sqlMap=Sub0103DAO.select2");

			error(e);
		}

		return item;
	}

	public EgovMap select2ForEgovMap(Map<String, Object> vo) {
		EgovMap item = null;

		try {
			item = (EgovMap) select("Sub0103DAO.select2ForEgovMap", vo);
		} catch (DataAccessException e) {
			logger.error("sqlMap=Sub0103DAO.select2ForEgovMap");

			error(e);
		}

		return item;
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> select2ForMap(Map<String, Object> vo) {
		Map<String, Object> item = null;

		try {
			item = (Map<String, Object>) select("Sub0103DAO.select2ForMap", vo);
		} catch (DataAccessException e) {
			logger.error("sqlMap=Sub0103DAO.select2ForMap");

			error(e);
		}

		return item;
	}

	public Map<?, ?> select2ForListOrderedMap(Map<?, ?> vo) {
		Map<?, ?> item = null;

		try {
			item = (Map<?, ?>) select("Sub0103DAO.select2ForListOrderedMap", vo);
		} catch (DataAccessException e) {
			logger.error("sqlMap=Sub0103DAO.select2ForListOrderedMap");

			error(e);
		}

		return item;
	}

}
