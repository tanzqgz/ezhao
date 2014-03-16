package com.ezhao.lamps.controller;


import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ezhao.lamps.entity.Certificate;
import com.ezhao.lamps.entity.CompanyInfo;
import com.ezhao.lamps.service.CertificateService;
import com.ezhao.lamps.service.CompanyInfoService;
import com.ezhao.lamps.utils.UploadUtils;
import com.ezhao.lamps.vo.FileForm;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	@Resource
	private CompanyInfoService companyInfoService;
	@Resource
	private CertificateService certificateService;
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
}
