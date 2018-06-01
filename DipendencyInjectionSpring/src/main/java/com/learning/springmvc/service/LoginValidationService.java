package com.learning.springmvc.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springmvc.dao.LoginValidationDaoImpl;
import com.learning.springmvc.dao.UserSpringDao;
import com.learning.springmvc.entites.UserVO;

@Service
public class LoginValidationService {

	@Autowired
	LoginValidationDaoImpl loginValidationDaoImpl;
	
	@Autowired
	UserSpringDao userDao;
		
	public Boolean validateLogin(UserVO userVO) {
		return loginValidationDaoImpl.validateLogin(userVO);
	}

	public void getUsers(UserVO userVO) throws ClassNotFoundException, SQLException {
		userDao.getAllUsers();
		
	}

	
}
