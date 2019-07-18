package com.cat.azcrms.service;

import java.util.List;

import com.cat.azcrms.entities.ChangeOwnerRequest;
import com.cat.azcrms.entities.GrantAccessRequestMap;
import com.cat.azcrms.entities.RevokeAccessRequest;
import com.cat.azcrms.exception.NoDataFoundException;

public interface CRMSAccessServiceI {

	void grantAccess(String jsonAsRequest, List<GrantAccessRequestMap> grantAccessRequestMapList)
			throws NoDataFoundException;

	void revokeAccess(String jsonAsRequest, List<RevokeAccessRequest> revokeAccessRequestList) throws NoDataFoundException;

	void changeOwner(String jsonAsRequest, List<ChangeOwnerRequest> changeOwnerRequestList) throws NoDataFoundException;

}
