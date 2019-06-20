package com.migration.SpringRestWS.controller;

/*
 * 1) https://howtodoinjava.com/spring-boot/spring-soap-client-webservicetemplate/
 * 
 * 2) http://www.springboottutorial.com/spring-boot-content-negotiation-with-xml-json-representations
 * 3) https://grokonez.com/spring-framework/spring-boot/create-springboot-xml-rest-service -- This is used for complete reference
 * 
 * 4) https://examples.javacodegeeks.com/enterprise-java/spring/spring-soap-xml-example/ -- Spring SOAP with XML Example
 */
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.migration.SpringRestWS.entity.Customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/consume")
@Api(value = "Contains API's to consume XML")
public class ConsumeXMLExample {

	@PostMapping(value = "/readXMLApi", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	@ApiOperation(value = "Reads XML")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public Customer readXML(@RequestBody Customer customer) {
		System.out.println("I am this method");
	    System.out.println(customer);
		return customer;
	}
	
}
