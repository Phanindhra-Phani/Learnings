package com.migration.soapservice;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapConfig extends WsConfigurerAdapter {

	
	/* @Bean
	    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
	        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
	        servlet.setApplicationContext(applicationContext);

	        return new ServletRegistrationBean(servlet, "/consultaws/*");
	    }

	    @Bean(name="consultaws")
	    public Wsdl11Definition defaultWsdl11Definition() {
	        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
	        wsdl11Definition.setWsdl(new ClassPathResource("/consultaws.wsdl"));

	        return wsdl11Definition;
	    }*/
	    
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatcherServlet, "/soapservice/*");
	}

	@Bean(name = "DecisionEngineEvalWsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema readXMLSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("DecisionEngineEvalPort");
		definition.setTargetNamespace("http://migration.com/soapservice/entity");
		definition.setLocationUri("/soapservice/soapservice-data");
		definition.setSchema(readXMLSchema);
		return definition;
	}

	@Bean
	public XsdSchema readXMLSchema() {
		return new SimpleXsdSchema(new ClassPathResource("DecisionEngineEval.xsd"));
	}
}
