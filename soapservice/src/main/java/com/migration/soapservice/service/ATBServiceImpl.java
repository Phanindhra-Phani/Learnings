package com.migration.soapservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.migration.soapservice.entity.DecisionEngineEval;
import com.migration.soapservice.sendrequestconfig.SoapConnector;
import com.migration.soapservice.student.entity.StudentDetailsRequest;
import com.migration.soapservice.student.entity.StudentDetailsResponse;

@Service
public class ATBServiceImpl implements ATBServiceI {

	@Autowired
	SoapConnector soapConnector;
	
	@Override
	public void callATBService(DecisionEngineEval decisionEngineEval) {
		
		try {
		System.out.println("Request in decisionEngineEval is:::: "+decisionEngineEval.toString());
		
		StudentDetailsRequest studentDetailsRequest = new StudentDetailsRequest();
		studentDetailsRequest.setName("Sajal");
		
		StudentDetailsResponse response = (StudentDetailsResponse) soapConnector.callWebService("http://localhost:8080/service/student-details", studentDetailsRequest);

		System.out.println("Response in MyFirstEndPoint is:::: "+response.toString());
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
