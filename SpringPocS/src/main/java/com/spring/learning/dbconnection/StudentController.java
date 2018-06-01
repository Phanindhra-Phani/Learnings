package com.spring.learning.dbconnection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentController {
	
	@Autowired
	private StudentDaoImpl studentDaoImpl;
	
	public void getAllStudents(){
		List<Student> students = studentDaoImpl.getAllStudents();
		System.out.println(students.size());
	}
	

}
