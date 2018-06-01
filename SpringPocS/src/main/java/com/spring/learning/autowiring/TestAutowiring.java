package com.spring.learning.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAutowiring {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-autowiring.xml");
		Student student = (Student)cxt.getBean("studentByConstructor");
		System.out.println(student);
	}
}
