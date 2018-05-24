package com.shop.web;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthStyle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.shop.entity.Columns;
import com.shop.entity.Goods;
import com.shop.entity.News;
import com.shop.entity.Orders;
import com.shop.entity.Users;
import com.shop.service.ColumnsService;
import com.shop.service.GoodService;
import com.shop.service.NewsService;
import com.shop.service.OrdersService;
import com.shop.service.UsersService;

@Controller
@RequestMapping("/uhoutai")

public class UserHouTaiController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UsersService usersService;
	@Autowired
	private GoodService goodService;
	
	@Autowired
	private ColumnsService columnsService;
	@Autowired
	private NewsService newsService;
	
	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping("/loginout")
	public String loginOut(HttpServletRequest req,Model model) {
		req.getSession().invalidate();
		List<Columns> columnAndGoodsList = columnsService.getColumnAndGoodsList();		
		model.addAttribute("columnAndGoodsList", columnAndGoodsList);
		//System.out.println(columnAndGoodsList);
		
		List<News> newsList = newsService.getNewsList();
		model.addAttribute("newsList", newsList);
		return "index";
		
	}
	
	
	@RequestMapping("/grxx")
	public String gerenxinxi(Model model ,String id) {
		//System.out.println("============"+id);
		int usid = Integer.parseInt(id);
		Users usersById = usersService.selectUsersById(usid);
		model.addAttribute("users", usersById);
		return "system";
	}
	
	@RequestMapping("/add")
	public String selectColumn(Model model) {
		List<Columns> columnList = columnsService.getColumnList();
		model.addAttribute("columnList", columnList);
		return "add-goods" ;
	}
	
	@RequestMapping("/save")
	public ModelAndView addGoods(String gname  ,String price,
		String remark,String cid, @RequestParam("file")CommonsMultipartFile file,HttpServletRequest req) {
		//	System.out.println(gname+price+file+remark+cid );
			
			int columnid = Integer.parseInt(cid);
			
			HttpSession session = req.getSession();
		   
			
			int usid = Integer.parseInt((String) session.getAttribute("id"));
     		Goods goods = new Goods();
			
			Date date = new Date();
					
			//存放图片路径
			String path = "E:/workspace/shop/src/main/webapp/images/"+date.getTime()
					+file.getOriginalFilename();//文件名称
			
			//String pic = goodsAndUsers.getPic();
			String[] split = path.replaceAll("\\\\","/").split("/");
			String realpath = "../../images/";
			realpath+=split[split.length-1];
			
			File newfile = new File(path);// 通过CommonsMultipartFile的方法直接写文件（注意这个时候
			
			try {
				file.transferTo(newfile);
			} catch (IllegalStateException e) {
				e.printStackTrace();
     		} catch (IOException e) {
    			e.printStackTrace();
			}
			goods.setPic(realpath);	
			goods.setGname(gname);
			goods.setPrice(price);
			goods.setColumnid(columnid);
			goods.setUsersid(usid);
			goods.setUploaddate(date);
			goods.setRemark(remark);
		
		
		 goodService.saveGoods(goods);
		
		 ModelAndView mv=new ModelAndView("forward:/user/personal");
		 return mv;
	}
	
	@RequestMapping("/public")
	public String publicgoods(String id,Model model) {
		//System.out.println("==========="+id);
		int usid = Integer.parseInt(id);
	//	List<Goods> goodsByUserId = goodService.getGoodsByUserId(usid);
		Users goodsListByUsid = usersService.getGoodsListByUsid(usid);
		//System.out.println("=================="+goodsListByUsid);
		
		model.addAttribute("goodsByUserId", goodsListByUsid);
		return "public-goods";
	}
	
	@RequestMapping("/bought")
	public String boughtgoods(Model model,HttpServletRequest req) {
		HttpSession session = req.getSession();
		int usid = Integer.parseInt((String) session.getAttribute("id"));
		
		Users ordersListByUsid = usersService.getOrdersListByUsid(usid);
		//System.out.println("=========="+ordersListByUsid);
		model.addAttribute("ordersListByUsid", ordersListByUsid);
		return "bought-goods";
	}
	
}
