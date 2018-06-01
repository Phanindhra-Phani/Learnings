package com.learning.data.di.pojo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Employee")
public class Employee {

	@Value("Pranith")
	private String fName;
	
	@Value("Krishna")
	private String lName;
	
	@Autowired
	private EmployeeAdress adress;

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
				+ adress + "]";
	}

}
