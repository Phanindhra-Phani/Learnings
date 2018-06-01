package com.designpatterns.FactoryPattern;

/*
 * This acts like a client
 */
public class FactoryClient {
	
	public static void main(String[] args) {
		
		FactoryClass factoryClass = new FactoryClass();
		OperatingSystem operatingSystem = factoryClass.getInstance("iOS");
		
		operatingSystem.specifications();
		
	}

}
