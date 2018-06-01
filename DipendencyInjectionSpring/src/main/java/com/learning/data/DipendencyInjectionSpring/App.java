package com.learning.data.DipendencyInjectionSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.data.di.pojo.annotations.Employee;
import com.learning.data.di.pojo.annotations.EmployeeAdress;
import com.learning.data.di.pojo.aspects.GameController;
import com.learning.data.di.pojo.aspects.LoginController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {


		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring_DI_AOP_Annotations.xml");

		LoginController employee = (LoginController) applicationContext
				.getBean(LoginController.class);

		employee.login();
		
		try {
			employee.login1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		
		try {
			employee.login2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			///e.printStackTrace();
		}

		
		GameController gameController = (GameController) applicationContext
				.getBean(GameController.class);

		gameController.login();
		
		try {
			gameController.login1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
