package com.shop.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.shop.entity.Admin;
import com.shop.entity.Columns;
import com.shop.entity.News;
import com.shop.service.AdminService;

@Controller
@RequestMapping("/admin")
@SessionAttributes(value= {"name","id"})
public class AdminController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/managerLogin")
	public String showAdmin() {
		return "login";
	}
	@RequestMapping("/login")
	public String loginshow(String name,String password, Model model ,HttpServletRequest req) {
		//System.out.println("登录数据");
		//System.out.println("name"+admin.getName());
		//System.out.println("password"+admin.getPassword());
		Admin admin = adminService.loginAdmin(name);
		
		if(admin.getPassword().equals(password)) {
			HttpSession session = req.getSession();
			session.setAttribute("admin", admin);
				
			return "admin";
		}else {
			return "login";
		}
		
	}
	
	
	@RequestMapping("/loginout")
	public String loginOut(HttpServletRequest req,Model model) {
		req.getSession().invalidate();
		
		return "login";
		
	}
}
