package com.designpatterns.FactoryPattern;

public class FactoryClass {

	/*
	 * This method manufactures the Object based on the input passed.
	 * Factory is nothing but manufacturing of an objects.
	 * If any new type of Phone needs to be added, we will just add here without disturbing the client.
	 */
	public OperatingSystem getInstance(String phoneType) {
		
		if(phoneType.equalsIgnoreCase("iOS")) {
			return new ApplePhone();
		} else {
			return new AndroidPhone();
		}
	}
}
