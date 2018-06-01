package com.spring.learning.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpEL {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-SpEL.xml");
		Student student = (Student)cxt.getBean("studentMarksList");
		System.out.println(student);
	}
}
