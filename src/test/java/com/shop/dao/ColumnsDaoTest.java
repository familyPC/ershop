package com.shop.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.entity.Columns;


@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class ColumnsDaoTest {

	@Resource
	private ColumnsDao columnDao;
	@Test
	public void testSelectColumnByName() {
		String cname="玄幻小说";
		List<Columns> name = columnDao.selectColumnByName(cname);
		System.out.println(name);
	}

}
