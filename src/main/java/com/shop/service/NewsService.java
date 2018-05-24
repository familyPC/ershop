package com.shop.service;

import java.util.List;

import com.shop.entity.News;

public interface NewsService {

	//添加公告
	void saveNewsByMessage(String message);
	
	//获取留言列表
	List<News> getNewsList();
	
	//删除留言
	void deleteNewsById(int id);
	
}
