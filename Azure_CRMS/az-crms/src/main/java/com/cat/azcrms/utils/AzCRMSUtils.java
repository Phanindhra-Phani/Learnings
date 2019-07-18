package com.cat.azcrms.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AzCRMSUtils {
	
	@Autowired
	private Environment environment;
	
	public String fetchSectretValue(String catAppId, String catAppKey, String catAuthenticatedUserEmail) {
		return environment.getProperty(catAppId + ":" + catAppKey + ":" + catAuthenticatedUserEmail);
	}

}
