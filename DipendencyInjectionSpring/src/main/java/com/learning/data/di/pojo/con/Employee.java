package com.learning.data.di.pojo.con;

public class Employee {

	private String fName;
	private String lName;
	private EmployeeAdress adress;

	public Employee(String fName, String lName, EmployeeAdress adress) {
		this.adress = adress;
		this.fName = fName;
		this.lName = lName;
	}
	
	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", adress="
				+ adress.toString() + "]";
	}

}
