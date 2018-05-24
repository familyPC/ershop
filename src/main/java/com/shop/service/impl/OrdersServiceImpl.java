package com.shop.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.OrdersDao;
import com.shop.entity.Orders;
import com.shop.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private OrdersDao ordersDao;
	
	@Override
	public void insertOrder(Orders orders) {
	 ordersDao.insertOrder(orders);
		
	}

	@Override
	public List<Orders> selectOrderByUsid(int usid) {
		List<Orders> orderByUsid = ordersDao.selectOrderByUsid(usid);
		return orderByUsid;
	}

	@Override
	public void deleteOrder(int id) {
		ordersDao.deleteOrder(id);
		
	}

}
