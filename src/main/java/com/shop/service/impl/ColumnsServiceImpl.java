package com.shop.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.ColumnsDao;
import com.shop.entity.Columns;
import com.shop.service.ColumnsService;

@Service
public class ColumnsServiceImpl implements ColumnsService {

	private final Logger logger= LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ColumnsDao columnDao;
	
	@Override
	public List<Columns> selectColumnByName(String cname) {
		List<Columns> selectColumnByName = columnDao.selectColumnByName(cname);
		return selectColumnByName;
	}

	@Override
	public List<Columns> getColumnList() {
		List<Columns> selectAllColumn = columnDao.selectAllColumn();
		return selectAllColumn;
	}

	@Override
	public void saveColumnByName(String cname) {
		columnDao.saveColumnByName(cname);

	}

	@Override
	public void deleteColumnById(int cid) {
		columnDao.deleteColumnById(cid);

	}

	@Override
	public List<Columns> getColumnAndGoodsList() {
		List<Columns> allColumnsAndGoods = columnDao.selectAllColumnsAndGoods();
		return allColumnsAndGoods;
	}

}
