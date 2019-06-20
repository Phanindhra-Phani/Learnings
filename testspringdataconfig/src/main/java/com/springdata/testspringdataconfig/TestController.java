package com.springdata.testspringdataconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://examples.javacodegeeks.com/enterprise-java/slf4j/slf4j-spring-boot-example/

@RestController
@RequestMapping(value = "/testmysql")
public class TestController {
	
	//Logger logger = Logger.getLogger(TestController.class);
	
	
//	Logger logger = Logger.getLogger(TestController.class);
	
//	Logger logger = LoggerFactory.getLogger(TestController.class);
	
//	LoggerFactory logger = LoggerFactory.makeNewLoggerInstance(TestController.class.getName());
	
//	MyLogger logger = new MyLogger(TestController.class.getName());
	
	@Autowired
	TestRepository testRepo;
	
	@GetMapping(value = "")
	public void testMysql() {
		
		//logger.info("First Logger implmentation");
		
		testRepo.getLicensee();
	}

}
