package com.designpatterns.DecoratorPattern;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding Tomato Sauce");
	}
	
	public String getDescription() {
		return tempPizza.getDescription();
	}

	public double getCost() {
		return tempPizza.getCost() + 20.00;
	}
}
