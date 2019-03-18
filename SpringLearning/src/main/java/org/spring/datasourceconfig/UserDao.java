package org.spring.datasourceconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void printUserName() {
		String s = jdbcTemplate.queryForObject("SELECT USER_NAME FROM USER WHERE USER_ID = 1", String.class);
		System.out.println(s);
	}
}
