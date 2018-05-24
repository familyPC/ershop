package com.shop.dao;

import com.shop.entity.Admin;

public interface AdminDao {

	//管理员登录
	Admin loginAdmin(String name);
}
