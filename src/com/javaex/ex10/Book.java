package com.javaex.ex10;

public class Book {

	// 필드
	int bookNo;
	String title;
	String author;
	int stateCode;

	// 생성자
	public Book() {

	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
	public Book(int bookNo, String title, String author, int stateCode) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = stateCode;
	}
	
	//메소드 - G/S
	
	public int getBookNo() {
		return bookNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getStateCode() {
		return stateCode;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}


	//메소드 - 일반
	public void rent() {
	}
	
	public void print() {
		
	}
}
