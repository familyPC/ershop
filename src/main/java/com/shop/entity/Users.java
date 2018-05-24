package com.shop.entity;

import java.util.ArrayList;
import java.util.List;

public class Users {

	private String usid;
	private String usname;
	private String password;
	private String phone;
	private String qq;
	private String email;
	private String address;
	
	//一个用户多个商品     一对多
	private List<Goods> goods = new ArrayList<Goods>(0);
	
	//一个用户多个留言   一对多
	private List<Liuyan> liuyan = new ArrayList<Liuyan>(0);
	
	private List<Orders> orders = new ArrayList<Orders>(0);

	public Users() {
		super();
	}

	
	public Users(String usname, String password, String phone, String qq, String email, String address) {
		super();
		this.usname = usname;
		this.password = password;
		this.phone = phone;
		this.qq = qq;
		this.email = email;
		this.address = address;
	}




	public Users(String usname, String password, String phone, String qq, String email, String address,
			List<Goods> goods, List<Liuyan> liuyan, List<Orders> orders) {
		super();
		this.usname = usname;
		this.password = password;
		this.phone = phone;
		this.qq = qq;
		this.email = email;
		this.address = address;
		this.goods = goods;
		this.liuyan = liuyan;
		this.orders = orders;
	}


	public List<Orders> getOrders() {
		return orders;
	}


	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}


	public String getUsid() {
		return usid;
	}

	public void setUsid(String usid) {
		this.usid = usid;
	}

	public String getUsname() {
		return usname;
	}

	public void setUsname(String usname) {
		this.usname = usname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	public List<Liuyan> getLiuyan() {
		return liuyan;
	}

	public void setLiuyan(List<Liuyan> liuyan) {
		this.liuyan = liuyan;
	}


	@Override
	public String toString() {
		return "Users [usid=" + usid + ", usname=" + usname + ", password=" + password + ", phone=" + phone + ", qq="
				+ qq + ", email=" + email + ", address=" + address + ", goods=" + goods + ", liuyan=" + liuyan
				+ ", orders=" + orders + "]";
	}





}
