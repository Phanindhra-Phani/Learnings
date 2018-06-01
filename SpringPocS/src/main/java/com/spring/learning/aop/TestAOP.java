package com.spring.learning.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-aop.xml");
		GeneralClass gn = cxt.getBean(GeneralClass.class);
		gn.print();
	}
}
