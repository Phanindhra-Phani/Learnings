package org.spring.datasourceconfig;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/*
 * Reference from:
 * http://www.technicalkeeda.com/spring-tutorials/how-to-encrypt-spring-configuration-datasource-password-credentials
 */

public class EncryptedDataSource extends DriverManagerDataSource {
	
	@Override
	public String getPassword() {
		String password = super.getPassword();
		return decodePassword(password);
	}
	
	public String decodePassword(String password) {
		System.out.println("Encrypted Password is:::: "+password);
		return password.replace("$$$^", "");
	}
	
	public String encodePassword(String password) {
		return "$$$^" +password;
	}

}
