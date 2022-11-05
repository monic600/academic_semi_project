package com.mini.dto;

public class ProductDTO {

	int price;
	String name;
	String category;
	double discount;
	boolean isFree;
	boolean isCoupon;
	int numProduct;
	
	public void inquiry() {
		
		System.out.println(this.toString());
	}

}
