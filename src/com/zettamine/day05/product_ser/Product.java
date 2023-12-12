package com.zettamine.day05.product_ser;

import java.io.Serializable;

public class Product implements Serializable {
	private int pId;
	private String pName;
	public Product(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	
	public String getpName() {
		return pName;
	}
	

}
