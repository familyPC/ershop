package com.shop.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.entity.Liuyan;


@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class LiuyanDaoTest {

	@Resource
	private LiuyanDao liuyanDao;
	@Test
	public void testSelectLiuyanList() {
		List<Liuyan> list = liuyanDao.selectLiuyanList();
		System.out.println(list);
	}

}
