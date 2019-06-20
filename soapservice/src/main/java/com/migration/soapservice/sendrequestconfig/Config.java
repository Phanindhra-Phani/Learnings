package com.migration.soapservice.sendrequestconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

//@Configuration
public class Config {
	
//	@Bean
//    public Jaxb2Marshaller marshaller() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setContextPath("com.migration.soapservice.entity");
//        return marshaller;
//    }
// 
//    @Bean
//    public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
//    	SoapConnector client = new SoapConnector();
//        client.setDefaultUri("http://localhost:8080/service/student-details");
//        client.setMarshaller(marshaller);
//        client.setUnmarshaller(marshaller);
//        return client;
//    }

}
