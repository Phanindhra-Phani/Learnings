package com.spring.learning.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectDefinition {
	
	@Before("within(com.spring.learning.aop.*)")
	public void beforeMethod(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().getName() + "  "+joinPoint.getTarget().getClass());
	}

}
