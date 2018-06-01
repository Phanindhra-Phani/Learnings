package com.learning.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/loginform", method=RequestMethod.GET)
	public String login(){
		System.out.println("In login");
		return "loginform";
	}
	
	
}
