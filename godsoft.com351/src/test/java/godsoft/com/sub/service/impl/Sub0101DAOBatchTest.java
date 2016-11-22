package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.psl.orm.ibatis.SqlMapClientCallback;
import godsoft.com.sub.service.Sub0101VO;
import godsoft.com.sub.service.Sub0102VO;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ibatis.sqlmap.client.SqlMapExecutor;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:egovframework/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/**/context-*.xml",
		"classpath:godsoft/spring/com/test-dao-context.xml", })
public class Sub0101DAOBatchTest {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private Sub0101DAO sub0101DAO;

	@Autowired
	private Sub0102DAO sub0102DAO;

	@Test
	public void test() throws Exception {
		// selectList();
		// updateBatch();
		// execute();
		execute2();
	}

	public void selectList() throws Exception {
		Sub0101VO vo = new Sub0101VO();

		vo.setCodeId("COM001");

		// vo.setUseAt("Y");

		vo.setFirstIndex(0);
		vo.setRecordCountPerPage(Integer.MAX_VALUE);

		List<EgovMap> items = sub0101DAO.selectList(vo);

		logger.debug("items=" + items);
		logger.debug("size=" + items.size());

		int i = 1;

		// sub0101DAO.getSqlMapClient().startBatch();
		// sub0102DAO.getSqlMapClient().startBatch();

		// sub0102DAO.getSqlMapClient().startBatch();

		// SqlMapClient sqlMapClient = sub0102DAO.getSqlMapClient();
		// sqlMapClient.startBatch();

		// List executeBatchDetailed = sub0102DAO.getSqlMapClient()
		// .executeBatchDetailed();
		// List executeBatchDetailed = sqlMapClient.executeBatchDetailed();

		for (EgovMap item : items) {
			logger.debug("item=" + item);

			String codeId = MapUtils.getString(item, "codeId");
			String code = MapUtils.getString(item, "code");

			String iString = String.format("%02d", i);

			logger.debug("codeId=" + codeId);

			Sub0102VO sub0102VO = new Sub0102VO();
			sub0102VO.setCodeId(codeId);
			sub0102VO.setCode(code);
			sub0102VO.setCodeDc(iString);
			// int updateIsNotEmpty = sub0102DAO.updateIsNotEmpty(sub0102VO);
			// int updateIsNotEmpty = sub0102DAO.update(
			// "Sub0102DAO.updateIsNotEmpty", sub0102VO);
			// int updateIsNotEmpty = sub0102DAO.getSqlMapClient().update(
			// "Sub0102DAO.updateIsNotEmpty", sub0102VO);
			// int updateIsNotEmpty = sqlMapClient.update(
			// "Sub0102DAO.updateIsNotEmpty", sub0102VO);
			//
			// logger.debug("updateIsNotEmpty=" + updateIsNotEmpty);

			i++;
		}

		// int executeBatch = sub0101DAO.getSqlMapClient().executeBatch();
		// int executeBatch = sub0102DAO.getSqlMapClient().executeBatch();
		// int executeBatch = sqlMapClient.executeBatch();
		// logger.debug("executeBatch=" + executeBatch);

		// List executeBatchDetailed = sub0102DAO.getSqlMapClient()
		// .executeBatchDetailed();

		// if (executeBatchDetailed != null) {
		// logger.debug("executeBatchDetailed=" + executeBatchDetailed);
		// logger.debug("size=" + executeBatchDetailed.size());
		// }
	}

	public void updateBatch() {
		Sub0101VO vo = new Sub0101VO();
		vo.setCodeId("COM001");

		int updateBatch = sub0101DAO.updateBatch(vo);

		logger.debug("updateBatch=" + updateBatch);

		// sub0101DAO.getSqlMapClientTemplate().execute(action)
	}

	@SuppressWarnings("deprecation")
	public void execute() {
		sub0101DAO.getSqlMapClientTemplate().execute(
				new SqlMapClientCallback<T>() {
					@Override
					public T doInSqlMapClient(SqlMapExecutor executor)
							throws SQLException {

						executor.startBatch();

						Sub0102VO vo = new Sub0102VO();
						vo.setCodeId("COM001");

						for (int i = 1; i < 3; i++) {
							String iString = String.format("%02d", i);

							vo.setCode(iString);
							vo.setCodeDc(iString);

							int update = executor.update(
									"Sub0102DAO.updateIsNotEmpty", vo);

							logger.debug("update=" + update);
						}

						int executeBatch = executor.executeBatch();

						logger.debug("executeBatch=" + executeBatch);

						return null;
					}
				});
	}

	@SuppressWarnings("deprecation")
	public void execute2() throws Exception {
		Sub0101VO vo = new Sub0101VO();

		vo.setCodeId("COM001");

		// vo.setUseAt("Y");

		vo.setFirstIndex(0);
		vo.setRecordCountPerPage(Integer.MAX_VALUE);

		final List<EgovMap> items = sub0101DAO.selectList(vo);

		logger.debug("items=" + items);
		logger.debug("size=" + items.size());

		sub0101DAO.getSqlMapClientTemplate().execute(
				new SqlMapClientCallback<T>() {
					@Override
					public T doInSqlMapClient(SqlMapExecutor executor)
							throws SQLException {

						executor.startBatch();

						int i = 1;

						for (EgovMap item : items) {
							logger.debug("item=" + item);

							String codeId = MapUtils.getString(item, "codeId");
							String code = MapUtils.getString(item, "code");

							String iString = String.format("%02d", i);

							logger.debug("codeId=" + codeId);

							Sub0102VO sub0102VO = new Sub0102VO();
							sub0102VO.setCodeId(codeId);
							sub0102VO.setCode(code);
							sub0102VO.setCodeDc(iString);

							int update = executor.update(
									"Sub0102DAO.updateIsNotEmpty", sub0102VO);

							logger.debug("update=" + update);

							i++;
						}

						int executeBatch = executor.executeBatch();

						logger.debug("executeBatch=" + executeBatch);

						return null;
					}
				});
	}

}
