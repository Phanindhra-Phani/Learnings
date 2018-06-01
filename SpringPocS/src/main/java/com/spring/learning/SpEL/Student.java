package com.spring.learning.SpEL;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private Long enrollId;
	private Boolean result;
	private Region place;
	private Double points;
	private List<String> subjects;
	private Set<String> books;
	private Map<String, Double> marksList;

	public Map<String, Double> getMarksList() {
		return marksList;
	}

	public void setMarksList(Map<String, Double> marksList) {
		this.marksList = marksList;
	}

	public Set<String> getBooks() {
		return books;
	}

	public void setBooks(Set<String> books) {
		this.books = books;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Double getPoints() {
		return points;
	}

	public void setPoints(Double points) {
		this.points = points;
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
				+ result + ", place=" + place + ", points=" + points
				+ ", subjects=" + subjects + ", books=" + books
				+ ", marksList=" + marksList + "]";
	}

}
