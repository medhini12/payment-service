/** Copyright @2022, key Bank Financial Service pvt ltd. all rights are reserved, It is confidential. 
     You should not disclose the information outside, otherwise terms and conditions will apply. 

	@author09-Apr-2022
 * 
 */

package com.payments.dao;

import com.payments.model.PaymentDaoRequest;
import com.payments.model.PaymentDaoResponse;

/**
 * @author Tumukunta
 *
 */
public interface PaymentDao {

 public PaymentDaoResponse paymentStatusUpdate(PaymentDaoRequest daoRequest);
}
