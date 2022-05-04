package com.payments.client;

import org.springframework.stereotype.Component;

import com.payments.model.FinancialServiceRequest;
import com.payments.model.FinancialServiceResponse;

@Component
public class FinancialServiceImpl implements FinancialService {
	
	public FinancialServiceResponse doPayments(FinancialServiceRequest financialServiceRequest){
		
		//write rest client code to connect with Oraclefianceservice
		return null;
		
	}

}
