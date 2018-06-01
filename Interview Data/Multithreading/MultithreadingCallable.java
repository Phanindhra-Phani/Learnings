package com.apple.ist.mfi.service.audit.process;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

import com.apple.ist.mfi.client.integration.external.mfirules.MFiCertDetails;
import com.apple.ist.mfi.integration.external.mfirules.MFiRuleExecutor;
import com.apple.ist.mfi.service.common.MfiConstants;

public class MultithreadingCallable implements Callable<Boolean> {

//	private MFiRuleExecutor<MFiCertDetails[]> mfiRuleExecutorCertDetails = new MFiRuleExecutor<MFiCertDetails[]>(MFiCertDetails[].class);

	private MFiRuleExecutor<MFiCertDetails[]> mfiRuleExecutorCertDetails;
	
	private Long ppId;
	 
    public MultithreadingCallable(Long ppId) {
        this.ppId = ppId;
        
        try {
        		mfiRuleExecutorCertDetails = new MFiRuleExecutor<MFiCertDetails[]>(MFiCertDetails[].class);
        } catch(Exception ex) {
        		ex.printStackTrace();
        }
    }
    
	@Override
	public Boolean call() throws Exception {
			
		List<MFiCertDetails> selectedLabsList = Arrays.asList(mfiRuleExecutorCertDetails.certRule(ppId, "MFi", MfiConstants.INTEGER_0));
		System.out.println("Before sleep"+selectedLabsList.toString());
		Thread.sleep(1000);
		System.out.println("Lab list::::"+selectedLabsList.toString());
		return (null!=selectedLabsList && selectedLabsList.size()>0)? Boolean.TRUE: Boolean.FALSE;
	}

}
