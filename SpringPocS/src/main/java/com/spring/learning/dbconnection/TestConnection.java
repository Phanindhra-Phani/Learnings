package com.spring.learning.dbconnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestConnection {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-dbconnection.xml");
		StudentDaoImpl std = (StudentDaoImpl)cxt.getBean("studentdao");
		std.getAllStudents();
//		std.insertStudent();
		std.updateStudent(2L);
		std.getAllStudents();
	}
}
