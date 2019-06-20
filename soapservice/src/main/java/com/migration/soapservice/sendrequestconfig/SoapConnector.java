package com.migration.soapservice.sendrequestconfig;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import com.migration.soapservice.student.entity.StudentDetailsRequest;

@Component
public class SoapConnector {
	
	public Object callWebService(String url, StudentDetailsRequest request) {
		
		Object response = null;
		try {
			
			SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory(MessageFactory.newInstance());
			messageFactory.afterPropertiesSet();
			
			WebServiceTemplate webServiceTemplate = new WebServiceTemplate(messageFactory);
			
			Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
			marshaller.setContextPath("com.migration.soapservice.student.entity");
			marshaller.afterPropertiesSet();
			
			webServiceTemplate.setMarshaller(marshaller);
		    webServiceTemplate.afterPropertiesSet();
		    
		    webServiceTemplate.setUnmarshaller(marshaller);
		    webServiceTemplate.afterPropertiesSet();
		    
		    webServiceTemplate.setDefaultUri(url);
		    
//		    
//		    SoapActionCallback requestCallback = new SoapActionCallback(url) {
//		        public void doWithMessage(WebServiceMessage message) {
//		            SaajSoapMessage soapMessage = (SaajSoapMessage) message;
//		            SoapHeader soapHeader = soapMessage.getSoapHeader();
//
//		            QName wsaToQName = new QName("http://www.w3.org/2005/08/addressing", "To");
//		            SoapHeaderElement wsaTo =  soapHeader.addHeaderElement(wsaToQName);
//		            wsaTo.setText(url);
//
//		            QName wsaActionQName = new QName("http://www.w3.org/2005/08/addressing", "Action");
//		            SoapHeaderElement wsaAction =  soapHeader.addHeaderElement(wsaActionQName);
//		            wsaAction.setText(action);
//		        }
//		    };
		    
		    webServiceTemplate.marshalSendAndReceive(request, new WebServiceMessageCallback() {

		        public void doWithMessage(WebServiceMessage message) {
		        	SoapMessage me = (SoapMessage)message;
		        	System.out.println(me.getSoapHeader());
		            ((SoapMessage)message).setSoapAction(url);
		        }
		    });
		    
//		    SoapObject soapObject = new SoapObject("", "");
		    
//		    response =  webServiceTemplate.marshalSendAndReceive(url, request); -- This is working one
		    
//		    return webServiceTemplate.marshalSendAndReceive(request,
//		                    new SoapActionCallback("http://localhost:8080/service/student-details"));
		    
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("URL::::: "+url);
//		return getWebServiceTemplate().marshalSendAndReceive(url, request);
//	return getWebServiceTemplate()
//            .marshalSendAndReceive(request,
//                    new SoapActionCallback("http://localhost:8080/service/student-details"));
		
		return response;
	}
	
}
