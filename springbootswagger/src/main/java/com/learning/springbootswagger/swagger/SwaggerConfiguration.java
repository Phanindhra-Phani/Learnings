package com.learning.springbootswagger.swagger;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("com.learning.springbootswagger"))
				.paths(regex("/rest.*"))
				.build()
				.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {

		ApiInfo apiInfo = new ApiInfo("Spring Boot Swagger Example API", 
				"Spring Boot Swagger Example API for learning", 
				"1.0",
				"Terms of Service", 
				new Contact("Sravan Kumar", "http://www.youtube.com", "phani.pala13@gmail.com"), 
				"Apache Licensee version 2.0",
				"https://www.apache.org/licensee.html");
		return apiInfo;
	}
	
}
