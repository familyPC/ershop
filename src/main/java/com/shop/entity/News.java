package com.shop.entity;

public class News {

	private Integer id;
	private String messages;
	
	public News() {
		super();
	}
	public News(String messages) {
		super();
		this.messages = messages;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", messages=" + messages + "]";
	}
	
}
