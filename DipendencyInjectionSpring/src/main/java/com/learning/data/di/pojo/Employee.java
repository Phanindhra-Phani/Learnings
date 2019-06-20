package com.learning.data.di.pojo;

public class Employee {

	private String fName;
	private String lName;
	private EmployeeAdress adress;

	public Employee() {
		System.out.println("In Emp");
	}

	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public EmployeeAdress getAdress() {
		return adress;
	}

	public void setAdress(EmployeeAdress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", adress="
				+ adress.toString() + "]";
	}

}
