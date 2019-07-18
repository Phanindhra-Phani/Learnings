package com.cat.azcrms.service;

import static com.cat.azcrms.utils.AzCRMSConstants.ERR_MSG_NO_DATA_FOUND;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.CRMS.entities.ChangeOwner;
import com.cat.CRMS.entities.RevokeAccess;
import com.cat.azcrms.entities.ChangeOwnerRequest;
import com.cat.azcrms.entities.GrantAccessRequestMap;
import com.cat.azcrms.entities.RevokeAccessRequest;
import com.cat.azcrms.exception.NoDataFoundException;
import com.cat.azcrms.integration.VeraUtils;
import com.vera.sdk.Securer;

@Service
public class CRMSAccessServiceImpl implements CRMSAccessServiceI {

	private static final Logger LOGGER = LoggerFactory.getLogger(CRMSAccessServiceImpl.class);

	@Autowired
	private VeraUtils veraUtils;

	@Override
	public void grantAccess(String jsonAsRequest, List<GrantAccessRequestMap> grantAccessRequestMapList)
			throws NoDataFoundException {

		LOGGER.info("Entered grantAccess method");
		Securer securer = veraUtils.createSecurer(jsonAsRequest);
		if (null != securer) {
			Map<String, String> callGrantAccess = new HashMap<String, String>();

			for (GrantAccessRequestMap grantAccessRequestMap : grantAccessRequestMapList) {
				for (Map.Entry<String, List<String>> accessMap : grantAccessRequestMap.getAccessMap().entrySet()) {
					for (String policyId : accessMap.getValue()) {
						callGrantAccess.put(accessMap.getKey(), policyId);
						LOGGER.info("Granting Access");
						securer.grantAccessForDocId(grantAccessRequestMap.getDocId(), callGrantAccess);
						LOGGER.info("Granted Access for docId :: " + grantAccessRequestMap.getDocId()
								+ " :: for key :: " + accessMap.getKey() + " :: and applied policy is :: " + policyId);
					}
				}
			}
		} else {
			throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
		}

		LOGGER.info("Left grantAccess method");
	}

	@Override
	public void revokeAccess(String jsonAsRequest, List<RevokeAccessRequest> revokeAccessRequestList)
			throws NoDataFoundException {

		LOGGER.info("Entered revokeAccess method");
		Securer securer = veraUtils.createSecurer(jsonAsRequest);
		if (null != securer) {
			for (RevokeAccessRequest revokeAccessRequest : revokeAccessRequestList) {
				Object[] objArray = revokeAccessRequest.getUsersToBeRevoked().toArray();
				String[] usersArray = Arrays.copyOf(objArray, objArray.length, String[].class);

				LOGGER.info(
						usersArray + " : are the users revoking access for docId: " + revokeAccessRequest.getDocId());

				securer.revokeAccessForDocId(revokeAccessRequest.getDocId(), usersArray);
			}
		} else {
			throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
		}

		LOGGER.info("Left revokeAccess method");
	}

	@Override
	public void changeOwner(String jsonAsRequest, List<ChangeOwnerRequest> changeOwnerRequestList)
			throws NoDataFoundException {

		LOGGER.info("Entered revokeAccess method");
		Securer securer = veraUtils.createSecurer(jsonAsRequest);

		if (null != securer) {
			for (ChangeOwnerRequest changeOwnerRequest : changeOwnerRequestList) {
				securer.changeOwner(changeOwnerRequest.getDocId(), changeOwnerRequest.getNewOwner());
			}
		} else {
			throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
		}
		LOGGER.info("Left revokeAccess method");

	}

}
