package godsoft.com.sub.service.impl;

import java.util.List;

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

	public int selectListCount(Sub0103VO vo) {
		return (int) select("Sub0103DAO.selectListCount", vo);
	}

}
