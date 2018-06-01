package com.apple.ist.mfi.service.audit.process;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.apple.ist.mfi.client.integration.external.mfirules.MFiCertDetails;
import com.apple.ist.mfi.integration.external.mfirules.MFiRuleExecutor;
import com.apple.ist.mfi.service.common.MfiConstants;

public class MultithreadingTest {
	
	public static void main(String[] args) {
		

        List<Long> ppIdList = new ArrayList<Long>();
        ppIdList.add(245925L);
        ppIdList.add(245923L);
        ppIdList.add(245921L);
        ppIdList.add(245918L);
        ppIdList.add(245916L);
        ppIdList.add(245913L);
        ppIdList.add(245908L);
        
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (Long ppId : ppIdList) {
//        		System.out.println("In for Loop first step");
//			MultithreadingCallable callable = new MultithreadingCallable(ppId);
//			try {
//				Future<Boolean> result = executorService.execute(command);
//				System.out.println("Result Value is******"+result.get() +" ****** for PPID:::::::"+ppId);
//			} catch (InterruptedException | ExecutionException e) {
//				System.out.println("Error while doing for PPID:::::::::"+ppId);
//				e.printStackTrace();
//			}
//		}
        
//        for (Long ppId : ppIdList) {
//        		System.out.println("First step in for loop");
//        		AuditQueueImpl.processAudit(ppId);
//		}
        
        final ExecutorService executorService = Executors.newFixedThreadPool(5);
//        
//        for (Long ppId : ppIdList) {
////			executorService.execute(() -> {
////				System.out.println("printin");
////				executorService.submit( () -> {
////					try {
////						Thread.sleep(1000);
////					} catch (InterruptedException e) {
////						// TODO Auto-generated catch block
////						e.printStackTrace();
////					}
////					System.out.println("data");});
////				
////			});
//        	
        	executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					executorService.submit(new Callable<Boolean>() {

						@Override
						public Boolean call() throws Exception {
							try {
								MFiRuleExecutor<MFiCertDetails[]> mfiRuleExecutorCertDetails = new MFiRuleExecutor<MFiCertDetails[]>(MFiCertDetails[].class);
								List<MFiCertDetails> selectedLabsList = Arrays.asList(mfiRuleExecutorCertDetails.certRule(245916L, "MFi", MfiConstants.INTEGER_0));
								System.out.println("Lab list::::"+selectedLabsList.toString());
								return (null!=selectedLabsList && selectedLabsList.size()>0)? Boolean.TRUE: Boolean.FALSE;
							} catch(Exception ex) {
				        			ex.printStackTrace();
							}
							return Boolean.FALSE;
						}
					});
					
				}
			});
		}

	}	
	
}
