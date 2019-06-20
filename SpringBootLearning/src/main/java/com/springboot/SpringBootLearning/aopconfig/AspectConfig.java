package com.springboot.SpringBootLearning.aopconfig;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class AspectConfig {
	
	//Logger LOGGER = LoggerFactory.getLogger(AspectConfig.class);
	
//	Logger LOGGER;
//	
//	@Before(value = "within(com.springboot.SpringBootLearning..*)")
//	public void beforeAdvice(JoinPoint joinPoint) {
//		LOGGER.info("Before method:" + joinPoint.getSignature());
//	}
//
//	@After(value = "within(com.springboot.SpringBootLearning..*)")
//	public void afterAdvice(JoinPoint joinPoint) {
//		LOGGER.info("After method:" + joinPoint.getSignature());
//	}

}
