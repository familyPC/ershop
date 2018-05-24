package com.shop.service;

import java.util.List;

import com.shop.entity.Liuyan;

public interface LiuyanService {

	//删除留言
	void deleteLiuyanById(int id);
	
	//获取留言列表
	List<Liuyan> getLiuyanList();
	
	//根据id查询
	Liuyan selectLiuyanById(int id);
}
