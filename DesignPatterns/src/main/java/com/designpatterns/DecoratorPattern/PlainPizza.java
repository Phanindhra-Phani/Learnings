package com.designpatterns.DecoratorPattern;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Fresh Pan";
	}

	@Override
	public double getCost() {
		return 89.00;
	}

}
