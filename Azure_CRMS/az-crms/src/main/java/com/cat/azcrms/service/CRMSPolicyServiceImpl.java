package com.cat.azcrms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.azcrms.integration.VeraUtils;
import com.vera.sdk.Securer;
import com.vera.sdk.Securer.PolicySet;

@Service
public class CRMSPolicyServiceImpl implements CRMSPolicyServiceI {

	@Autowired
	private VeraUtils veraUtils;
	
	@Override
	public PolicySet[] getAllPolicies(String jsonAsRequest) {
		Securer securer = veraUtils.createSecurer(jsonAsRequest);
		return securer.getPolicies();
	}

}
