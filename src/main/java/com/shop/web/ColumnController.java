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
import com.shop.service.ColumnsService;

@Controller
@RequestMapping("/column")
public class ColumnController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ColumnsService columnService;
	
	@RequestMapping("/list")
	public String getColumnList(Model model) {
		List<Columns> columnList = columnService.getColumnList();
		model.addAttribute("columnList", columnList);
		return "column-list";
	}
	
	@RequestMapping("/save")
	public String columnInsert() {
		return "add-column";
	}
	
	@RequestMapping("/sousuo")
	public String columnSousuo(String content,Model model) {
		
		
		
		//System.out.println("-----------"+content);
		List<Columns> selectColumnByName = columnService.selectColumnByName(content);
		
		//System.out.println(selectColumnByName);
		model.addAttribute("columnList", selectColumnByName);
	
		return "column-list";
	}
	
	@RequestMapping("/delete")
	public ModelAndView columnDelete(int content, Model model){
		columnService.deleteColumnById(content);
		ModelAndView mv = new ModelAndView("forward:/column/list");
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView columnAdd(String content,Model model) {
		columnService.saveColumnByName(content);
		ModelAndView mv = new ModelAndView("forward:/column/list");
		return mv;
	}
}
