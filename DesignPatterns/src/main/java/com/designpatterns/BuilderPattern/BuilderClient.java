package com.designpatterns.BuilderPattern;

public class BuilderClient {
	
	public static void main(String[] args) {
		
		/*
		 * Setting only required fields for the client instead of passing all parameters to the constructor to create object.
		 * This type of pattern is called Builder Pattern
		 */
		
		PhoneBuilder phoneBuilder = new PhoneBuilder().setOperatingSystem("iOS").setBattery(1028).getPhoneBuilder();
		
		System.out.println("Phone specifications are:::"+phoneBuilder);
		
	}

}
