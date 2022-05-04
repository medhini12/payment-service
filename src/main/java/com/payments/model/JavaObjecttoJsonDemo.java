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

public class JavaObjecttoJsonDemo {
	public static void main(String[] args) throws JsonProcessingException {
		
		PaymentRequest paymentRequest=new PaymentRequest();
		
		List<CustomerDetails> customerDetailsList=new ArrayList<>();
		
		CustomerDetails customerDetails=new CustomerDetails();
		
		customerDetails.setCustomerNaame("Medhini");
		customerDetails.setCardNumber("871234709709");
		customerDetails.setCvvNumber("123");
		customerDetails.setBillDate("12-05-2022");
		customerDetails.setExpDate("12-2025");
		customerDetails.setAmount("10000");
		customerDetails.setMobileNumber("9890989098");

		CustomerDetails customerDetails1=new CustomerDetails();
		
		customerDetails1.setCustomerNaame("Medh");
		customerDetails1.setCardNumber("77712347009");
		customerDetails1.setCvvNumber("323");
		customerDetails1.setBillDate("1-05-2022");
		customerDetails1.setExpDate("12-2025");
		customerDetails1.setAmount("20000");
		customerDetails1.setMobileNumber("8890989098");

		CustomerDetails customerDetails2=new CustomerDetails();
		
		customerDetails2.setCustomerNaame("sp");
		customerDetails2.setCardNumber("671234709709");
		customerDetails2.setCvvNumber("123");
		customerDetails2.setBillDate("11-05-2022");
		customerDetails2.setExpDate("12-2025");
		customerDetails2.setAmount("10700");
		customerDetails2.setMobileNumber("5890989098");
		
		customerDetailsList.add(customerDetails);
		customerDetailsList.add(customerDetails1);
		customerDetailsList.add(customerDetails2);

		paymentRequest.setCustomerDetails(customerDetailsList);
		
		ObjectMapper mapper=new ObjectMapper();
		String response= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(paymentRequest);
		
		System.out.println("response is"+ response);
		
	}

}
