package com.cat.azcrms.service;

import static com.cat.azcrms.utils.AzCRMSConstants.ERR_MSG_NO_DATA_FOUND;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.azcrms.entities.CRMSFileRequest;
import com.cat.azcrms.entities.CRMSFileResponse;
import com.cat.azcrms.exception.NoDataFoundException;
import com.cat.azcrms.integration.VeraUtils;
import com.vera.sdk.Securer;
import com.vera.sdk.Securer.SecureInputStreamResult;

@Service
public class CRMSSecureAndUnsecureServiceImpl implements CRMSSecureAndUnsecureServiceI {

	private static final Logger LOGGER = LoggerFactory.getLogger(CRMSSecureAndUnsecureServiceImpl.class);
	
	@Autowired
	private VeraUtils veraUtils;
	
	@Override
	public CRMSFileResponse crmsSecureFile(CRMSFileRequest crmsFileRequest, String clientDocId,
			String jsonAsRequest) throws NoDataFoundException, IOException {
		
		LOGGER.info("Entered crmsSecureFile method");
		
		Securer securer = veraUtils.createSecurer(jsonAsRequest);
		InputStream inputStream = new ByteArrayInputStream(crmsFileRequest.getFileInBytes());
		
		CRMSFileResponse crmsFileResponse = null;
		try {
			if (null != securer) {

				crmsFileResponse = new CRMSFileResponse();

				InputStream outputInputStream;
				SecureInputStreamResult secureInputStreamResult;

				if (clientDocId != null && !"".equalsIgnoreCase(clientDocId)) {
					secureInputStreamResult = securer.secureInputStream(inputStream, crmsFileRequest.getFileName(),
							crmsFileRequest.getHashCode(), clientDocId);
				} else {
					secureInputStreamResult = securer.secureInputStream(inputStream, crmsFileRequest.getFileName(),
							crmsFileRequest.getHashCode());
				}
				crmsFileResponse.setDocId(secureInputStreamResult.getDocId());
				outputInputStream = secureInputStreamResult.getSecureStream();
				LOGGER.info("Out from securing API call");

				crmsFileResponse.setFileName(crmsFileRequest.getFileName());
				
				byte[] fileInBytes = IOUtils.toByteArray(outputInputStream);

				LOGGER.info("InputStream to byte array conversion is completed");

				crmsFileResponse.setFileInBytes(fileInBytes);
				
			} else {
				throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			inputStream.close();
		}
		
		LOGGER.info("Left crmsSecureFile method");
		
		return crmsFileResponse;
	}

	@Override
	public CRMSFileResponse crmsUnsecureFile(CRMSFileRequest crmsFileRequest, String jsonAsRequest)
			throws NoDataFoundException, IOException {
		LOGGER.info("Entered crmsUnsecureFile method");
		
		Securer securer = veraUtils.createSecurer(jsonAsRequest);
		InputStream secureInputStream = new ByteArrayInputStream(crmsFileRequest.getFileInBytes());
		
		CRMSFileResponse crmsFileResponse = null;
		
		try {
			if (null != securer) {
				InputStream unsecureInputStream = securer.unsecureInputStream(secureInputStream);
				
				String unsecuredFileName = crmsFileRequest.getFileName().replaceAll(".html", "");
				
				crmsFileResponse = new CRMSFileResponse();
				
				crmsFileResponse.setFileName(unsecuredFileName);
				
				byte[] fileInBytes = IOUtils.toByteArray(unsecureInputStream);
				crmsFileResponse.setFileInBytes(fileInBytes);
			} else {
				throw new NoDataFoundException(ERR_MSG_NO_DATA_FOUND);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			secureInputStream.close();
		}
		LOGGER.info("Left crmsUnsecureFile method");
		return null;
	}

}
