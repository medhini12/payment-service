/** Copyright @2022, key Bank Financial Service pvt ltd. all rights are reserved, It is confidential. 
     You should not disclose the information outside, otherwise terms and conditions will apply. 

	@author09-Apr-2022
 * 
 */

package com.payments.builder;

import org.springframework.stereotype.Component;

import com.payments.model.FinancialServiceRequest;
import com.payments.model.FinancialServiceResponse;
import com.payments.model.PaymentDaoRequest;
import com.payments.model.PaymentRequest;

/**
 * @author Tumukunta
 *
 */
@Component

public class PaymentRequestBuilder {
	public FinancialServiceRequest buildFinancialRequest(PaymentRequest paymentRequest) {
		
		//prepare financial service request wit the help of payment request
		return null;
	}

	public String buildKafkaMessageRequest(FinancialServiceResponse financialServiceResponse) {
		// prepare the message with the help o fianance service
		return null;
	}

	public PaymentDaoRequest buildDaoRequest(FinancialServiceResponse financialServiceResponse) {
		
		return null;
		
		
	}

}
