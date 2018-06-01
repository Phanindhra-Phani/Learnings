/*
 * Copyright (c) 2013-2015 Apple Inc. All rights reserved.
 */

package com.apple.ist.mfi.service.audit.process;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.apple.ist.mfi.service.common.MfiConstants;

public final class AuditQueueImpl {
	
	private static ConcurrentLinkedQueue<Object> concurrentLinkedQueue = new ConcurrentLinkedQueue<Object>();
	
	private static ExecutorService executorService = Executors.newFixedThreadPool(MfiConstants.INTEGER_15);
	
	private static void addToQueue(Object auditObj) {
		concurrentLinkedQueue.add(auditObj);
	}

	public static Object getFromQueue() {
		return concurrentLinkedQueue.poll();
	}

	public static synchronized  ExecutorService getExecutorService() {
		return executorService;
	}
	
	public static void processAudit(Object auditObj){
		addToQueue(auditObj);
		System.out.println("Before Execute method");
		executorService.execute(new AuditThreadImpl());
	}

	private AuditQueueImpl() {
		
	}
}
