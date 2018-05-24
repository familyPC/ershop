package com.shop.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.entity.Columns;
import com.shop.entity.Goods;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class GoodsDaoTest {

	@Resource
	private GoodsDao goodsDao;
	
	
	@Test
	public void testDeleteGoodsById() {
		
	}

	@Test
	public void testSelectGoodsByName() {
		String name ="儿童水杯";
		List<Goods> goodsByName = goodsDao.selectGoodsByName(name);
		System.out.println(goodsByName);
	}

	@Test
	public void testSelectGoodsList() {
		//List<Columns> selectGoodsList = goodsDao.selectGoodsList();
		//System.out.println(selectGoodsList);
	}

	@Test
	public void testSaveGoodsByName() {
		//Date date = new Date();
		//Goods goods = new Goods("联想笔记本","20yuan","aaa","hhhhhh",date,14,1);
		//goodsDao.saveGoodsByName(goods);
	}

}
