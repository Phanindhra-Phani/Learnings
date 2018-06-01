package com.designpatterns.DecoratorPattern;

public class ExtraCheese extends ToppingDecorator {

	public ExtraCheese(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding extra cheese");
	}
	
	public String getDescription() {
		return tempPizza.getDescription();
	}

	public double getCost() {
		return tempPizza.getCost() + 30.00;
	}

}
