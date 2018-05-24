package com.shop.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.entity.Orders;
import com.shop.service.GoodService;
import com.shop.service.OrdersService;


@Controller
@RequestMapping("/order")
public class OrdersController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private OrdersService ordersService;

	@Autowired
	private GoodService goodsService;

	@RequestMapping("/buybtn")
	public ModelAndView buybtn(String gid,String pic,String name,String content,String price,Model model,HttpServletRequest req) {
		//System.out.println("----------goods"+pic+name+content+price);
		HttpSession session = req.getSession();
	
		//int goodsid = Integer.parseInt(gid);
		
		
		String uid = (String) session.getAttribute("id");
		int parseInt = Integer.parseInt(uid);
		//System.out.println("-------------------uid"+parseInt);
		Orders order = new Orders();
		order.setPic(pic);
		order.setPrice(price);
		order.setOname(name);
		order.setRemark(content);
		order.setUsersid(parseInt);
		order.setBoughtdate(new Date());
	    ordersService.insertOrder(order);
		//ModelAndView mv = new ModelAndView("forward:/goods/detail");
		
	//	goodsService.deleteGoodsById(goodsid);
		return null;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteOrder(Model model,String content) {
		int id = Integer.parseInt(content);
		ordersService.deleteOrder(id);
		ModelAndView mv=new ModelAndView("forward:/uhoutai/bought");
		return mv;
	}
	
	
}
