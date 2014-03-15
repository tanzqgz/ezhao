package com.ezhao.lamps.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezhao.lamps.entity.CompanyInfo;
import com.ezhao.lamps.service.CompanyInfoService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	@Resource
	private CompanyInfoService companyInfoService;
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
	 * 导航到公司管理页面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/nav/companyinfo/home")
	public String navCompanyManager(ModelMap map) throws Exception{
		CompanyInfo obj = companyInfoService.findCompanyInfo();
		map.put("companyInfo", obj);
		System.out.println("================");
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
		System.out.println("===============save=");
		return "/admin/companyinfo";
	}
}
