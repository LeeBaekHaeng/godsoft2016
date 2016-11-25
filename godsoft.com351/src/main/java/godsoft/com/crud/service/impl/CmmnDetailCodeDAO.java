package godsoft.com.crud.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Repository
public class CmmnDetailCodeDAO extends EgovComAbstractDAO {

	/**
	 * 공통상세코드 조회(멀티건) object for EgovMap
	 * 
	 * @param vo
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(CmmnDetailCode vo) {
		return (List<EgovMap>) list("CmmnDetailCodeDAO.selectList", vo);
	}

	/**
	 * 공통상세코드 조회(멀티건) object for EgovMap order by 코드ID, 코드설명
	 * 
	 * @param vo
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectListA1(CmmnDetailCode vo) {
		return (List<EgovMap>) list("CmmnDetailCodeDAO.selectListA1", vo);
	}

	/**
	 * 공통상세코드 조회(멀티건) object for CmmnDetailCode
	 * 
	 * @param vo
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<CmmnDetailCode> selectListForCmmnDetailCode(CmmnDetailCode vo) {
		return (List<CmmnDetailCode>) list(
				"CmmnDetailCodeDAO.selectListForCmmnDetailCode", vo);
	}

	/**
	 * 공통상세코드 조회(멀티건) map for EgovMap
	 * 
	 * @param vo
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectList(Map<String, Object> vo) {
		return (List<EgovMap>) list("CmmnDetailCodeDAO.selectList", vo);
	}

	/**
	 * 공통상세코드 조회(멀티건) map for CmmnDetailCode
	 * 
	 * @param vo
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<CmmnDetailCode> selectListForCmmnDetailCode(
			Map<String, Object> vo) {
		return (List<CmmnDetailCode>) list(
				"CmmnDetailCodeDAO.selectListForCmmnDetailCode", vo);
	}

}
