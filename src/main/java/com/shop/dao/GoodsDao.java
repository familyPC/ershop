package com.shop.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.shop.entity.Columns;
import com.shop.entity.Goods;
@Component
public interface GoodsDao {

	
	//删除商品
	void deleteGoodsById(int id);
	
	//查询商品
    List<Goods> selectGoodsByName(String name);
	
	//获取商品列表
	List<Goods> selectGoodsList();
	
	//添加商品
	void   saveGoods(Goods goods);
	
	
	//根据商品查询卖家信息
	Goods selectGoodsAndUsers(int gid);
	
	//根据用户id查询商品
	List<Goods> selectGoodsByUsersid(int id);
	

}
