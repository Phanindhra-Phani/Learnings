package com.springdata.testspringdataconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void getLicensee() {
		Long licenseeId = jdbcTemplate.queryForObject("select licensee_id from mfi_licensee where licensee_id=?", new Object[] {14}, Long.class);
		System.out.println("Licensee Id::::: "+licenseeId);
	}
	
//	public void printLogger(LoggingEvent loggingEvent) {
//		System.out.println("Logging Event:::: " + loggingEvent);
//	}

}
