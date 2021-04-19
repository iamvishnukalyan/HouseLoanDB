package com.loan.houseloan.model;

import com.loan.houseloan.controller.UserValidation;

public class repaymentMethod {
	// 5 years preferred
	
	public int repayTime;
	
	public int getRepayTime() {
		return repayTime;
	}

	public void setRepayTime(int repayTime) {
		this.repayTime = repayTime;
	}

	public repaymentMethod(int repayTime) {
		UserValidation usr = new UserValidation();
		usr.distanceValidation(repayTime);
	}
}
