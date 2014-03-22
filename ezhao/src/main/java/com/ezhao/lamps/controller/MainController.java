package com.ezhao.lamps.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezhao.lamps.entity.Advertise;
import com.ezhao.lamps.entity.Certificate;
import com.ezhao.lamps.entity.CompanyInfo;
import com.ezhao.lamps.entity.SuccessfulCaseDetail;
import com.ezhao.lamps.service.AdvertiseService;
import com.ezhao.lamps.service.CertificateService;
import com.ezhao.lamps.service.CompanyInfoService;
import com.ezhao.lamps.service.SuccessfulCaseDetailService;

@Controller
public class MainController {
	@Resource
	private CompanyInfoService companyInfoService;
	@Resource
	private CertificateService certificateService;
	@Resource
	private SuccessfulCaseDetailService successfulCaseDetailSerivce;
	@Resource
	private AdvertiseService advertiseService;
	/**
	 * 进入首页
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/home")
	public String home(ModelMap map) throws Exception {
		CompanyInfo company = companyInfoService.findCompanyInfo();
		map.put("company", company);
		Advertise advertise = new Advertise();
		advertise.setTypeId(1);
		List<Advertise> middleAdvertise = advertiseService.findByTypeId(advertise);
		map.put("middleAdvertise", middleAdvertise);
		advertise.setTypeId(2);
		List<Advertise> bottomAdvertise = advertiseService.findByTypeId(advertise);
		map.put("bottomAdvertise", bottomAdvertise);
		advertise.setTypeId(4);
		List<Advertise> weixin = advertiseService.findByTypeId(advertise);
		if(weixin.size() > 0){
			map.put("weixin", weixin.get(0));
		}
		return "/cn/index";
	}
	
	@RequestMapping(value = "/product")
	public String productCenter(ModelMap map) throws Exception {
		try{
			CompanyInfo obj = companyInfoService.findCompanyInfo();
			map.put("obj", obj);
		}catch(Exception e){
		}
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
		try{
			CompanyInfo obj = companyInfoService.findCompanyInfo();
			map.put("obj", obj);
		}catch(Exception e){
		}
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
		try{
			CompanyInfo obj = companyInfoService.findCompanyInfo();
			map.put("obj", obj);
		}catch(Exception e){
		}
		
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
		try{
			List<Certificate> all = certificateService.findAll();
			map.put("all", all);
			CompanyInfo obj = companyInfoService.findCompanyInfo();
			map.put("obj", obj);
		}catch(Exception e){
		}
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
		try{
			CompanyInfo obj = companyInfoService.findCompanyInfo();
			map.put("obj", obj);
		}catch(Exception e){
		}
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
		try{
			CompanyInfo obj = companyInfoService.findCompanyInfo();
			map.put("obj", obj);
			List<SuccessfulCaseDetail> all = successfulCaseDetailSerivce.findAll();
			map.put("all", all);
		}catch(Exception e){
		}
		return "/cn/successfulcase";
	}
	
	/**
	 * 成功案例
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/successful/case/{id}")
	public String singleSuccessfulCase(ModelMap map,@PathVariable(value="id") int id) throws Exception {
		try{
			CompanyInfo obj = companyInfoService.findCompanyInfo();
			map.put("obj", obj);
			SuccessfulCaseDetail caseObj = new SuccessfulCaseDetail();
			caseObj.setId(id);
			SuccessfulCaseDetail one = successfulCaseDetailSerivce.findById(caseObj);
			map.put("one", one);
			List<SuccessfulCaseDetail> all = successfulCaseDetailSerivce.findAll();
			map.put("all", all);
		}catch(Exception e){
		}
		return "/cn/successfulcaseone";
	}
}
