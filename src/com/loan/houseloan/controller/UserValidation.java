package com.loan.houseloan.controller;
public class UserValidation{
	
	public int score = 0;
	public int estimatedAmt;
	
	public int signIn(String userId, String pwd) {
		if(userId.equals("userID") && pwd.equals("password")) {
			return 1;
		}
		return 0;
	}
	
//	public int employeeLogin(String userId, String pwd) {
//		if(userId.equals("userID") && pwd.equals("password")) {
//			return 1;
//		}
//		return 0;
//	}

	public void creditHistoryValidation(int creditScore) {
		if(creditScore>=700 && creditScore<=800) {
			score++;
		}
	}
	
	public void ageValidation(int age) {
		if(age>=30 && age<=50) {
			score++;
		}
	}
	
	public void distanceValidation(int distance) {
		if(distance<=50) {
			score++;
		}
	}
	
	public void occupationValidation(int value) {
		if(value == 1) {
			score++;
		}
	}
	
	public void relationshipWithBank(int customerStatus) {
		if(customerStatus == 1) {
			score++;
		}else {
			System.out.println("Thank you");
		}
	}
	
	public void repaymentMethod(int repayTime) {
		if(repayTime <= 5) {
			score++;
		}
	}
	
	public void workExperienceValidation(int yoe, double amount) {
		if(yoe>=3) {
			score++;
		}
		if(score>=6) {
			System.out.println("Congratulations! Your loan will get approved upon successfull verification of documents");
		}else if (score==5) {
			amount = amount/1.1;
			System.out.println("You loan of "+amount+ "can be approved upon successfull verification of documents");
		}else if(score == 4) {
			amount = amount / 1.25;
			System.out.println("You loan of "+amount+ "can be approved upon successfull verification of documents");
		}else if(score == 3) {
			amount /= 1.5;
			System.out.println("You loan of "+amount+ "can be approved upon successfull verification of documents");
		}else {
			System.out.println("Your loan cannot be approved. Kindly contact the manager");
		}
	}
}
