//package forest.core.generic.service.impl;
//
//import godsoft.com.cmm.service.GenericController;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springmodules.validation.commons.DefaultBeanValidator;
//
//public class GenericControllerImpl<T> implements GenericController<T> {
//
//	@Resource(name = "beanValidator")
//	private DefaultBeanValidator beanValidator;
//
//	protected GenericService<T> genericService;
//
//	protected Logger egovLogger = LoggerFactory
//			.getLogger(GenericControllerImpl.class);
//
//	@Override
//	@PostConstruct
//	public void init() {
//	}
//
//	@Override
//	@RequestMapping("/insertForm.do")
//	public void insertForm(T vo, ModelMap model) {
//		genericService.insertForm(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/insert.do")
//	public void insert(T vo, ModelMap model) {
//		genericService.insert(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/insertForm2.do")
//	public void insertForm2(T vo, ModelMap model) {
//		genericService.insertForm2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/insert2.do")
//	public void insert2(T vo, ModelMap model) {
//		genericService.insert2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/select.do")
//	public void select(T vo, ModelMap model) {
//		genericService.select(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/select2.do")
//	public void select2(T vo, ModelMap model) {
//		genericService.select2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/selectList.do")
//	public void selectList(T vo, ModelMap model) {
//		genericService.selectList(vo, model);
//
//		// model.addAttribute("pageUnits", new int[] { 10, 20, 30, 50, 100 });
//	}
//
//	@Override
//	@RequestMapping("/selectList2.do")
//	public void selectList2(T vo, ModelMap model) {
//		genericService.selectList2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/updateForm.do")
//	public void updateForm(T vo, ModelMap model) {
//		genericService.updateForm(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/update.do")
//	public void update(T vo, ModelMap model) {
//		genericService.update(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/updateForm2.do")
//	public void updateForm2(T vo, ModelMap model) {
//		genericService.updateForm2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/update2.do")
//	public void update2(T vo, ModelMap model) {
//		genericService.update2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/deleteForm.do")
//	public void deleteForm(T vo, ModelMap model) {
//		genericService.deleteForm(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/delete.do")
//	public void delete(T vo, ModelMap model) {
//		genericService.delete(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/deleteForm2.do")
//	public void deleteForm2(T vo, ModelMap model) {
//		genericService.deleteForm2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/delete2.do")
//	public void delete2(T vo, ModelMap model) {
//		genericService.delete2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/mergeForm.do")
//	public void mergeForm(T vo, ModelMap model) {
//		genericService.mergeForm(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/merge.do")
//	public void merge(T vo, ModelMap model) {
//		genericService.merge(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/mergeForm2.do")
//	public void mergeForm2(T vo, ModelMap model) {
//		genericService.mergeForm2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/merge2.do")
//	public void merge2(T vo, ModelMap model) {
//		genericService.merge2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/multiForm.do")
//	public void multiForm(T vo, ModelMap model) {
//		genericService.multiForm(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/multi.do")
//	public void multi(T vo, ModelMap model) {
//		genericService.multi(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/multiForm2.do")
//	public void multiForm2(T vo, ModelMap model) {
//		genericService.multiForm2(vo, model);
//	}
//
//	@Override
//	@RequestMapping("/multi2.do")
//	public void multi2(T vo, ModelMap model) {
//		genericService.multi2(vo, model);
//	}
//
// }
