/*
 * Copyright (c) 2013-2015 Apple Inc. All rights reserved.
 */

package com.apple.ist.mfi.service.audit.process;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

import org.apache.log4j.Logger;

import com.apple.ist.mfi.client.integration.external.mfirules.MFiCertDetails;
import com.apple.ist.mfi.integration.external.mfirules.MFiRuleExecutor;
import com.apple.ist.mfi.service.audit.helper.MfiAuditLicensee;
import com.apple.ist.mfi.service.audit.helper.MfiAuditProductPlan;
import com.apple.ist.mfi.service.audit.helper.MfiAvnetAuthorizationQueue;
import com.apple.ist.mfi.service.common.MfiConstants;

public class AuditQueueExecutor implements Callable<Boolean> {
	
	private static final Logger LOGGER = Logger.getLogger(AuditQueueExecutor.class.getName());
	
	private MFiRuleExecutor<MFiCertDetails[]> mfiRuleExecutorCertDetails;
	
	@Override
	public Boolean call() throws Exception {
		
		LOGGER.info("Entered AuditQueueExecutor class call method");
		System.out.println("Entered AuditQueueExecutor class call method");
		boolean isProcessed  = false;
		Object auditObj= AuditQueueImpl.getFromQueue();
		
		if(auditObj instanceof MfiAuditProductPlan){
			isProcessed =  new AuditProcessHelper().processAuditForPP((MfiAuditProductPlan)auditObj);
		}else if (auditObj instanceof MfiAuditLicensee ) {
			isProcessed =  new AuditLicenseeProcessHelper().processAuditForLicensee((MfiAuditLicensee)auditObj);
		}else if (auditObj instanceof MfiAvnetAuthorizationQueue) {
			isProcessed = new MfiAvnetAuthorizationHelper().processSendingFeed((MfiAvnetAuthorizationQueue)auditObj);
		} else if (auditObj instanceof Long) {
			
			try {
        			mfiRuleExecutorCertDetails = new MFiRuleExecutor<MFiCertDetails[]>(MFiCertDetails[].class);
	        } catch(Exception ex) {
	        		ex.printStackTrace();
	        }
			
			List<MFiCertDetails> selectedLabsList = Arrays.asList(mfiRuleExecutorCertDetails.certRule((Long) auditObj, "MFi", MfiConstants.INTEGER_0));
			System.out.println("Before sleep"+selectedLabsList.toString() +": with PPid******"+auditObj.toString());
//			Thread.sleep(1000);
			System.out.println("Lab list::::"+selectedLabsList.toString());
			return (null!=selectedLabsList && selectedLabsList.size()>0)? Boolean.TRUE: Boolean.FALSE;
		}
		
		LOGGER.info("Left AuditQueueExecutor class call method : processed :" + isProcessed);
		
		return isProcessed;
	}
}
