package com.designpatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	private String shopName;
	private List<Book> booksList = new ArrayList<Book>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooksList() {
		return booksList;
	}
	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}
	
	public List<Book> loadBooks() {
		
		List<Book> bookList = new ArrayList<Book>();
		
		for (int i = 1; i < 6; i++) {
			
			Book book = new Book();
			
			book.setBookId(i);
			book.setBookName("Book Name::"+i);
			
			getBooksList().add(book);
		}
		
		return bookList;
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", booksList=" + booksList + "]";
	}
	
	/*
	 * Shallow Cloning -- new object is not created, same object is passed with same reference.
	 */
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	/*
	 * Deep Cloning -- new object is created.
	 */
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		BookShop bookShop = new BookShop();
		
		for (Book book : this.booksList) {
			bookShop.getBooksList().add(book);
		}
		
		return bookShop;
	}
	
	
	
}
