package com.ezhao.lamps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	/**
	 * 进入首页
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/home")
	public String home(ModelMap map) throws Exception {
		System.out.println("==================home");
		return "/intel/cn/index";
	}
	
	@RequestMapping(value = "/product")
	public String productCenter(ModelMap map) throws Exception {
		System.out.println("==================product");
		return "/intel/cn/productCenter";
	}
}
