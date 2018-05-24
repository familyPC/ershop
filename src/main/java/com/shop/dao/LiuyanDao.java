package com.shop.dao;

import java.util.List;

import com.shop.entity.Liuyan;

public interface LiuyanDao {

	//删除留言
	void deleteLiuyanById(int lid);
	
	//获取留言列表
	List<Liuyan> selectLiuyanList();
	
	//根据id查询
	Liuyan selectLiuyanById(int lid);
}
