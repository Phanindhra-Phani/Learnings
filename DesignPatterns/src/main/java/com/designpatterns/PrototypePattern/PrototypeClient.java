package com.designpatterns.PrototypePattern;

/*
 * Prototype is used to create a cloned or copy of an object.
 */
public class PrototypeClient {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bookShop = new BookShop();
		
		bookShop.setShopName("Om Prakash Book Stores");
		bookShop.loadBooks();
		
		
		/*
		 * Shallow Cloning -- means when data is updated in bookShop, it changes in bookShop1 because we are using same address
		 */
		/*
		 * Deep Cloning -- Deep Cloning -- new object is created.
		 */
		
		BookShop bookShop1 = (BookShop)bookShop.clone();
		bookShop.getBooksList().remove(2);
		bookShop1.setShopName("Vani Book Stores");
		
		System.out.println(bookShop);
		System.out.println(bookShop1);
	}

}
