//package godsoft.com.cmm.service.impl;
//
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//
//import org.springframework.ui.ModelMap;
//
//import egovframework.com.cmm.EgovMessageSource;
//import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
//import egovframework.rte.fdl.property.EgovPropertyService;
//import egovframework.rte.psl.dataaccess.util.EgovMap;
//import godsoft.com.cmm.service.GenericService;
//
//public class GenericServiceImpl<T> extends EgovAbstractServiceImpl implements
//		GenericService<T> {
//
//	protected GenericDao<T> genericDao;
//
//	@Resource(name = "propertiesService")
//	protected EgovPropertyService propertyService;
//
//	// @Resource(name = "ForestFecCmmService")
//	// protected ForestFecCmmService forestFecCmmService;
//
//	@Resource(name = "egovMessageSource")
//	protected EgovMessageSource egovMessageSource;
//
//	@Override
//	@PostConstruct
//	public void init() {
//	}
//
//	@Override
//	public void validate(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void check(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void search(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void contact(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void action(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void read(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void write(T vo, ModelMap model) {
//	}
//
//	@Override
//	public int insert(T vo) {
//		return genericDao.insert(vo);
//	}
//
//	@Override
//	public int insert2(T vo) {
//		return genericDao.insert2(vo);
//	}
//
//	@Override
//	public T select(T vo) {
//		return genericDao.select(vo);
//	}
//
//	@Override
//	public T select2(T vo) {
//		return genericDao.select2(vo);
//	}
//
//	@Override
//	public List<EgovMap> selectList(T vo) {
//		return genericDao.selectList(vo);
//	}
//
//	@Override
//	public List<EgovMap> selectList2(T vo) {
//		return genericDao.selectList2(vo);
//	}
//
//	@Override
//	public int update(T vo) {
//		return genericDao.update(vo);
//	}
//
//	@Override
//	public int update2(T vo) {
//		return genericDao.update2(vo);
//	}
//
//	@Override
//	public int delete(T vo) {
//		return genericDao.delete(vo);
//	}
//
//	@Override
//	public int delete2(T vo) {
//		return genericDao.delete2(vo);
//	}
//
//	@Override
//	public int merge(T vo) {
//		return genericDao.merge(vo);
//	}
//
//	@Override
//	public int merge2(T vo) {
//		return genericDao.merge2(vo);
//	}
//
//	@Override
//	public int multi(T vo) {
//		return genericDao.multi(vo);
//	}
//
//	@Override
//	public int multi2(T vo) {
//		return genericDao.multi2(vo);
//	}
//
//	@Override
//	public void insertForm(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void insert(T vo, ModelMap model) {
//		int insert = genericDao.insert(vo);
//
//		model.addAttribute("insert", insert);
//
//		forestFecCmmService.messageInsert(insert, model);
//	}
//
//	@Override
//	public void insertForm2(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void insert2(T vo, ModelMap model) {
//		int insert2 = genericDao.insert2(vo);
//
//		model.addAttribute("insert2", insert2);
//
//		forestFecCmmService.messageInsert(insert2, model);
//	}
//
//	@Override
//	public void select(T vo, ModelMap model) {
//		T select = genericDao.select(vo);
//
//		model.addAttribute("select", select);
//	}
//
//	@Override
//	public void select2(T vo, ModelMap model) {
//		T select2 = genericDao.select2(vo);
//
//		model.addAttribute("select2", select2);
//	}
//
//	@Override
//	public void selectList(T vo, ModelMap model) {
//		model.addAttribute("selectList", genericDao.selectList(vo));
//
//		model.addAttribute("selectListCount", genericDao.selectListCount(vo));
//
//		forestFecCmmService.pageUnits(model);
//	}
//
//	@Override
//	public void selectList2(T vo, ModelMap model) {
//		model.addAttribute("selectList2", genericDao.selectList2(vo));
//
//		model.addAttribute("selectListCount2", genericDao.selectListCount2(vo));
//
//		forestFecCmmService.pageUnits(model);
//	}
//
//	@Override
//	public void updateForm(T vo, ModelMap model) {
//		select(vo, model);
//	}
//
//	@Override
//	public void update(T vo, ModelMap model) {
//		int update = genericDao.update(vo);
//
//		model.addAttribute("update", update);
//
//		forestFecCmmService.messageUpdate(update, model);
//	}
//
//	@Override
//	public void updateForm2(T vo, ModelMap model) {
//		select2(vo, model);
//	}
//
//	@Override
//	public void update2(T vo, ModelMap model) {
//		int update2 = genericDao.update2(vo);
//
//		model.addAttribute("update2", update2);
//
//		forestFecCmmService.messageUpdate(update2, model);
//	}
//
//	@Override
//	public void deleteForm(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void delete(T vo, ModelMap model) {
//		int delete = genericDao.delete(vo);
//
//		model.addAttribute("delete", delete);
//
//		forestFecCmmService.messageDelete(delete, model);
//	}
//
//	@Override
//	public void deleteForm2(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void delete2(T vo, ModelMap model) {
//		int delete2 = genericDao.delete2(vo);
//
//		model.addAttribute("delete2", delete2);
//
//		forestFecCmmService.messageDelete(delete2, model);
//	}
//
//	@Override
//	public void mergeForm(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void merge(T vo, ModelMap model) {
//		int merge = genericDao.merge(vo);
//
//		model.addAttribute("merge", merge);
//	}
//
//	@Override
//	public void mergeForm2(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void merge2(T vo, ModelMap model) {
//		int merge2 = genericDao.merge2(vo);
//
//		model.addAttribute("merge2", merge2);
//	}
//
//	@Override
//	public void multiForm(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void multi(T vo, ModelMap model) {
//		int multi = genericDao.multi(vo);
//
//		model.addAttribute("multi", multi);
//	}
//
//	@Override
//	public void multiForm2(T vo, ModelMap model) {
//	}
//
//	@Override
//	public void multi2(T vo, ModelMap model) {
//		int multi2 = genericDao.multi2(vo);
//
//		model.addAttribute("multi2", multi2);
//	}
//
// }
