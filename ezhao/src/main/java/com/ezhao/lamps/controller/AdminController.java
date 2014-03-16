package com.ezhao.lamps.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		int id = obj.getId();
		System.out.println(obj.getId());
		System.out.println(obj.getAddress());
		if(id == 0){
			companyInfoService.save(obj);
			System.out.println("===============save");
		}else{
			companyInfoService.update(obj);
			System.out.println("===============update");
		}
		map.addAttribute("message","修改成功");
		map.addAttribute("callbackType", "closeCurrent");
		map.addAttribute("retReloadTab", "sec_companyinfo_page");
		return "/message/operationMessage";
	}
}
