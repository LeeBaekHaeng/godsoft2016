package godsoft.com.sub.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.com.cmm.service.impl.GodEgovAbstractServiceImpl;
import godsoft.com.sub.service.Sub0102Service;
import godsoft.com.sub.service.Sub0102VO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class Sub0102ServiceImpl extends
		GodEgovAbstractServiceImpl<Sub0102VO, EgovMap> implements
		Sub0102Service {

	@Autowired
	private Sub0102DAO sub0102DAO;

	@Override
	public void postConstruct() {
		super.postConstruct();

		godEgovAbstractDAO = sub0102DAO;
	}

	@Override
	public Sub0102VO selectKey(Sub0102VO vo) throws Exception {
		return super.selectKey(vo);
	}

	@Override
	public Object insert(Sub0102VO vo) throws Exception {
		return super.insert(vo);
	}

	@Override
	public Sub0102VO select(Sub0102VO vo) throws Exception {
		return super.select(vo);
	}

	@Override
	public List<EgovMap> selectList(Sub0102VO vo) throws Exception {
		return super.selectList(vo);
	}

	@Override
	public int selectListCount(Sub0102VO vo) throws Exception {
		return super.selectListCount(vo);
	}

	@Override
	public int selectCount(Sub0102VO vo) throws Exception {
		return super.selectCount(vo);
	}

	@Override
	public int update(Sub0102VO vo) throws Exception {
		return super.update(vo);
	}

	@Override
	public int delete(Sub0102VO vo) throws Exception {
		return super.delete(vo);
	}

	@Override
	public int merge(Sub0102VO vo) throws Exception {
		return super.merge(vo);
	}

	@Override
	public int multi(Sub0102VO vo) throws Exception {
		return super.multi(vo);
	}

	@Override
	public void insertForm(Sub0102VO vo, ModelMap model) throws Exception {
		super.insertForm(vo, model);
	}

	@Override
	public void insert(Sub0102VO vo, ModelMap model) throws Exception {
		super.insert(vo, model);
	}

	@Override
	public void select(Sub0102VO vo, ModelMap model) throws Exception {
		super.select(vo, model);
	}

	@Override
	public void selectList(Sub0102VO vo, ModelMap model) throws Exception {
		super.selectList(vo, model);
	}

	@Override
	public void updateForm(Sub0102VO vo, ModelMap model) throws Exception {
		super.updateForm(vo, model);
	}

	@Override
	public void update(Sub0102VO vo, ModelMap model) throws Exception {
		super.update(vo, model);
	}

	@Override
	public void delete(Sub0102VO vo, ModelMap model) throws Exception {
		super.delete(vo, model);
	}

	@Override
	public void mergeFrom(Sub0102VO vo, ModelMap model) throws Exception {
		super.mergeFrom(vo, model);
	}

	@Override
	public void merge(Sub0102VO vo, ModelMap model) throws Exception {
		super.merge(vo, model);
	}

	@Override
	public void multiForm(Sub0102VO vo, ModelMap model) throws Exception {
		super.multiForm(vo, model);
	}

	@Override
	public void multi(Sub0102VO vo, ModelMap model) throws Exception {
		super.multi(vo, model);
	}

	@Override
	public void list(Sub0102VO vo, ModelMap model) throws Exception {
		super.list(vo, model);
	}

	@Override
	public void regist(Sub0102VO vo, ModelMap model) throws Exception {
		super.regist(vo, model);
	}

	@Override
	public void detail(Sub0102VO vo, ModelMap model) throws Exception {
		super.detail(vo, model);
	}

	@Override
	public void updt(Sub0102VO vo, ModelMap model) throws Exception {
		super.updt(vo, model);
	}

	@Override
	public void popup(Sub0102VO vo, ModelMap model) throws Exception {
		super.popup(vo, model);
	}

	@Override
	public void search(Sub0102VO vo, ModelMap model) throws Exception {
		super.search(vo, model);
	}

}
