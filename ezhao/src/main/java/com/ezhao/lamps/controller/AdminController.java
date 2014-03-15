package com.ezhao.lamps.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@RequestMapping(value = "/home")
	public String home(ModelMap map) throws Exception {
		return "/admin/admin";
	}
	
}
