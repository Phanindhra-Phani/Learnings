package com.springboot.SpringBootLearning.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vera.sdk.Context;
import com.vera.sdk.Sdk;
import com.vera.sdk.Securer;
import com.vera.sdk.Securer.SecureInputStreamResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/test")
@Api(value = "User Details API", description = "User Details API")
public class DemoController {
	static Securer securer = null;
	static {
		try {
			Sdk.initialize();
			securer = createSecurer();
		} catch (IOException e) {
			System.out.println("Error when initializing Vera Sdk");
			e.printStackTrace();
		}
	}

	@GetMapping(value = "/getApi")
	@ApiOperation(value = "Test api")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public String getTestMethod() {
		System.out.println("In getMethod API");
		return "I am in my first getMethod()";
	}

	@GetMapping(value = "/veraApi")
	@ApiOperation(value = "Get all policies")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public Securer.PolicySet[] veraSecureApi() throws IOException {
		System.out.println("In Vera get policies api");
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
		System.out.println("In Vera Secure api");

//		FileInputStream fis = new FileInputStream((File)file);
//		String originalFileName = file.getName();
		
//		File testFile = new File("test");
//		FileUtils.writeByteArrayToFile(testFile, file.getBytes());
		
		InputStream secureInputStream = null;
		
		InputStream inputStream =  file.getInputStream();
		String originalFileName = file.getOriginalFilename();
		
		System.out.println("File name is::: "+originalFileName);
		String srcPath = "/Users/455813/Downloads/test.pdf";
		//FileInputStream inputStream = new FileInputStream("C:\\Users\\rayarvk\\Desktop\\Tomorrow.docx");
		FileOutputStream targetStream = new FileOutputStream("/Users/455813/Downloads/test_secure.html");
		
		try {
			
			String hashcode = generateUUID();
			System.out.println("hashcode::: "+hashcode);
//			String inputHash = calcHash(srcPath);
//			String inputHash = calcHash(inputStream);
			SecureInputStreamResult secureInputStreamResult = 
					securer.secureInputStream(inputStream, originalFileName, hashcode);
			
			System.out.println("Doc id::: "+secureInputStreamResult.getDocId());
			
			secureInputStream = secureInputStreamResult.getSecureStream();
			
	            try {
	                byte[] buf = new byte[4096];
	                int bytesRead = 0;
	                while ((bytesRead = secureInputStream.read(buf, 0, buf.length)) >= 0)
	                    targetStream.write(buf, 0, bytesRead);
	            }
	            finally
	            {
	            	System.out.println("done");
	                secureInputStream.close();
	            }

			
//		} catch (IOException | NoSuchAlgorithmException e) {
		} catch (IOException e) {	
			System.out.println("Error when securing a file");
			e.printStackTrace();
		} finally {
			targetStream.close();
			inputStream.close();
		}
		return "fileName is: "+file.getOriginalFilename();
	}

	private String generateUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	@PostMapping(value = "/secureFileUsingPath")
	@ApiOperation(value = "Secure a file")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public String secureFileUsingPath(@RequestParam("file") String sourcePath) throws IOException {
		System.out.println("In Vera Secure api");

		InputStream sourceStream = new FileInputStream(sourcePath);

		InputStream secureInputStream = null;
		String originalFileName = new File(sourcePath).getName();
		System.out.println("File name is::: "+originalFileName);
		
		try {
			SecureInputStreamResult secureInputStreamResult = 
					securer.secureInputStream(sourceStream, originalFileName, calcHash(sourcePath));
			
			System.out.println("Doc id::: "+secureInputStreamResult.getDocId());
			
			secureInputStream = secureInputStreamResult.getSecureStream();
			
			downloadSecureFile(secureInputStream);
			
		} catch (IOException | NoSuchAlgorithmException e) {
			System.out.println("Error when securing a file");
			e.printStackTrace();
		}
		return "fileName is: "+originalFileName;
	}

	private static Securer createSecurer() throws FileNotFoundException {
		String currentDir = System.getProperty("user.dir");
		Context context = new Context(new File(currentDir, "conf.json"));
		return new Securer(context);
	}
	
	/// Help method to calc a hash based on file content
    private static String calcHash(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance("MD5");

//        FileInputStream stream = new FileInputStream(path);
        /*try {*/
            int bytesRead;
            byte[] buf = new byte[4096];
            while ((bytesRead = inputStream.read(buf)) >= 0){
                md.update(buf, 0, bytesRead);
            }

            byte[] digest = md.digest();
            String result = "";
            for (int i = 0; i < digest.length; ++i){
                result += Integer.toHexString(digest[i]);
            }
            System.out.println("result::: "+result);
            return result;
/*
        }
        finally {
        	inputStream.close();
        }*/
    }
    
    private static String calcHash(String path) throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        FileInputStream stream = new FileInputStream(path);
        try {
            int bytesRead;
            byte[] buf = new byte[4096];
            while ((bytesRead = stream.read(buf)) >= 0)
                md.update(buf, 0, bytesRead);

            byte[] digest = md.digest();
            String result = "";
            for (int i = 0; i < digest.length; ++i)
                result += Integer.toHexString(digest[i]);

            return result;

        }
        finally {
        	stream.close();
        }
    }
    
    
    private void downloadSecureFile(InputStream inputStream) throws IOException {
    	
//    	BufferedInputStream bis = new BufferedInputStream(inputStream);
//    	OutputStream out = new ByteArrayOutputStream();
    	FileOutputStream out = new FileOutputStream("C:/Users/rayarvk/Desktop/Testsecure.html");
    	
//    	byte[] buffer = new byte[4096];
//		int len = inputStream.read(buffer);
//		while (len >= 0) {
//		    out.write(buffer, 0, len);
//		    len = inputStream.read(buffer);
//		}
//    	byte[] bytes = IOUtils.toByteArray(inputStream);
//    	System.out.println("Size of stream is : "+bytes.length);
    	byte[] buf = new byte[1008813135];
        int bytesRead = 0;
        while ((bytesRead = inputStream.read(buf, 0, buf.length)) != -1){
        	out.write(buf, 0, bytesRead);
        }
        
		inputStream.close();
		out.flush();
		out.close();
    	
    }

}