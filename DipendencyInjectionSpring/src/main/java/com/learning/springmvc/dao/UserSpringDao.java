package com.learning.springmvc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learning.springmvc.entites.UserEntity1;

@Repository
public class UserSpringDao {

	private static final String INSERT_TODO_QUERY = "INSERT INTO users(USERID,USERFIRSTNAME,USERLASTNAME,AGE,STORYTYPE) VALUES(?,?,?,?,?)";

	private static final String DELETE_TODO_QUERY = "DELETE FROM users WHERE USERID=?";
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<UserEntity1> getAllUsers() throws ClassNotFoundException, SQLException {

		List<UserEntity1> users = new ArrayList<UserEntity1>();

		users = jdbcTemplate.query("SELECT * FROM users", new UserRowMapper());
		for (UserEntity1 UserEntity : users) {
			System.out.println(UserEntity);
		}

		return null;
	}

	public void deleteTodo() throws ClassNotFoundException, SQLException {

		jdbcTemplate.update(DELETE_TODO_QUERY, 1);
		
	}

	public void insertTodo() throws ClassNotFoundException, SQLException {

		jdbcTemplate.update(INSERT_TODO_QUERY, 2, "Phani", "Sravan", 26, "Thriller");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserSpringDao usrDao = new UserSpringDao();
		usrDao.getAllUsers();
		
	}

}
