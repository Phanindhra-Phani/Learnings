package com.migration.soapservice;


/*
 * 1) https://howtodoinjava.com/spring-boot/spring-soap-client-webservicetemplate/
 * 
 * 2) http://www.springboottutorial.com/spring-boot-content-negotiation-with-xml-json-representations
 * 3) https://grokonez.com/spring-framework/spring-boot/create-springboot-xml-rest-service -- This is used for complete reference
 * 
 * 4) https://examples.javacodegeeks.com/enterprise-java/spring/spring-soap-xml-example/ -- Spring SOAP with XML Example
 */

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.migration.soapservice.entity.DecisionEngineEvalRequest;
import com.migration.soapservice.entity.DecisionEngineEvalResponse;
import com.migration.soapservice.entity.SMOutcomes;
import com.migration.soapservice.service.ATBServiceI;

@Endpoint
public class MyFirstEndpoint {

	@Autowired
	ATBServiceI atbService;
	
	@PayloadRoot(namespace = "http://migration.com/soapservice/entity", localPart = "DecisionEngineEvalRequest")
	public @ResponsePayload JAXBElement<DecisionEngineEvalResponse> processCourseDetailsRequest(@RequestPayload JAXBElement<DecisionEngineEvalRequest> request) {
		System.out.println("Value from request is:::: "+request.getValue().getDecisionEngineEval().getAliasName());

		JAXBElement<DecisionEngineEvalResponse> decisionEngineResponse = new JAXBElement<DecisionEngineEvalResponse>(
				new QName("http://migration.com/soapservice/entity","DecisionEngineEvalRequest"), DecisionEngineEvalResponse.class, null, null);
		
		atbService.callATBService(request.getValue().getDecisionEngineEval());
		
		DecisionEngineEvalResponse decisionEngineEvalResponse = new DecisionEngineEvalResponse();
		SMOutcomes smOutcomes = new SMOutcomes();
		
		smOutcomes.setAppNbr(request.getValue().getDecisionEngineEval().getAppNbr());
		decisionEngineEvalResponse.setSMOutcomes(smOutcomes);
		decisionEngineResponse.setValue(decisionEngineEvalResponse);
		
		return decisionEngineResponse;
	}
	
}
