package com.shop.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.entity.Columns;
import com.shop.entity.Goods;
import com.shop.service.ColumnsService;
import com.shop.service.GoodService;
import com.shop.service.NewsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	

	
	@Autowired 
	private ColumnsService columnService;
	
	@Autowired
	private NewsService newsService;
	
	@Autowired
	private GoodService goodService;
	
	
	@RequestMapping("/list")
	public String getGoodsList(Model model) {
		List<Goods> goodsList = goodService.getGoodsList();
		model.addAttribute("goodsList", goodsList);
		return "goods-list";
	}
	
	@RequestMapping("/save")
	public String goodsInsert(Model model) {
		List<Columns> columnList = columnService.getColumnList();
		model.addAttribute("columnList", columnList);
		return "add-goods";
	}
	
	@RequestMapping("/delete")
	public ModelAndView goodsdelete(int content ,Model model) {
		goodService.deleteGoodsById(content);
		ModelAndView mv = new ModelAndView("forward:/goods/list");
		return mv;
	}
	
	@RequestMapping("/sousuo")
	public String sousuoGoods(String content , Model model) {
		List<Goods> selectGoodsByName = goodService.selectGoodsByName(content);
		model.addAttribute("goodsList", selectGoodsByName);
		return "goods-list";
	}

	
	@RequestMapping("/detail")
	public String goodsDetail(Model model,String id) {
		
		
		//System.out.println("----------------"+id);
		
		int gid = Integer.parseInt(id);
		//System.out.println("=========="+gid);
		Goods goodsAndUsers = goodService.getGoodsAndUsers(gid);
		
		//String pic = goodsAndUsers.getPic();
		//String[] split = pic.replaceAll("\\\\","/").split("/");
		//System.out.println("-----------split"+split);
		//System.out.println("----------"+split[split.length-1]);
		//goodsAndUsers.setPic(split[split.length-1]);
		//System.out.println(goodsAndUsers);
		
		model.addAttribute("goodsAndUsers", goodsAndUsers);
		return "goods-detail";
	}
//	
	@RequestMapping("/search")
	public String goodsSearch(Model model ,String gname) {
		//System.out.println("==========="+gname);
		List<Goods> goodsByName = goodService.selectGoodsByName(gname);
		model.addAttribute("goodsByName", goodsByName);
		return "goods-search";
	}
	
	
}
