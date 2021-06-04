package com.javaex.ex02;

public class Goods {
	
	
	//Field
	private String name;
	private int price;
	
	
	//Constructor
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}


	
	//Method- G/S
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
//	Method - Ordinary
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
}




