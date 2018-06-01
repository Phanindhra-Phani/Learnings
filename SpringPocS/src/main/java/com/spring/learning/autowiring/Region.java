package com.spring.learning.autowiring;

public class Region {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Region [city=" + city + "]";
	}

}
