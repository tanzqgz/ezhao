package com.ezhao.lamps.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezhao.lamps.entity.User;
import com.ezhao.lamps.interceptor.LoginInterceptor;
import com.ezhao.lamps.service.UserService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Resource
	private UserService userService = null;
	
	@RequestMapping(value = "/home")
	public String login(ModelMap map) throws Exception {
		return "/admin/login";
	}
	
	@RequestMapping(value = "/page")
	public String redirectLogin(ModelMap map) throws Exception {
		map.addAttribute("msg","用户或密码错误");
		return "/admin/login";
	}
	
	@RequestMapping(value = "/submit")
	public String submit(ModelMap map,HttpServletRequest request,User user) throws Exception{
		List<User> users = userService.findUserByLoginNameAndPwd(user.getLoginName(), user.getPassword());
		String retPage = null;
		if(users.size() == 1){
			request.getSession().setAttribute(LoginInterceptor.SESSION_LOGIN_TOKEN, users.get(0).getLoginName());
			retPage = "redirect:/admin/home";
		}else{
			retPage = "forward:/login/page";
		}
		return retPage;
	}
}
