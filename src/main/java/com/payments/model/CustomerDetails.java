/** Copyright @2022, key Bank Financial Service pvt ltd. all rights are reserved, It is confidential. 
     You should not disclose the information outside, otherwise terms and conditions will apply. 

	@author09-Apr-2022
 * 
 */

package com.payments.model;

import lombok.Data;

/**
 * @author Tumukunta
 *
 */
@Data
public class CustomerDetails {
	
	private String customerNaame;
	private String cardNumber;
	private String cvvNumber;
	private String expDate;
	private String mobileNumber;
	private String billDate;
	private String amount;

}
