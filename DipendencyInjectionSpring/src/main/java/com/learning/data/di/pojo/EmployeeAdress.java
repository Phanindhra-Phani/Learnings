package com.learning.data.di.pojo;

public class EmployeeAdress {

	private String streetNumber;
	private String houseNumber;
	private String country;
	private int phnNo;

	public EmployeeAdress() {
		System.out.println("In Emp Address");
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public String getCountry() {
		return country;
	}

	public int getPhnNo() {
		return phnNo;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPhnNo(int phnNo) {
		this.phnNo = phnNo;
	}

	@Override
	public String toString() {
		return "EmployeeAdress [streetNumber=" + streetNumber + ", houseNumber=" + houseNumber + ", country=" + country
				+ ", phnNo=" + phnNo + "]";
	}

}
