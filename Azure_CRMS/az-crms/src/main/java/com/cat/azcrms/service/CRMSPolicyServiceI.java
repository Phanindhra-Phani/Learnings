package com.cat.azcrms.service;

import com.vera.sdk.Securer.PolicySet;

public interface CRMSPolicyServiceI {
	
	PolicySet[] getAllPolicies(String jsonAsRequest);

}
