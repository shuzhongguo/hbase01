package com.szg.SHDP.entity;

public class NumberOrder {
	private String content_data;
	private String halfaddone;

	public NumberOrder() {
	}
	
	

	public NumberOrder(String content_data, String halfaddone) {
		super();
		this.content_data = content_data;
		this.halfaddone = halfaddone;
	}



	public String getContent_data() {
		return content_data;
	}



	public void setContent_data(String content_data) {
		this.content_data = content_data;
	}



	public String getHalfaddone() {
		return halfaddone;
	}



	public void setHalfaddone(String halfaddone) {
		this.halfaddone = halfaddone;
	}



	@Override
	public String toString() {
		return "NumberOrder [content_data=" + content_data + ", halfaddone=" + halfaddone + "]";
	}
	
}
