package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.cmm.service.impl.GodGenericDAO;
import godsoft.com.sub.service.Sub0101VO;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.engine.execution.BatchException;

@Repository
public class Sub0101DAO extends GodGenericDAO<Sub0101VO, Sub0101VO, EgovMap> {

	@Override
	public void postConstruct() {
		super.postConstruct();

		queryId.put("selectList", "Sub0101DAO.selectList");
		queryId.put("selectListCount", "Sub0101DAO.selectListCount");
	}

	@Override
	public Object insert(Sub0101VO vo) throws Exception {
		return super.insert(vo);
	}

	@Override
	public Object insert2(Sub0101VO vo) throws Exception {
		return super.insert2(vo);
	}

	@Override
	public Sub0101VO select(Sub0101VO vo) throws Exception {
		return super.select(vo);
	}

	public Sub0101VO selectForObject(Sub0101VO vo) throws Exception {
		return (Sub0101VO) select("Sub0101DAO.selectForObject", vo);
	}

	@Override
	public Sub0101VO select2(Sub0101VO vo) throws Exception {
		return super.select2(vo);
	}

	@Override
	public List<EgovMap> selectList(Sub0101VO vo) throws Exception {
		return super.selectList(vo);
	}

	@Override
	public int selectListCount(Sub0101VO vo) throws Exception {
		return super.selectListCount(vo);
	}

	@Override
	public List<EgovMap> selectList2(Sub0101VO vo) throws Exception {
		return super.selectList2(vo);
	}

	@Override
	public int selectListCount2(Sub0101VO vo) throws Exception {
		return super.selectListCount2(vo);
	}

	@Override
	public int update(Sub0101VO vo) throws Exception {
		return super.update(vo);
	}

	@Override
	public int update2(Sub0101VO vo) throws Exception {
		return super.update2(vo);
	}

	public int updateBatch(Sub0101VO vo) {
		int update = 0;

		try {
			// getSqlMapClientTemplate().getSqlMapClient().startTransaction();
			// getSqlMapClient().startBatch();
			getSqlMapClientTemplate().getSqlMapClient().startBatch();

			// List executeBatchDetailed = getSqlMapClient()
			// .executeBatchDetailed();
			List executeBatchDetailed = getSqlMapClientTemplate()
					.getSqlMapClient().executeBatchDetailed();

			for (int i = 1; i < 3; i++) {
				String iString = String.format("%02d", i);

				vo.setCode(iString);
				vo.setCodeDc(iString);

				// int update2 = getSqlMapClient().update(
				// "Sub0102DAO.updateIsNotEmpty", vo);
				int update2 = getSqlMapClientTemplate().getSqlMapClient()
						.update("Sub0102DAO.updateIsNotEmpty", vo);

				logger.debug("update2=" + update2);
			}

			// update = getSqlMapClient().executeBatch();
			update = getSqlMapClientTemplate().getSqlMapClient().executeBatch();

			logger.debug("update=" + update);

			if (executeBatchDetailed != null) {
				logger.debug("executeBatchDetailed=" + executeBatchDetailed);
				logger.debug("size=" + executeBatchDetailed.size());
			}

			// getSqlMapClientTemplate().getSqlMapClient().commitTransaction();
			// getSqlMapClientTemplate().getSqlMapClient().endTransaction();
		} catch (SQLException e) {
			logger.error(e.getMessage());
		} catch (BatchException e) {
			logger.error(e.getMessage());
		}

		return update;
	}

	@Override
	public int delete(Sub0101VO vo) throws Exception {
		return super.delete(vo);
	}

	@Override
	public int delete2(Sub0101VO vo) throws Exception {
		return super.delete2(vo);
	}

	@Override
	public int merge(Sub0101VO vo) throws Exception {
		return super.merge(vo);
	}

	@Override
	public int merge2(Sub0101VO vo) throws Exception {
		return super.merge2(vo);
	}

	@Override
	public int multi(Sub0101VO vo) throws Exception {
		return super.multi(vo);
	}

	@Override
	public int multi2(Sub0101VO vo) throws Exception {
		return super.multi2(vo);
	}

}
