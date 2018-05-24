package com.shop.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.entity.News;
import com.shop.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/list")
	public String getNewsList(Model model) {
		List<News> newsList = newsService.getNewsList();
		model.addAttribute("newsList", newsList);
		return "news-list";
	}
	
	@RequestMapping("/save")
	public String newsInsert() {
		return "add-news";
	}
	
	@RequestMapping("/add")
	public ModelAndView newsAdd(String content, Model model) {
		
		newsService.saveNewsByMessage(content);
		//System.out.println("---------------"+content);
		
		ModelAndView mv = new ModelAndView("forward:/news/list");
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteNews(Model model,int content) {
		newsService.deleteNewsById(content);
		ModelAndView mv = new ModelAndView("forward:/news/list");
		return mv;
	}
}
