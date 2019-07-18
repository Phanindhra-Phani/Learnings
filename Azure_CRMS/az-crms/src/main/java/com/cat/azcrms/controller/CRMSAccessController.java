package com.cat.azcrms.controller;

import static com.cat.azcrms.utils.AzCRMSConstants.ERR_MSG_NO_DATA_FOUND;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_AUTHENTICATE_USER_MAIL;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_CAT_APP_ID;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_CAT_APP_KEY;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cat.azcrms.entities.ChangeOwnerRequest;
import com.cat.azcrms.entities.GrantAccessRequestMap;
import com.cat.azcrms.entities.RevokeAccessRequest;
import com.cat.azcrms.exception.NoDataFoundException;
import com.cat.azcrms.service.CRMSAccessServiceI;
import com.cat.azcrms.utils.AzCRMSUtils;

@RestController
public class CRMSAccessController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CRMSAccessController.class);

	@Autowired
	private AzCRMSUtils azCRMSUtils;

	@Autowired
	private CRMSAccessServiceI crmsAccessServiceI;

	@PostMapping(value = "/grantaccess")
	public void grantAccess(@Context HttpServletRequest request,
			@RequestBody List<GrantAccessRequestMap> grantAccessRequestMapList) throws NoDataFoundException {

		LOGGER.info("Entered grantAccess method");

		String jsonAsRequest = azCRMSUtils.fetchSectretValue(request.getHeader(HEADER_CAT_APP_ID),
				request.getHeader(HEADER_CAT_APP_KEY), request.getHeader(HEADER_AUTHENTICATE_USER_MAIL));

		if (jsonAsRequest == null) {
			throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
		}

		crmsAccessServiceI.grantAccess(jsonAsRequest, grantAccessRequestMapList);

		LOGGER.info("Left grantAccess method");
	}

	@PostMapping(value = "/revokeaccess")
	public void revokeAccess(@Context HttpServletRequest request,
			@RequestBody List<RevokeAccessRequest> revokeAccessRequestList) throws NoDataFoundException {

		LOGGER.info("Entered revokeAccess method");

		String jsonAsRequest = azCRMSUtils.fetchSectretValue(request.getHeader(HEADER_CAT_APP_ID),
				request.getHeader(HEADER_CAT_APP_KEY), request.getHeader(HEADER_AUTHENTICATE_USER_MAIL));

		if (jsonAsRequest == null) {
			throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
		}

		crmsAccessServiceI.revokeAccess(jsonAsRequest, revokeAccessRequestList);

		LOGGER.info("Left revokeAccess method");
	}

	public void changeOwner(@Context HttpServletRequest request,
			@RequestBody List<ChangeOwnerRequest> changeOwnerRequestList) throws NoDataFoundException {

		LOGGER.info("Entered changeOwner method");

		String jsonAsRequest = azCRMSUtils.fetchSectretValue(request.getHeader(HEADER_CAT_APP_ID),
				request.getHeader(HEADER_CAT_APP_KEY), request.getHeader(HEADER_AUTHENTICATE_USER_MAIL));

		if (jsonAsRequest == null) {
			throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
		}

		crmsAccessServiceI.changeOwner(jsonAsRequest, changeOwnerRequestList);

		LOGGER.info("Left changeOwner method");

	}

}
