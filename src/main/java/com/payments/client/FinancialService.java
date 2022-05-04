/**
 * 
 */
package com.payments.client;

import com.payments.model.FinancialServiceRequest;
import com.payments.model.FinancialServiceResponse;

/**
 * @author Tumukunta
 *
 */
public interface FinancialService {
	
	public FinancialServiceResponse doPayments(FinancialServiceRequest financialServiceRequest);

}
