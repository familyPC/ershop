package com.shop.entity;

import java.util.ArrayList;
import java.util.List;

public class Columns {

	private Integer cid;
	private String cname;
	
	//一个栏目对应多个商品   一对多
	private List<Goods> goods = new ArrayList<Goods>(0);

	public Columns() {
		super();
	}

	public Columns(Integer cid, String cname, List<Goods> goods) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.goods = goods;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}



	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "Columns [cid=" + cid + ", cname=" + cname + ", goods=" + goods + "]";
	}

	
	
	
}
