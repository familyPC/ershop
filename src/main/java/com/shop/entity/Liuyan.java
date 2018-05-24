package com.shop.entity;

import java.util.Date;

public class Liuyan {

	private Integer lid;
	private String lname;
	private String content;
	private Date liuyantime;
	private Integer usersid;
	
	private Users users;

	public Liuyan() {
		super();
	}

	public Liuyan(Integer lid, String lname, String content, Date liuyantime, Integer usersid, Users users) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.content = content;
		this.liuyantime = liuyantime;
		this.usersid = usersid;
		this.users = users;
	}

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getLiuyantime() {
		return liuyantime;
	}

	public void setLiuyantime(Date liuyantime) {
		this.liuyantime = liuyantime;
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
		return "Liuyan [lid=" + lid + ", lname=" + lname + ", content=" + content + ", liuyantime=" + liuyantime
				+ ", usersid=" + usersid + ", users=" + users + "]";
	}

	
}
