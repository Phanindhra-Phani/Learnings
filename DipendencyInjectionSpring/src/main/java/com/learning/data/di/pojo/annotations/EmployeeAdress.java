package com.learning.data.di.pojo.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp1")
public class EmployeeAdress {

	@Value("123123")
	private String streetNumber;
	
	@Value("dfas")
	private String houseNumber;
	
	@Value("UK")
	private String country;
	
	@Value("12312")
	private int phnNo;

	

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
		return "EmployeeAdress [streetNumber=" + streetNumber
				+ ", houseNumber=" + houseNumber + ", country=" + country
				+ ", phnNo=" + phnNo + "]";
	}

}
