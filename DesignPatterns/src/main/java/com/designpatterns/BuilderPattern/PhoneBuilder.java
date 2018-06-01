package com.designpatterns.BuilderPattern;

/*
 * When a class has many parameters to create an instance through constructor, it is difficult for the client to remember the order.
 * In this case, we go with Builder design patter.
 * We create setters for all the parameters which return same class instance.
 * We write one method to get the Instance of the class, in turn we call constructor to create Object for this class.
 * 
 * In this way, client can set whatever parameters are required for the phone and get the PhoneBuilder object.
 */
public class PhoneBuilder {
	
	private String operatingSystem;
	private String processor;
	private int ram;
	private double screenSize;
	private int battery;
	
	public PhoneBuilder(String operatingSystem, String processor, int ram, double screenSize, int battery) {
		super();
		this.operatingSystem = operatingSystem;
		this.processor = processor;
		this.ram = ram;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	public PhoneBuilder() {
		
	}
	
	public PhoneBuilder setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public PhoneBuilder getPhoneBuilder() {
		return new PhoneBuilder(operatingSystem, processor, ram, screenSize, battery);
	}

	@Override
	public String toString() {
		return "PhoneBuilder [operatingSystem=" + operatingSystem + ", processor=" + processor + ", ram=" + ram
				+ ", screenSize=" + screenSize + ", battery=" + battery + "]";
	}
	
}
