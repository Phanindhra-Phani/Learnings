package com.polymorphism;

public class DynamicBindingChild extends DynamicBindingParent {

	public static void printData() {
		System.out.println("static DynamicBindingChild printData");
	}
	
	@Override
	public void normalData() {
		System.out.println("static DynamicBindingChild normalData");
	}

	public static void main(String[] args) {
		DynamicBindingParent bindingParent = new DynamicBindingParent();
		bindingParent.printData();
		bindingParent.normalData();

		bindingParent = new DynamicBindingChild();
		bindingParent.printData();
		bindingParent.normalData();
	}

	
}
