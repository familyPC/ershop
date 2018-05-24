package com.shop.entity;

import java.util.Date;
import java.util.regex.Pattern;

public class Goods {
	
	private Integer gid;
	private String gname;
	private String price;
	private String pic;
	private String remark;
	private Date uploaddate;
	private Integer usersid;
	private Integer columnid;
	
	private Users users;
	private Columns columns;
	
	
	public Goods() {
		super();
	}


	public Goods(String gname, String price, String pic, String remark, Date uploaddate, Integer usersid,
			Integer columnid) {
		super();
		this.gname = gname;
		this.price = price;
		this.pic = pic;
		this.remark = remark;
		this.uploaddate = uploaddate;
		this.usersid = usersid;
		this.columnid = columnid;
	}


	public Goods(Integer gid, String gname, String price, String pic, String remark, Date uploaddate, Integer usersid,
			Integer columnid, Users users, Columns columns) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.pic = pic;
		this.remark = remark;
		this.uploaddate = uploaddate;
		this.usersid = usersid;
		this.columnid = columnid;
		this.users = users;
		this.columns = columns;
	}


	public Integer getGid() {
		return gid;
	}


	public void setGid(Integer gid) {
		this.gid = gid;
	}


	public String getGname() {
		return gname;
	}


	public void setGname(String gname) {
		this.gname = gname;
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


	public Date getUploaddate() {
		return uploaddate;
	}


	public void setUploaddate(Date uploaddate) {
		this.uploaddate = uploaddate;
	}


	public Integer getUsersid() {
		return usersid;
	}


	public void setUsersid(Integer usersid) {
		this.usersid = usersid;
	}


	public Integer getColumnid() {
		return columnid;
	}


	public void setColumnid(Integer columnid) {
		this.columnid = columnid;
	}


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	public Columns getColumns() {
		return columns;
	}


	public void setColumns(Columns columns) {
		this.columns = columns;
	}


	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", pic=" + pic + ", remark=" + remark
				+ ", uploaddate=" + uploaddate + ", users=" + users + ", columns=" + columns + "]";
	}

	
	
}
