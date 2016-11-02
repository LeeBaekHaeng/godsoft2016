package godsoft.com.sub.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
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
			// items = (List<EgovMap>) list("Sub0103DAO.selectListMap", vo);
			items = (List<EgovMap>) list("Sub0103DAO.selectList", vo);
		} catch (Exception e) {
			logger.error("sqlMap=" + getClass());
			logger.error(e.getMessage());
		}

		return items;
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectListMapForEgovMap(Map<String, Object> vo) {
		List<EgovMap> items = null;

		try {
			items = (List<EgovMap>) list("Sub0103DAO.selectListMapForEgovMap",
					vo);
		} catch (Exception e) {
			logger.error("sqlMap=" + getClass());
			logger.error(e.getMessage());
		}

		return items;
	}

	@SuppressWarnings("unchecked")
	public List<Sub0103VO> selectListMapForVO(Map<String, Object> vo) {
		List<Sub0103VO> items = null;

		try {
			items = (List<Sub0103VO>) list("Sub0103DAO.selectListMapForVO", vo);
		} catch (Exception e) {
			logger.error("sqlMap=" + getClass());
			logger.error(e.getMessage());
		}

		return items;
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectListMapForResultMap(Map<String, Object> vo) {
		List<EgovMap> items = null;

		try {
			items = (List<EgovMap>) list(
					"Sub0103DAO.selectListMapForResultMap", vo);
		} catch (Exception e) {
			logger.error("sqlMap=" + getClass());
			logger.error(e.getMessage());
		}

		return items;
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectListMapForResultMapMap(
			Map<String, Object> vo) {
		List<Map<String, Object>> items = null;

		try {
			items = (List<Map<String, Object>>) list(
					"Sub0103DAO.selectListMapForResultMapMap", vo);
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

	public EgovMap select(Map<String, Object> vo) {
		EgovMap item = null;

		try {
			item = (EgovMap) select("Sub0103DAO.select", vo);
			// } catch (Exception e) {
			// logger.error("sqlMap=Sub0103DAO.select");
			// logger.error(getClass());
			// logger.error(e.getMessage());
		} catch (DataAccessException e) {
			logger.error("sqlMap=Sub0103DAO.select");

			logger.error(e.getMessage());

			SQLException se = (SQLException) e.getRootCause();

			logger.error("errorCode=" + se.getErrorCode());
			logger.error("message=" + se.getMessage());
			logger.error("SQLState=" + se.getSQLState());
		}

		return item;
	}

	public EgovMap selectForEgovMap(Map<String, Object> vo) {
		return (EgovMap) select("Sub0103DAO.selectForEgovMap", vo);
	}

}
