/** Copyright @2022, key Bank Financial Service pvt ltd. all rights are reserved, It is confidential. 
     You should not disclose the information outside, otherwise terms and conditions will apply. 

	@author09-Apr-2022
 * 
 */

package com.payments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.payments.model.PaymentRequest;
import com.payments.model.PaymentsResponse;
import com.payments.service.PaymentService;
import com.payments.validator.PaymentRequestValidator;

/**
 * @author Tumukunta
 *
 */
@RestController
@RequestMapping("/v1")
public class PaymentsController {
	
	@Autowired
	PaymentRequestValidator paymentRequestValidator;
	
	@Autowired
	PaymentService paymentService;
	
	//@PostMapping("/payment")
	@ResponseBody
	@RequestMapping(value = "/payments",method = RequestMethod.POST,produces = "application/json", consumes = "application/json")
	public PaymentsResponse doPayments(@RequestBody PaymentRequest paymentRequest,
									@Validated @RequestHeader("client_id")String clientId,
									@Validated @RequestHeader("correlation_id")String requestId,
									@Validated @RequestHeader("msgTs")String msgTs) {
		//validate and prepare request for the service, call the service ad get response
		paymentRequestValidator.validateRequest(paymentRequest);
		//prepare response and send it to consumer/client
		
		PaymentsResponse response=paymentService.doPayments(paymentRequest);
		return null; 
	}
	
	@ResponseBody
	@RequestMapping(value = "/upload",method = RequestMethod.POST,produces = "application/json", consumes = "application/json")
	public PaymentsResponse payments(@RequestParam("file") MultipartFile file) {
		
		return null; 
	}
	
	@ResponseBody
	@RequestMapping(value = "/payment/{mobileNumber}/(paymentDate}",method = RequestMethod.GET,produces = "application/json")
	public String payments(@PathVariable("mobileNumber") String mobileNumber,
									  @PathVariable("paymentDate")String paymentDate) {
		String status=null;
		
		return status; 
	}
}
