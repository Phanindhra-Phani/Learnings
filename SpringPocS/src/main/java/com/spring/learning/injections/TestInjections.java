package com.spring.learning.injections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestInjections {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-injections.xml");
		Student student = (Student)cxt.getBean("studentByType");
		System.out.println(student);
	}
}
