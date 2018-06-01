package com.learning.data.di.pojo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	// @Before("execution(* com.learning.data.di.pojo.aspects.LoginController.*(..))")
	// public void printbefore() {
	// System.out.println("Pring Aspect");
	// }
	//
	//
	// @After("execution(* com.learning.data.di.pojo.aspects.LoginController.login(..))")
	// public void printAfter() {
	// System.out.println("printAfter");
	// }
	//
	//
	// @AfterReturning("execution(* com.learning.data.di.pojo.aspects.LoginController.login(..))")
	// public void printAfterReturn() {
	// System.out.println("printAfterReturn");
	// }
	//
	//
	// @AfterThrowing("execution(* com.learning.data.di.pojo.aspects.LoginController.*(..))")
	// public void printAfterThrowing() {
	// System.out.println("printAfterThrowing");
	// }

	@Around("execution(* com.learning.data.di.pojo.aspects.LoginController.*(..))")
	public void printAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("printAround Before ------- ");

		if (userValidation()) {
			joinPoint.proceed();
		}

		System.out.println("printAround After ****** ");
	}

	private boolean userValidation() {
		return false;

	}

}
