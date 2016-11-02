/**
 *
 */
package godsoft.com.cmm.service.impl;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

/**
 * EgovComAbstractDAO.java 클래스
 *
 * @author 서준식
 * @since 2011. 9. 23.
 * @version 1.0
 * @see
 *
 *      <pre>
 * << 개정이력(Modification Information) >>
 * 
 *   수정일      수정자           수정내용
 *  -------    -------------    ----------------------
 *   2011. 9. 23.   서준식        최초 생성
 * </pre>
 */
public abstract class GodEgovComAbstractDAO extends EgovComAbstractDAO {

	public void error(DataAccessException e) {
		logger.error(e.getMessage());

		SQLException se = (SQLException) e.getRootCause();

		logger.error("errorCode=" + se.getErrorCode());
		logger.error("message=" + se.getMessage());
		logger.error("SQLState=" + se.getSQLState());
	}

}
