package com.shop.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.UsersDao;
import com.shop.entity.Goods;
import com.shop.entity.Users;
import com.shop.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UsersDao usersDao;
	
	@Override
	public List<Users> selectUserByKey(String key) {
		List<Users> selectUserByKey = usersDao.selectUserByKey(key);
		return selectUserByKey;
	}

	@Override
	public List<Users> getUserList() {
		List<Users> userList = usersDao.selectAllUser();
		return userList;
	}

	@Override
	public void deleteUserById(int id) {
		usersDao.deleteUserById(id);

	}

	@Override
	public Users login(String usname) {
		Users usersLogin = usersDao.usersLogin(usname);
		return usersLogin;
	}

	@Override
	public Users selectUsersById(int usid) {
		Users usersById = usersDao.selectUsersById(usid);
		return usersById;
	}

	@Override
	public Users getGoodsListByUsid(int usid) {
		Users goodsByUsId = usersDao.selectGoodsByUsId(usid);
		return goodsByUsId;
	}

	@Override
	public void register(Users users) {
		usersDao.usersRegister(users);
		
	}

	@Override
	public Users getOrdersListByUsid(int usid) {
		Users ordersByUsId = usersDao.selectOrdersByUsId(usid);
		return ordersByUsId;
	}

}
