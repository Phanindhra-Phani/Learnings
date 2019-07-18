package com.cat.azcrms.controller;

import static com.cat.azcrms.utils.AzCRMSConstants.ERR_MSG_NO_DATA_FOUND;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_AUTHENTICATE_USER_MAIL;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_CAT_APP_ID;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_CAT_APP_KEY;
import static com.cat.azcrms.utils.AzCRMSConstants.HEADER_CLIENT_DOC_ID;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cat.azcrms.entities.CRMSFileRequest;
import com.cat.azcrms.entities.CRMSFileResponse;
import com.cat.azcrms.exception.NoDataFoundException;
import com.cat.azcrms.service.CRMSSecureAndUnsecureServiceI;
import com.cat.azcrms.utils.AzCRMSUtils;

@RestController
public class CRMSSecureAndUnsecureController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CRMSSecureAndUnsecureController.class);

	@Autowired
	private AzCRMSUtils azCRMSUtils;

	@Autowired
	private CRMSSecureAndUnsecureServiceI crmsSecureAndUnSecureServiceI;

	@PostMapping(value = "/secureFile")
	public CRMSFileResponse crmsSecureFile(@Context HttpServletRequest request,
			@RequestBody CRMSFileRequest crmsFileRequest) throws NoDataFoundException, IOException {

		LOGGER.info("Entered secureOnlyFile method");

		String jsonAsRequest = azCRMSUtils.fetchSectretValue(request.getHeader(HEADER_CAT_APP_ID),
				request.getHeader(HEADER_CAT_APP_KEY), request.getHeader(HEADER_AUTHENTICATE_USER_MAIL));

		if (jsonAsRequest == null) {
			throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
		}

		String clientDocId = request.getHeader(HEADER_CLIENT_DOC_ID);

		LOGGER.info("Client document id:  " + clientDocId);

		return crmsSecureAndUnSecureServiceI.crmsSecureFile(crmsFileRequest, clientDocId, jsonAsRequest);

	}

	@PostMapping(value = "/unsecureFile")
	public CRMSFileResponse crmsUnsecureFile(@Context HttpServletRequest request,
			@RequestBody CRMSFileRequest crmsFileRequest) throws NoDataFoundException, IOException {

		LOGGER.info("Entered crmsUnsecureFile method");

		String jsonAsRequest = azCRMSUtils.fetchSectretValue(request.getHeader(HEADER_CAT_APP_ID),
				request.getHeader(HEADER_CAT_APP_KEY), request.getHeader(HEADER_AUTHENTICATE_USER_MAIL));

		if (jsonAsRequest == null) {
			throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
		}

		return crmsSecureAndUnSecureServiceI.crmsUnsecureFile(crmsFileRequest, jsonAsRequest);
	}
}
