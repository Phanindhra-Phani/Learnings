package com.designpatterns.DecoratorPattern;

public class DecoratorClient {

	public static void main(String[] args) {
	
//		Pizza pizza = new TomatoSauce(new PlainPizza());
		
//		Pizza pizza = new TomatoSauce(new ExtraCheese(new PlainPizza()));
		 
		Pizza pizza = new ExtraCheese(new TomatoSauce(new PlainPizza()));

		System.out.println("Pizza description: "+pizza.getDescription());
		
		System.out.println("Pizza cost: "+pizza.getCost());
	}
	
}
