package com.learning.springmvc.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.springmvc.entites.UserVO;
import com.learning.springmvc.service.LoginValidationService;

@Controller
public class LoginValidationController {
	
	@Autowired
	LoginValidationService loginValidationService;
	
	@RequestMapping(value = "/login1", method=RequestMethod.POST)
	public String validateLogin(@RequestParam String usermail, @RequestParam String password, ModelMap model){
		model.put("key",usermail);
		return "welcome";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String validateLoginEffective(UserVO userVO, ModelMap model){
		System.out.println(userVO.toString());
		Boolean isValidUser = loginValidationService.validateLogin(userVO);
		if(isValidUser){
			model.put("key",userVO.getUsermail());
		}else{
			model.put("error","Not Valid User");
		}
		return "welcome";
		
	}
	
	@RequestMapping(value = "/getUsers", method=RequestMethod.GET)
	public String getUsers(UserVO userVO, ModelMap model) throws ClassNotFoundException, SQLException{
		System.out.println(userVO.toString());
		
		loginValidationService.getUsers(userVO);
		
		return "welcome";
		
	}
}
