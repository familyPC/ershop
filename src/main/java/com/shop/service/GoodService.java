package com.shop.service;

import java.util.List;

import com.shop.entity.Goods;


public interface GoodService {

	//删除商品
	void deleteGoodsById(int id);
	
	//查询商品
    List<Goods> selectGoodsByName(String name);
	
	//获取商品列表
	List<Goods> getGoodsList();
	
	//添加商品
	void   saveGoods(Goods goods);
	
	//根据商品查询卖家信息
	Goods getGoodsAndUsers(int id);
	
	//根据用户id查询商品
	List<Goods> getGoodsByUserId(int id);
	
	
	


}
