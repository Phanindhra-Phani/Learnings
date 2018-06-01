package com.learning.data.di.pojo.autowire;

public class Employee {

	private String fName;
	private String lName;
	private EmployeeAdress adress;
	private com.learning.data.di.pojo.EmployeeAdress adress1;

	public Employee(){
		
	}
	
	public Employee(EmployeeAdress adress,
			com.learning.data.di.pojo.EmployeeAdress adress1) {
		this.adress = adress;
		this.adress1 = adress1;
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

	public com.learning.data.di.pojo.EmployeeAdress getAdress1() {
		return adress1;
	}

	public void setAdress1(com.learning.data.di.pojo.EmployeeAdress adress1) {
		this.adress1 = adress1;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", adress="
				+ adress + ", adress1=" + adress1 + "]";
	}

}
