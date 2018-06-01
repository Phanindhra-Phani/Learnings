/*
 * Copyright (c) 2013-2015 Apple Inc. All rights reserved.
 */

package com.apple.ist.mfi.service.audit.process;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.apache.log4j.Logger;

public class AuditThreadImpl implements Runnable {

	private static final Logger LOGGER = Logger.getLogger(AuditThreadImpl.class.getName());
	
	AuditQueueExecutor auditQueueExecutor;
	
	public AuditThreadImpl() {
		auditQueueExecutor = new AuditQueueExecutor();
	}
	
	@Override
	public void run() {
		
		LOGGER.info("Entered AuditThreadImpl class run method");

		ExecutorService executorService = AuditQueueImpl.getExecutorService();
		System.out.println("Before Submit");
		Future<Boolean> future = executorService.submit(auditQueueExecutor);
		
		try {
			future.get();
		} catch (InterruptedException interruptedException) {
			LOGGER.error("Thread is interrupted while executing Audit : " +interruptedException.getMessage(), interruptedException );
		} catch (ExecutionException executionException) {
			LOGGER.error("Thread Execution error while executing Audit : " +executionException.getMessage(), executionException );
		}
		
		LOGGER.info("Left AuditThreadImpl class run method");
	}
}
