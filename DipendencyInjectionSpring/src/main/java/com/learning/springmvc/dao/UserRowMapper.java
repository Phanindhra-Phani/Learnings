package com.learning.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.learning.springmvc.entites.UserEntity1;

public class UserRowMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserEntity1 usr = new UserEntity1();
		usr.setUserId(rs.getInt("USERID"));
		usr.setUserFirstName(rs.getString("USERFIRSTNAME"));
		usr.setUserLastName(rs.getString("USERLASTNAME"));
		usr.setAge(rs.getInt("AGE"));
		usr.setStoryType(rs.getString("STORYTYPE"));
		return usr;
	}

}
