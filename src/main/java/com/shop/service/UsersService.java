package com.shop.service;

import java.util.List;

import com.shop.entity.Goods;
import com.shop.entity.Users;

public interface UsersService {
	//查询用户
	List<Users> selectUserByKey(String key);
	
	//获取用户列表
	List<Users> getUserList();
	
	//删除用户
	void deleteUserById(int id);
	
	//用户登录
	Users login(String usname);
	
	//根据id查询用户
	Users selectUsersById(int usid);
	
	//根据用户id查询商品
	Users   getGoodsListByUsid(int usid);
	
	//注册用户
	void register(Users users);
	
	//根据用户id查询订单
	Users getOrdersListByUsid(int usid);
	
	
}
