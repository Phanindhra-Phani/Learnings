package com.example.azure.keyvault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application implements CommandLineRunner {

	//https://veraclient2.vault.azure.net/secrets/MyClientDetails2/a8532eb334a449ad923774fab7d7e10e
//	@Value("${VeraCRMSSecretKeyName}")
//	private String connectionString;
	
	@Autowired
	private Environment env;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void run(String... varl) throws Exception {
		//System.out.println(String.format("\nConnection String stored in Azure Key Vault:\n%s\n", connectionString));
		
		String secretValue = env.getProperty("VeraCRMSSecretKeyName");
		
		System.out.println("Environment varibale is :::: "+secretValue);
	}
	
	public void execute(@Value("${VeraCRMSSecretKeyName}") String connectionString) {
		System.out.println(String.format("\nConnection String stored in Azure Key Vault:\n%s\n", connectionString));
	}
}