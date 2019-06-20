package com.springboot.SpringBootLearning.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.SpringBootLearning.entity.DocumentDetails;
import com.vera.sdk.Context;
import com.vera.sdk.Sdk;
import com.vera.sdk.Securer;
import com.vera.sdk.Securer.SecureInputStreamResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/cat")
@Api(value = "Vera Integration API's", description = "Vera Integration API's")
public class VeraIntegrationController {

//	static Logger LOGGER = LoggerFactory.getLogger(VeraIntegrationController.class);
	
	static Securer securer = null;
	static {
		try {
			Sdk.initialize();
			securer = createSecurer();
		} catch (IOException e) {
//			LOGGER.info("Error when initializing Vera Sdk");
			e.printStackTrace();
		}
	}
	
	private static Securer createSecurer() throws FileNotFoundException {
		
		String currentDir = System.getProperty("user.dir");
		Context context = new Context(new File(currentDir, "conf.json"));
		return new Securer(context);
		
	}
	
	@GetMapping(value = "/getPolicies")
	@ApiOperation(value = "Get all policies")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public Securer.PolicySet[] getAllPolicies() throws IOException {
		
//		LOGGER.info("In VeraIntegrationController class getAllPolicies method");
		Securer.PolicySet[] policies = null;
		policies = securer.getPolicies();

		for (Securer.PolicySet policy : policies)
			System.out.println(String.format("%s %s", policy.getPolicyId(), policy.getPolicyName()));

		return policies;
	}
	
	@PostMapping(value = "/secureFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@ApiOperation(value = "Secure a file")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public String secureFile(@RequestParam("file") MultipartFile file) throws IOException {
		
//		LOGGER.info("In VeraIntegrationController class secureFile method");

		InputStream secureInputStream = null;
		
		InputStream inputStream =  file.getInputStream();
		String originalFileName = file.getOriginalFilename();
		
		
		System.out.println("File Name ::::: "+originalFileName);
		
		FileOutputStream targetStream = new FileOutputStream("/Users/455813/Downloads/test_secure.html");
		
		try {
			
			String hashcode = generateUUID();
//			LOGGER.info("Hashcode generated through UUID is ::::: "+hashcode);
			SecureInputStreamResult secureInputStreamResult = 
					securer.secureInputStream(inputStream, originalFileName, hashcode);
			
//			LOGGER.info("Doc id returned from Vera is ::::: "+secureInputStreamResult.getDocId() + " :::: for file ::::: "+originalFileName);
			
			secureInputStream = secureInputStreamResult.getSecureStream();
			
	            try {
	                byte[] buf = new byte[4096];
	                int bytesRead = 0;
	                while ((bytesRead = secureInputStream.read(buf, 0, buf.length)) >= 0)
	                    targetStream.write(buf, 0, bytesRead);
	            } finally{
//	            	LOGGER.info("File downloaded successfully and closing opened streams");
	                secureInputStream.close();
	            }
		} catch (IOException e) {	
//			LOGGER.info("Error when securing a file");
			e.printStackTrace();
		} finally {
			targetStream.close();
			inputStream.close();
		}
		return "fileName is: "+file.getOriginalFilename();
	}

	@PostMapping(value = "/grantAccess", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Grant access for the file. Format for map is email as key and policy as value")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public void grantAccess(@RequestBody DocumentDetails documentDetails) throws IOException {
		
//		LOGGER.info("In VeraIntegrationController class getAllPolicies method");
		try {
			securer.grantAccessForDocId(documentDetails.getDocId(), documentDetails.getAccessMap());
//			LOGGER.info("Successfully granted access for requested document ::::: "+documentDetails.toString());
		} catch (Exception exception){
//			LOGGER.info("Failed to grant file");
			exception.printStackTrace();
		}
	}
	
	@PostMapping(value = "/unsecurefile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@ApiOperation(value = "Unsecure a file")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public String unSecureFile(@RequestParam("file") MultipartFile file) throws IOException {
		
		InputStream secureInputStream = null;
		
		InputStream inputStream =  file.getInputStream();
		
		FileOutputStream targetStream = new FileOutputStream("/Users/455813/Downloads/test_unsecure.html");
		try {
			secureInputStream = securer.unsecureInputStream(inputStream);
			
	            try {
	                byte[] buf = new byte[4096];
	                int bytesRead = 0;
	                while ((bytesRead = secureInputStream.read(buf, 0, buf.length)) >= 0)
	                    targetStream.write(buf, 0, bytesRead);
	            } finally{
	                secureInputStream.close();
	            }
		} catch (IOException e) {	
			e.printStackTrace();
		} finally {
			targetStream.close();
			inputStream.close();
		}
		return "fileName is: "+file.getOriginalFilename();
	}
	
	@PostMapping(value = "/changeowner", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Change owner for the file. Format for map is email as key and policy as value")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public void changeOwner(@RequestBody DocumentDetails documentDetails) throws IOException {
		
		try {
			securer.changeOwner(documentDetails.getDocId(), documentDetails.getNewOwner());
		} catch (Exception exception){
			exception.printStackTrace();
		}
		
	}
	
	private String generateUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
}
