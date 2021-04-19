package com.loan.houseloan.model;

import com.loan.houseloan.controller.UserValidation;

public class occupation extends Exception{
	public int occupationValue;
	
	public int getOccupationValue() {
		return occupationValue;
	}


	public void setOccupationValue(int occupationValue) {
		this.occupationValue = occupationValue;
	}

	public void trying() {
		try {
			throw new MyException("User Defined");
		}catch(MyException ex) {
			System.out.println("Only 0 or 1 must be selected (User-defined Exception raised)");
			System.out.println("User Defined exception Handled");
		}
	}
	
	public occupation() {
		UserValidation usr = new UserValidation();
		usr.occupationValidation(occupationValue);
	}
}
