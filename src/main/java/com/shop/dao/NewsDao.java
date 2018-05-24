package com.shop.dao;

import java.util.List;

import com.shop.entity.News;

public interface NewsDao {

	//添加公告
	void saveNewsByMessage(String message);
	
	//查询公告列表
	List<News> selectAllNews();
	
	//删除留言
	void deleteNewsById(int id);
}
