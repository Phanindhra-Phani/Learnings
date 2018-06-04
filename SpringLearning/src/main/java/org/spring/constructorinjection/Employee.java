package org.spring.constructorinjection;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String companyName;
	
	public Employee(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public Employee( String employeeName, String companyName) {
		this.employeeName = employeeName;
		this.companyName = companyName;
	}
	
	public Employee(int employeeId, String employeeName, String companyName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", companyName=" + companyName
				+ "]";
	}
	
}
