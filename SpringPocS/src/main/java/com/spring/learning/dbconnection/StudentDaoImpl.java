package com.spring.learning.dbconnection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("studentdao")
public class StudentDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	//Fetch all the Students
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		students = getJdbcTemplate().query(
				"select id,name,course from Student",
				new CustomRowMapper());

		for (Student student : students) {
			System.out.println("Name: "+student.getName()+ " :: Course: "+student.getCourse());
		}
		return students;
	}
	
	//Inserting a new record
	public void insertStudent() {
		String insertSql = "insert into Student values (3,'Sandeep','IT')";
		int returnValue = getJdbcTemplate().update(insertSql);
		if (1 == returnValue) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
	}
	
	public void updateStudent(Long id) {
		String updateSql = "update Student set course='M.Sc' where id=?";
		int returnValue = getJdbcTemplate().update(updateSql, new Long[] {id});
		if (1 == returnValue) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
	}

}
