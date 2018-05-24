package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.GoodsDao;
import com.shop.entity.Goods;
import com.shop.service.GoodService;

@Service
public class GoodServiceImpl implements GoodService {

	@Autowired
	private GoodsDao goodsDao;
	
	@Override
	public void deleteGoodsById(int id) {
		goodsDao.deleteGoodsById(id);

	}

	@Override
	public List<Goods> selectGoodsByName(String name) {
		List<Goods> goodsByName = goodsDao.selectGoodsByName(name);
		return goodsByName;
	}

	@Override
	public List<Goods> getGoodsList() {
		List<Goods> goodsList = goodsDao.selectGoodsList();
		return goodsList;
	}

	@Override
	public void saveGoods(Goods goods) {
		goodsDao.saveGoods(goods);

	}

	@Override
	public Goods getGoodsAndUsers(int id) {
		Goods goodsAndUsers = goodsDao.selectGoodsAndUsers(id);
		return goodsAndUsers;
	}

	@Override
	public List<Goods> getGoodsByUserId(int id) {
		goodsDao.selectGoodsByUsersid(id);
		return null;
	}

}
