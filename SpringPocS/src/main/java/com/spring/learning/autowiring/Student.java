package com.spring.learning.autowiring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private Long enrollId;
	private Boolean result;
	private Region place;
	private Subject subject;
	
	Student(){
		
	}
	public Student(Subject subject) {
		this.subject = subject;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Region getPlace() {
		return place;
	}

	public void setPlace(Region place) {
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEnrollId() {
		return enrollId;
	}

	public void setEnrollId(Long enrollId) {
		this.enrollId = enrollId;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", enrollId=" + enrollId + ", result="
				+ result + ", place=" + place + ", subject=" + subject + "]";
	}

}
