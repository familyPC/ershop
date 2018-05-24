package com.shop.web;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.shop.entity.Columns;
import com.shop.entity.News;
import com.shop.entity.Users;
import com.shop.service.ColumnsService;
import com.shop.service.NewsService;
import com.shop.service.UsersService;

@Controller
@RequestMapping("/user")

@SessionAttributes(value= {"name","id"})
public class UsersController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
   
	@Autowired
	private UsersService usersService;
	@Autowired
	private ColumnsService columnService;
	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/list")
	public  String getUserList(Model model) {
		List<Users> userList = usersService.getUserList();
		//Users users = userList.get(0);
		model.addAttribute("userList",userList); 
		return "user-list";
	}
	
	@RequestMapping("/sousuo")
	public  String userSousuo(String content,Model model) {
		//System.out.println("-----------------------");
       //	System.out.println("--------"+content);
		List<Users> selectUserByKey = usersService.selectUserByKey(content);
		//System.out.println(selectUserByKey);
		
		model.addAttribute("userList", selectUserByKey);
		return "user-list";
	}
	
	@RequestMapping("/delete")
	public ModelAndView userDelete(int content,Model model) {
		usersService.deleteUserById(content);
		ModelAndView mv = new ModelAndView("forward:/user/list");
		return mv;
	}

	
	//用户登录
	@RequestMapping("/login")
	public ModelAndView showLogin(String usname,String password,Model model,HttpServletRequest req) {
		//System.out.println("-----"+usname+"----"+password);
		
		Users login = usersService.login(usname);
		//System.out.println(login);
		if(login.getPassword().equals(password)) {
			HttpSession session = req.getSession();
			//System.out.println("==========比较成功");
			session.setAttribute("name", login.getUsname());
			session.setAttribute("id", login.getUsid());
		}
		
		ModelAndView mv= new ModelAndView("forward:/ershop/index");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView showRegister(String usname,String password,String qq,String phone,String email,
			                         String address,Model model) {
		
		Users users = new Users(usname,password,qq,phone,email,address);
		System.out.println("=================="+users);
		usersService.register(users);
		ModelAndView mv = new ModelAndView("forward:/ershop/index");
		return mv;
	}
	
	
	@RequestMapping("/personal")
	public String personal(Model model,String name) {
		if(name==null||name=="") {
			List<Columns> columnAndGoodsList = columnService.getColumnAndGoodsList();		
			model.addAttribute("columnAndGoodsList", columnAndGoodsList);
			//System.out.println(columnAndGoodsList);
			
			List<News> newsList = newsService.getNewsList();
			model.addAttribute("newsList", newsList);
			return "index";
		}
		//System.out.println("-----------"+id);
		return "userIndex";
	}
	
	
	
}
