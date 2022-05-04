/**
 * 
 */
package com.payments.service;

import com.payments.model.PaymentRequest;
import com.payments.model.PaymentsResponse;

/**
 * @author Tumukunta
 *
 */
public interface PaymentService {
	
	PaymentsResponse doPayments(PaymentRequest paymentRequest);

}
