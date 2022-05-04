package com.payments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.payments.builder.PaymentRequestBuilder;
import com.payments.builder.PaymentResponseBuilder;
import com.payments.client.FinancialService;
import com.payments.dao.PaymentDao;
import com.payments.message.publisher.PaymentKafkaPublisher;
import com.payments.model.FinancialServiceRequest;
import com.payments.model.FinancialServiceResponse;
import com.payments.model.PaymentDaoRequest;
import com.payments.model.PaymentDaoResponse;
import com.payments.model.PaymentRequest;
import com.payments.model.PaymentsResponse;

@Component
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	FinancialService financialService;
	
	@Autowired
	PaymentDao paymentDao;
	
	@Autowired
	PaymentKafkaPublisher kafkaPublisher;
	
	@Autowired
	PaymentRequestBuilder paymentRequestBuilder;
	
	@Autowired
	PaymentResponseBuilder paymentResponseBuilder;

	@Override
	public PaymentsResponse doPayments(PaymentRequest paymentRequest) {
		
		PaymentDaoResponse daoResponse=null;
		PaymentsResponse paymentsResponse=null;
		
		//prepare req for financial service,call and get resp
		
		FinancialServiceRequest  financialServiceRequest =paymentRequestBuilder.buildFinancialRequest(paymentRequest);
		FinancialServiceResponse financialServiceResponse=financialService.doPayments(financialServiceRequest);
		 
		//validate the financial resp obj and call Kafka message publisher class and DAO calls
		//prepare request for Kafka and DAO
		
		String message=paymentRequestBuilder.buildKafkaMessageRequest(financialServiceResponse);
		
		PaymentDaoRequest daoRequest=paymentRequestBuilder.buildDaoRequest(financialServiceResponse);
		
		if(financialServiceResponse!=null) {
			//invoke parallel calls and get resp
		kafkaPublisher.paymnetStatus(message);
		daoResponse=paymentDao.paymentStatusUpdate(daoRequest);
			
		}
		
		paymentsResponse=paymentResponseBuilder.buildPaymentResponse(daoResponse,financialServiceResponse);
		
		return paymentsResponse;
	}

}
