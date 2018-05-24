package com.shop.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.LiuyanDao;
import com.shop.entity.Liuyan;
import com.shop.service.LiuyanService;

@Service
public class LiuyanServiceImpl implements LiuyanService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LiuyanDao liuyanDao;
	
	@Override
	public void deleteLiuyanById(int lid) {
		liuyanDao.deleteLiuyanById(lid);

	}

	@Override
	public List<Liuyan> getLiuyanList() {
		List<Liuyan> liuyanList = liuyanDao.selectLiuyanList();
		return liuyanList;
	}

	@Override
	public Liuyan selectLiuyanById(int lid) {
		Liuyan liuyanById = liuyanDao.selectLiuyanById(lid);
		return liuyanById;
	}

}
