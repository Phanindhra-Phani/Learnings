package com.learning.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.learning.springmvc.entites.UserVO;

@Repository
public class LoginValidationDaoImpl {

	public Boolean validateLogin(UserVO userVO) {
		
		if("abc123@gmail.com".equals(userVO.getUsermail()) && "abc".equals(userVO.getPassword())){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}
