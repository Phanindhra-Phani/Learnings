package com.springdata.testspringdataconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestspringdataconfigApplication {

	static Logger log = LoggerFactory.getLogger(TestspringdataconfigApplication.class);
	 
    public static void main(String[] args)
    {
        log.debug("Sample debug message");
        log.info("Sample info message");
        log.error("Sample error message");
    }
}
