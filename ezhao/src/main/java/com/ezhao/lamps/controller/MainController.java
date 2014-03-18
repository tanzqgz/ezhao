package com.ezhao.lamps.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezhao.lamps.entity.Certificate;
import com.ezhao.lamps.entity.CompanyInfo;
import com.ezhao.lamps.service.CertificateService;
import com.ezhao.lamps.service.CompanyInfoService;

@Controller
public class MainController {
	@Resource
	private CompanyInfoService companyInfoService;
	@Resource
	private CertificateService certificateService;
	/**
	 * 进入首页
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/home")
	public String home(ModelMap map) throws Exception {
		return "/cn/index";
	}
	
	@RequestMapping(value = "/product")
	public String productCenter(ModelMap map) throws Exception {
		System.out.println("==================product");
		return "/cn/productCenter";
	}
	
	/**
	 * 公司介绍
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/about/company")
	public String aboutUs(ModelMap map) throws Exception {
		CompanyInfo obj = companyInfoService.findCompanyInfo();
		map.put("obj", obj);
		return "/cn/aboutus";
	}
	
	/**
	 * 联系我们
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/about/contact/us")
	public String contactUs(ModelMap map) throws Exception {
		CompanyInfo obj = companyInfoService.findCompanyInfo();
		map.put("obj", obj);
		return "/cn/contactus";
	}
	
	/**
	 * 证书
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/about/certificate")
	public String navCerficate(ModelMap map) throws Exception {
		List<Certificate> all = certificateService.findAll();
		map.put("all", all);
		CompanyInfo obj = companyInfoService.findCompanyInfo();
		map.put("obj", obj);
		return "/cn/certificate";
	}
	
	/**
	 * 营销网络
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/marketing")
	public String navMarketing(ModelMap map) throws Exception {
		CompanyInfo obj = companyInfoService.findCompanyInfo();
		map.put("obj", obj);
		return "/cn/marketing";
	}
	
	/**
	 * 成功案例
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/successful/case")
	public String navSuccessfulCase(ModelMap map) throws Exception {
		CompanyInfo obj = companyInfoService.findCompanyInfo();
		map.put("obj", obj);
		return "/cn/successfulcase";
	}
}
