package com.loan.houseloan.model;

import com.loan.houseloan.controller.UserValidation;

public class workExperience {
	// YOE in same company(3 years preferred)
	public int yoe;
	
	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	public workExperience() {
		UserValidation usr = new UserValidation();
		usr.distanceValidation(yoe);
	}
}
