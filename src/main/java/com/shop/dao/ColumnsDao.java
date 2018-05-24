package com.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.entity.Columns;

public interface ColumnsDao {

	//查询栏目
	List<Columns> selectColumnByName(String cname);
	
	//查询所有栏目
	List<Columns> selectAllColumn();
	
	//添加栏目
	void saveColumnByName(String cname);
	
	//删除栏目
	void deleteColumnById(int cid);
	
	//查询栏目和商品
	List<Columns> selectAllColumnsAndGoods();
}
