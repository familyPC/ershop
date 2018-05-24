package com.shop.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dao.UsersDao;
import com.shop.entity.Columns;
import com.shop.entity.News;
import com.shop.service.ColumnsService;
import com.shop.service.NewsService;
import com.shop.service.UsersService;

@Controller
@RequestMapping("/ershop")
public class IndexController {

	@Autowired
	private UsersService usersService;
	@Autowired
	private ColumnsService columnService;
	@Autowired
	private NewsService newsService;
	
	
	@RequestMapping("/index")
	public String show(Model model){
			
			List<Columns> columnAndGoodsList = columnService.getColumnAndGoodsList();		
			model.addAttribute("columnAndGoodsList", columnAndGoodsList);
			//System.out.println(columnAndGoodsList);
			
			List<News> newsList = newsService.getNewsList();
			model.addAttribute("newsList", newsList);
			return "index";
		}
	
}
