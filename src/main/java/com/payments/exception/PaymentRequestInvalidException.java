/** Copyright @2022, key Bank Financial Service pvt ltd. all rights are reserved, It is confidential. 
     You should not disclose the information outside, otherwise terms and conditions will apply. 

	@author09-Apr-2022
 * 
 */

package com.payments.exception;

import lombok.Getter;

/**
 * @author Tumukunta
 *
 */
@Getter
public class PaymentRequestInvalidException extends Exception{
	
	private String respCode;
	private String respMsg;

	public PaymentRequestInvalidException(String respCode, String respMsg) {
		
		this.respCode = respCode;
		this.respMsg = respMsg;
	}
	

}
