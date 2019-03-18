package org.spring.cyclicdependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyclicDependencyClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-cyclicdependency-config.xml");
		
		/*
		 * Beans are created on starting on Application.
		 * First Faculty class is created then Branch class.
		 * 
		 * Output looks like this:
		 * ---Start---
		 * In branch setter in Faculty class
		 * In faculty setter in Branch class
		 * *********** I am printing Hello in Faculty class ***********
		 * *********** I am printing Hello in Branch class ***********
		 * ---End---
		 */
		Branch branch = (Branch) context.getBean(Branch.class);
		branch.printHello();
		
	}

}
