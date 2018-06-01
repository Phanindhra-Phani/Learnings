package com.learning.data.di.pojo.con;

public class EmployeeAdress {

	private String streetNumber;
	private String houseNumber;
	private String country;
	private int phnNo;

	public EmployeeAdress(String country) {
		this.country = country;
	}

	public EmployeeAdress(String country, String houseNumber) {
		this.country = country;
		this.houseNumber = houseNumber;
	}

	public EmployeeAdress(String streetNumber, String houseNumber,
			String countryCountry) {
		this.streetNumber = streetNumber;
		this.houseNumber = houseNumber;
		this.country = countryCountry;

	}

	@Override
	public String toString() {
		return "EmployeeAdress [streetNumber=" + streetNumber
				+ ", houseNumber=" + houseNumber + ", country=" + country
				+ ", phnNo=" + phnNo + "]";
	}

}
