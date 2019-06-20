package com.migration.soapservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootsoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsoapApplication.class, args);
	}

//	@Bean
//    CommandLineRunner lookup(SoapConnector soapConnector) {
//        return args -> {
//            String name = "Sajal";//Default Name
//            if(args.length>0){
//                name = args[0];
//            }
//            DecisionEngineEvalRequest request = new DecisionEngineEvalRequest();
//            DecisionEngineEval decisionEngineEval = new DecisionEngineEval();
//            
//            decisionEngineEval.setAppNbr(BigInteger.valueOf(145523));
//            decisionEngineEval.setAliasName("Sravan Testing");
//            request.setDecisionEngineEval(decisionEngineEval);
//            
//            JAXBElement<DecisionEngineEvalResponse> response = ( JAXBElement<DecisionEngineEvalResponse>) soapConnector.callWebService("http://localhost:8181/soapservice/soapservice-data", request);
//            System.out.println("Got Response As below ========= : ");
//            System.out.println("App Nbr : "+response.getValue().getSMOutcomes().getAppNbr());
//        };
//    }
}
