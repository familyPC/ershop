package com.shop.service;

import java.util.List;

import com.shop.entity.Columns;

public interface ColumnsService {

	//查询栏目
	List<Columns> selectColumnByName(String name);
	
	//获取栏目列表
	List<Columns> getColumnList();
	
	//添加栏目
	void saveColumnByName(String name);
	
	//删除栏目
	void deleteColumnById(int id);
	
	//查询商品和栏目
	List<Columns> getColumnAndGoodsList();
}
