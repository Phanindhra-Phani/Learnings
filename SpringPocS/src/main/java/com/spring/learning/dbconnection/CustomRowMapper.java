package com.spring.learning.dbconnection;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomRowMapper implements RowMapper {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std = new Student();
		std.setId(rs.getLong("id"));
		std.setName(rs.getString("name"));
		std.setCourse(rs.getString("course"));
		return std;
	}

}
