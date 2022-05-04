/** Copyright @2022, key Bank Financial Service pvt ltd. all rights are reserved, It is confidential. 
     You should not disclose the information outside, otherwise terms and conditions will apply. 

	@author09-Apr-2022
 * 
 */

package com.payments.model;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Tumukunta
 *
 */
public class JsonToJavaObject {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		
		PaymentRequest paymentRequest=mapper.readValue(new File("C:\\Users\\Tumukunta\\Documents\\workspace-spring-tool-suite-4-4.13.1.RELEASE\\Payments-service\\src\\main\\resources\\payment-request.json"), PaymentRequest.class);
		
		System.out.println(paymentRequest);
	}

}
