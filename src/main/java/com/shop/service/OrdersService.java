package com.shop.service;

import java.util.List;

import com.shop.entity.Orders;

public interface OrdersService {

	void insertOrder(Orders orders);
	
	List<Orders> selectOrderByUsid(int usid);
	
	void deleteOrder(int id);
	
}
