package godsoft.com.cmm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.ModelMap;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.property.EgovPropertyService;
import godsoft.com.cmm.service.GodEgovAbstractService;

public class GodEgovAbstractServiceImpl<T, E> extends EgovAbstractServiceImpl
		implements GodEgovAbstractService<T, E> {

	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;

	@Resource(name = "egovMessageSource")
	protected EgovMessageSource egovMessageSource;

	// @Resource(name = "godCmmService")
	// protected GodCmmService godCmmService;

	protected GodEgovAbstractDAO<T, E> godEgovAbstractDAO;

	@Override
	public void postConstruct() {
	}

	@Override
	public T selectKey(T vo) throws Exception {
		return godEgovAbstractDAO.selectKey(vo);
	}

	@Override
	public int insert(T vo) throws Exception {
		int insert = 0;

		try {
			Object o = godEgovAbstractDAO.insert(vo);

			egovLogger.debug("o=" + o);

			insert = 1;
		} catch (Exception e) {
			insert = 0;
		}

		return insert;
	}

	@Override
	public T select(T vo) throws Exception {
		return godEgovAbstractDAO.select(vo);
	}

	@Override
	public List<E> selectList(T vo) throws Exception {
		return godEgovAbstractDAO.selectList(vo);
	}

	@Override
	public int selectListCount(T vo) throws Exception {
		return godEgovAbstractDAO.selectListCount(vo);
	}

	@Override
	public int selectCount(T vo) throws Exception {
		return 0;
	}

	@Override
	public int update(T vo) throws Exception {
		return godEgovAbstractDAO.update(vo);
	}

	@Override
	public int delete(T vo) throws Exception {
		return godEgovAbstractDAO.delete(vo);
	}

	@Override
	public int merge(T vo) throws Exception {
		return godEgovAbstractDAO.merge(vo);
	}

	@Override
	public int multi(T vo) throws Exception {
		return godEgovAbstractDAO.multi(vo);
	}

	@Override
	public void insertForm(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void insert(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void select(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void selectList(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void updateForm(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void update(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void delete(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void mergeFrom(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void merge(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void multiForm(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void multi(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void list(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void regist(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void detail(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void updt(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void popup(T vo, ModelMap model) throws Exception {

	}

	@Override
	public void search(T vo, ModelMap model) throws Exception {

	}

}
