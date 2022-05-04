/** Copyright @2022, key Bank Financial Service pvt ltd. all rights are reserved, It is confidential. 
     You should not disclose the information outside, otherwise terms and conditions will apply. 

	@author09-Apr-2022
 * 
 */

package com.payments.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Tumukunta
 *
 */
public class RespJavaObjecttoJson {

	/**
	 * @param args
	 * @throws JsonProcessingException 
	 */
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		PaymentsResponse paymentsResponse=new PaymentsResponse();
		
		List<Paymentstatus>  paymentStatusList=new ArrayList<>();

		Paymentstatus paymentstatus=new Paymentstatus();
		paymentstatus.setMobileNumber("9087908790");
		paymentstatus.setTxnStatus("completed");

		Paymentstatus paymentstatus1=new Paymentstatus();
		paymentstatus1.setMobileNumber("9087908790");
		paymentstatus1.setTxnStatus("completed");
		
		Paymentstatus paymentstatus2=new Paymentstatus();
		paymentstatus2.setMobileNumber("9087908790");
		paymentstatus2.setTxnStatus("completed");
	      
		paymentStatusList.add(paymentstatus);
	    paymentStatusList.add(paymentstatus1);
        paymentStatusList.add(paymentstatus2);
        
        StatusBlock block=new StatusBlock();
        block.setRespcode("0");
        block.setRespMsg("Success");
        paymentsResponse.setStatus(block);
        
        paymentsResponse.setPaymentStatus(paymentStatusList);
        
        ObjectMapper mapper=new ObjectMapper();
        
        String response=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(paymentsResponse);
        
        System.out.println("response is "+response);
	}

}
