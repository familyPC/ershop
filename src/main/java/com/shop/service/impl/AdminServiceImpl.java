package com.shop.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dao.AdminDao;
import com.shop.entity.Admin;
import com.shop.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private AdminDao adminDao;
	
	
	@Override
	public Admin loginAdmin(String name) {
		Admin loginAdmin = adminDao.loginAdmin(name);
		
		return loginAdmin;
	}

}
