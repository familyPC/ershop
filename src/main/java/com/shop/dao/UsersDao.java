package com.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.entity.Goods;
import com.shop.entity.Users;

public interface UsersDao {

	//查询用户
	List<Users> selectUserByKey(@Param("key") String key);
	
	//查询所有用户
	List<Users> selectAllUser();
	
	
	//删除用户
	void deleteUserById(int usid);
	
	Users usersLogin(String usname);
	
	//根据id查询用户
	Users selectUsersById(int usid);
	
	//根据用户id查询商品
	Users selectGoodsByUsId(int usid);
	
	//注册用户
	void usersRegister(Users users);
	
	//根据用户id查询订单
	Users selectOrdersByUsId(int usid);
}
