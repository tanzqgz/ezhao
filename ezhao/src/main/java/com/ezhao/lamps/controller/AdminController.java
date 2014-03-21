package com.ezhao.lamps.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ezhao.lamps.entity.Advertise;
import com.ezhao.lamps.entity.AdvertiseType;
import com.ezhao.lamps.entity.Category;
import com.ezhao.lamps.entity.Certificate;
import com.ezhao.lamps.entity.CompanyInfo;
import com.ezhao.lamps.entity.SuccessfulCaseCategory;
import com.ezhao.lamps.entity.SuccessfulCaseDetail;
import com.ezhao.lamps.service.AdvertiseTypeService;
import com.ezhao.lamps.service.AdvertiseService;
import com.ezhao.lamps.service.CategoryService;
import com.ezhao.lamps.service.CertificateService;
import com.ezhao.lamps.service.CompanyInfoService;
import com.ezhao.lamps.service.SuccessfulCaseCategoryService;
import com.ezhao.lamps.service.SuccessfulCaseDetailService;
import com.ezhao.lamps.utils.UploadUtils;
import com.ezhao.lamps.vo.FileForm;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	@Resource
	private CompanyInfoService companyInfoService;
	@Resource
	private CertificateService certificateService;
	@Resource
	private SuccessfulCaseCategoryService successfulCase;
	@Resource
	private SuccessfulCaseDetailService successfulCaseDetailService;
	@Resource
	private CategoryService categoryService;
	@Resource
	private AdvertiseTypeService advertiseTypeService;
	@Resource
	private AdvertiseService advertiseService;
	
	/**
	 * 后台管理主页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/home")
	public String home(ModelMap map) throws Exception {
		return "/admin/admin";
	}
	
	/**
	 * 导航到公司介绍页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/nav/companyinfo/home")
	public String navCompanyManager(ModelMap map) throws Exception{
		CompanyInfo obj = companyInfoService.findCompanyInfo();
		map.put("companyInfo", obj);
		return "/admin/companyinfo";
	}
	
	/**
	 * 保存公司基本信息
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/nav/companyinfo/save")
	public String companyInfoSave(ModelMap map, CompanyInfo obj) throws Exception{
		int id = obj.getId();
		if(id == 0){
			companyInfoService.save(obj);
		}else{
			companyInfoService.update(obj);
		}
		map.addAttribute("message","修改成功");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_companyinfo_page");
		return "/message/operationMessage";
	}
	
	/**
	 * 导航到公司介绍页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/nav/certificate")
	public String navCertificateUpload(ModelMap map) throws Exception{
		List<Certificate> all = certificateService.findAll();
		map.put("all", all);
		return "/admin/uploadCertificate";
	}
	
	/**
	 * 导航到公司介绍页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/certificate/upload", method = RequestMethod.POST)
	public String certificateImageUpload(ModelMap map, FileForm form) throws Exception{
		MultipartFile file = form.getFile();
		String relativePath = null;
		if(file != null && !file.isEmpty()){//保存图片
			relativePath = UploadUtils.saveFile(file.getInputStream(),file.getOriginalFilename());
			Certificate obj = new Certificate();
			obj.setDescription(form.getDescription());
			obj.setUrl(relativePath);
			certificateService.save(obj);
		}
		map.addAttribute("message","保存成功，请重新刷新页面");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_certificate_page");
		return "/message/operationMessage";
	}
	
	/**
	 * 删除证书
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/certificate/delete")
	public String certificateImageDelete(ModelMap map, Certificate obj) throws Exception{
		certificateService.delete(obj);
		map.addAttribute("message","删除成功");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_certificate_page");
		return "/message/operationMessage";
	}
	
	/**
	 * 导航到成功案例分类页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/category/successful/case")
	public String navSuccessfulCase(ModelMap map) throws Exception{
		List<SuccessfulCaseCategory> all = successfulCase.findAll();
		map.put("all", all);
		return "/admin/successfulcasecategory";
	}
	
	/**
	 * 保存成功案例分类
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/category/successful/case/save")
	public String saveSuccessfulCase(ModelMap map,SuccessfulCaseCategory obj) throws Exception{
		obj.setIsLeaf("Y");
		successfulCase.save(obj);
		map.addAttribute("message","保存成功，请重新刷新页面");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_certificate_page");
		return "/message/operationMessage";
	}
	
	/**
	 * 删除成功案例分类
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/category/successful/case/delete")
	public String successfulCaseCategoryDelete(ModelMap map, SuccessfulCaseCategory obj) throws Exception{
		successfulCase.delete(obj);
		map.addAttribute("message","删除成功");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_successfulcase_page");
		return "/message/operationMessage";
	}
	
	
	/**
	 * 导航到案例添加页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/detail/successful/case")
	public String navSuccessfulCaseDetail(ModelMap map) throws Exception{
		return "/admin/successfulcasedetailadd";
	}
	
	/**
	 * 导航到显示所有成功案例页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/detail/successful/case/list")
	public String navSuccessfulCaseDetailList(ModelMap map) throws Exception{
		List<SuccessfulCaseDetail> all = successfulCaseDetailService.findAll();
		map.put("all", all);
		return "/admin/successfulcasedetaillist";
	}
	
	/**
	 * 保存案例
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/detail/successful/case/save")
	public String successfulCaseDetailSave(ModelMap map,FileForm form, SuccessfulCaseDetail obj) throws Exception{
		try{
			MultipartFile file = form.getFile();
			String relativePath = null;
			if(file != null && !file.isEmpty()){//保存图片
				relativePath = UploadUtils.saveFile(file.getInputStream(),file.getOriginalFilename());
				obj.setPictureURL(relativePath);
				successfulCaseDetailService.save(obj);
			}
		}catch(Exception e){
		}
		map.addAttribute("message","保存成功，请重新刷新页面");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_successfulcasedetailsave_page");
		return "/message/operationMessage";
	}
	
	/**
	 * 删除成功案例
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/detail/successful/case/delete")
	public String successfulCaseDetailDelete(ModelMap map, SuccessfulCaseDetail obj) throws Exception{
		successfulCaseDetailService.delete(obj);
		map.addAttribute("message","删除成功");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_successfulcase_page");
		return "/message/operationMessage";
	}
	
	/**
	 * 导航到产品分类页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/product/category")
	public String navProductCategory(ModelMap map) throws Exception{
		List<Category> all = categoryService.findAll();
		map.put("all", all); 
		return "/admin/productcategory";
	}
	
	/**
	 * 保存产品分类
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/product/category/save")
	public String saveProductCategory(ModelMap map,Category obj) throws Exception{
		try{
			obj.setIsLeaf("Y");
			categoryService.save(obj);
			map.addAttribute("message","保存成功，请重新刷新页面");
			map.addAttribute("callbackType", "closeCurrent");
			map.addAttribute("retReloadTab", "product_category_page"); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return "/message/operationMessage";
	}
	
	/**
	 * 删除成功案例分类
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/product/category/delete")
	public String deleteProductCategory(ModelMap map, Category obj) throws Exception{
		categoryService.delete(obj);
		map.addAttribute("message","删除成功");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_successfulcase_page");
		return "/message/operationMessage";
	}
	
	/**
	 * 导航广告管理页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/advertise/manager")
	public String navAdvertiseManager(ModelMap map) throws Exception{
		List<AdvertiseType> adTypeAll = advertiseTypeService.findAll();
		map.put("adTypeAll", adTypeAll);
		List<Advertise> adAll = advertiseService.findAll();
		map.put("all", adAll);
		return "/admin/advertiseManager";
	}
	
	/**
	 * 保存广告
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/advertise/save")
	public String saveAdvertise(ModelMap map,FileForm form, Advertise obj) throws Exception{
		try{
			MultipartFile file = form.getFile();
			String relativePath = null;
			if(file != null && !file.isEmpty()){//保存图片
				relativePath = UploadUtils.saveFile(file.getInputStream(),file.getOriginalFilename());
				obj.setAdvertiseURL(relativePath);
			}
			MultipartFile file1 = form.getFile1();
			if(file != null && !file.isEmpty()){//保存图片
				relativePath = UploadUtils.saveFile(file1.getInputStream(),file1.getOriginalFilename());
				obj.setAdvertiseURLEN(relativePath);
				advertiseService.save(obj);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		map.addAttribute("message","保存成功，请重新刷新页面");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_successfulcasedetailsave_page");
		return "/message/operationMessage";
	}
	
	/**
	 * 删除广告
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/advertise/delete")
	public String deleteAdvertise(ModelMap map, Advertise obj) throws Exception{
		advertiseService.delete(obj);
		map.addAttribute("message","删除成功");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_successfulcase_page");
		return "/message/operationMessage";
	}
}
