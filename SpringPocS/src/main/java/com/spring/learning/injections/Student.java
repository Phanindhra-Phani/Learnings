package com.spring.learning.injections;

import org.springframework.beans.factory.annotation.Autowired;


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

	@Autowired
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Region getPlace() {
		return place;
	}

	@Autowired
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
