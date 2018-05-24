package com.shop.dao;

import java.util.List;

import com.shop.entity.Orders;

public interface OrdersDao {

	void insertOrder(Orders orders);
	
	List<Orders> selectOrderByUsid(int usid);
	void deleteOrder(int id);
}
