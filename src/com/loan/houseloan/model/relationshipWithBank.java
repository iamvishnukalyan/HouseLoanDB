package com.loan.houseloan.model;

import com.loan.houseloan.controller.UserValidation;

public final class relationshipWithBank {
	// new or old customer
	public int customerStatus;
	
	public int getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(int customerStatus) {
		this.customerStatus = customerStatus;
	}

	public relationshipWithBank() {
		UserValidation usr = new UserValidation();
		usr.distanceValidation(customerStatus);
	}
}
