package com.shop.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.NewsDao;
import com.shop.entity.News;
import com.shop.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private NewsDao newsDao;
	
	
	@Override
	public void saveNewsByMessage(String message) {
		newsDao.saveNewsByMessage(message);
		

	}


	@Override
	public List<News> getNewsList() {
		List<News> selectAllNews = newsDao.selectAllNews();
		return selectAllNews;
	}


	@Override
	public void deleteNewsById(int id) {
		newsDao.deleteNewsById(id);
		
	}

}
