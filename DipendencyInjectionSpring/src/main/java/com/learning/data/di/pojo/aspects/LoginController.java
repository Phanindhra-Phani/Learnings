package com.learning.data.di.pojo.aspects;

import org.springframework.stereotype.Component;

@Component
public class LoginController {

	public void login() {
		System.out.println("Hey Hi-- I am loging controller");
	}

	public void login1() throws Exception{
		System.out.println("Hey Hi-- I am loging controller");
		
		throw new Exception();
	}

	public void login2() throws Exception {
		System.out.println("Hey Hi-- I am loging controller");

		throw new Exception();
	}

}
