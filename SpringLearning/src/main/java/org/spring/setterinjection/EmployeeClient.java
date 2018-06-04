package org.spring.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		
		/*
		 * Commented BeanFactory though it is used to create Beans based on the configuration file provided
		 * But ApplicationContext has more features than BeanFactory like Event Handling etc..,
		 */
//		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring-setter-config.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-setter-config.xml");
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println("Employee Details: "+ employee);
	}
}
