package com.cat.azcrms.integration;

import java.io.IOException;

import org.slf4j.*;
import org.springframework.stereotype.Component;

import com.vera.sdk.*;

@Component
public class VeraUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(VeraUtils.class);

	static {
		try {
			LOGGER.info("Initializing Vera SDK");
			Sdk.initialize();
		} catch (IOException ioException) {
			LOGGER.info("Error while initializing Vera SDK: " + ioException);
		}
	}
	
	public Securer createSecurer(String jsonToCreateSecurer) {
		LOGGER.info("Creating Securer for json: "+jsonToCreateSecurer);
		
		Context context = new Context(jsonToCreateSecurer);
		
		LOGGER.info("Created context for AppID: " + context.getAppId());
		return new Securer(context);
	}

}
