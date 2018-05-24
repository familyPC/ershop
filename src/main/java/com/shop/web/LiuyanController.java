package com.shop.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.entity.Liuyan;
import com.shop.service.LiuyanService;

@Controller
@RequestMapping("/liuyan")
public class LiuyanController {

	private final Logger logger= LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LiuyanService liuyanService;
	
	@RequestMapping("/list")
	public String getLiuyanList(Model model) {
		List<Liuyan> liuyanList = liuyanService.getLiuyanList();
		model.addAttribute("liuyanList", liuyanList);
		return "liuyan-list";
	}
	
	@RequestMapping("/select")
	public String selectById(Model model ,int content) {
		Liuyan liuyanById = liuyanService.selectLiuyanById(content);
		model.addAttribute("liuyanById",liuyanById);		
		return "lyuserinfo";
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteLiuyan(int content,Model model) {
		liuyanService.deleteLiuyanById(content);
		ModelAndView mv = new ModelAndView("forward:/liuyan/list");
		return mv;
	}
}
