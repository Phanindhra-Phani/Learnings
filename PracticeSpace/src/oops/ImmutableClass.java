package oops;

import java.util.Date;
import java.util.Map;

import pojos.Employee;

public final class ImmutableClass {
	
	private final Integer i;
	
	private final String s;
	
	private final Date d;
	
	private Employee emp;
	
	private final Map<String, String> m;

	public ImmutableClass(Integer i, String s, Date d, Employee e, Map<String, String> m){
		
		if(d.getTime()<System.currentTimeMillis()){
			throw new IllegalArgumentException("Cannot set reminder"+ d);
		}
		this.d=(Date) d.clone();
		this.i=i;
		this.s=s;
		this.emp = emp;
		this.m=m;
	}

	public Integer getI() {
		return i;
	}

	public String getS() {
		return s;
	}

	public Date getD() {
		return d;
	}

	public Employee getEmp() {
		return emp;
	}

	public Map<String, String> getM() {
		return m;
	}
	
	
}
