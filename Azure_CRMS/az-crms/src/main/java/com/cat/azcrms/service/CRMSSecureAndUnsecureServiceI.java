package com.cat.azcrms.service;

import java.io.IOException;

import com.cat.azcrms.entities.CRMSFileRequest;
import com.cat.azcrms.entities.CRMSFileResponse;
import com.cat.azcrms.exception.NoDataFoundException;

public interface CRMSSecureAndUnsecureServiceI {

	CRMSFileResponse crmsSecureFile(CRMSFileRequest crmsFileRequest, String clientDocId, String jsonAsRequest) throws NoDataFoundException, IOException;

	CRMSFileResponse crmsUnsecureFile(CRMSFileRequest crmsFileRequest, String jsonAsRequest) throws NoDataFoundException, IOException;
}
