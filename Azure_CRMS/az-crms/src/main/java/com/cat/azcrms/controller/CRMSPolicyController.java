package com.cat.azcrms.controller;

import static com.cat.azcrms.utils.AzCRMSConstants.ERR_MSG_NO_DATA_FOUND;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_AUTHENTICATE_USER_MAIL;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_CAT_APP_ID;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_CAT_APP_KEY;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.azcrms.exception.NoDataFoundException;
import com.cat.azcrms.service.CRMSPolicyServiceI;
import com.cat.azcrms.utils.AzCRMSUtils;
import com.vera.sdk.Securer.PolicySet;

@RestController
public class CRMSPolicyController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CRMSPolicyController.class);

	@Autowired
	private CRMSPolicyServiceI crmsPolicyServiceI;

	@Autowired
	private AzCRMSUtils azCRMSUtils;

	@GetMapping(value = "/getPolicies")
	public PolicySet[] getAllPolicies(@Context HttpServletRequest request) throws NoDataFoundException, IOException {
		LOGGER.info("Entered getAllPolicies method");

		String jsonAsRequest = azCRMSUtils.fetchSectretValue(request.getHeader(HEADER_CAT_APP_ID),
				request.getHeader(HEADER_CAT_APP_KEY), request.getHeader(HEADER_AUTHENTICATE_USER_MAIL));

		if (jsonAsRequest == null) {
			throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
		}

		LOGGER.info("Left getAllPolicies method");

		return crmsPolicyServiceI.getAllPolicies(jsonAsRequest);
	}

}
