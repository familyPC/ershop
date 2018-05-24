package com.shop.entity;

import java.util.Date;

public class Orders {

	private Integer oid;
	private String oname;
	private String price;
	private String pic;
	private String remark;
	private Date boughtdate;
	private Integer usersid;
	
	private Users users;

	
	public Orders() {
		super();
	}


	public Orders(Integer oid, String oname, String price, String pic, String remark, Date boughtdate, Integer usersid,
			Users users) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.price = price;
		this.pic = pic;
		this.remark = remark;
		this.boughtdate = boughtdate;
		this.usersid = usersid;
		this.users = users;
	}


	public Integer getOid() {
		return oid;
	}


	public void setOid(Integer oid) {
		this.oid = oid;
	}


	public String getOname() {
		return oname;
	}


	public void setOname(String oname) {
		this.oname = oname;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getPic() {
		return pic;
	}


	public void setPic(String pic) {
		this.pic = pic;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Date getBoughtdate() {
		return boughtdate;
	}


	public void setBoughtdate(Date boughtdate) {
		this.boughtdate = boughtdate;
	}


	public Integer getUsersid() {
		return usersid;
	}


	public void setUsersid(Integer usersid) {
		this.usersid = usersid;
	}


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", oname=" + oname + ", price=" + price + ", pic=" + pic + ", remark=" + remark
				+ ", boughtdate=" + boughtdate + ", usersid=" + usersid + ", users=" + users + "]";
	}
	
	
}
