package com.loan.houseloan.view;

//import java.io.IOException;
import java.util.*;
import com.loan.houseloan.controller.UserValidation;
import com.loan.houseloan.doa.dbConnection;
import com.loan.houseloan.model.occupation;
import com.loan.houseloan.model.someMethods;

public class HouseLoanApplication extends UserValidation implements someMethods {

	public static int creditScore;
	private int age, distance;
	public int occupationValue, customerStatus, repayTime, yoe;
	public String phnNum = null, occupationIs = null, customerIs = null;
	double amount;

	public String userId;
	private String password;

	public void age() {
		UserValidation usr = new UserValidation();
		usr.ageValidation(age);
	}

	public void CreditHistory() {
		UserValidation usr = new UserValidation();
		usr.creditHistoryValidation(creditScore);
	}

	public String getUserId() {
		return userId;
	}

	public String getPhnNum() {
		return phnNum;
	}

	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void mainMethod() {
		new HouseLoanApplication();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("________________________");
		System.out.println("Enter your mobile number: ");
		phnNum = sc.next();
		sc.nextLine();
		System.out.println("Your mobile number is "+phnNum);

		System.out.println("________________________");
		System.out.println("Enter your age:");
		age = sc.nextInt();
		System.out.println("Your age is " + age);

		System.out.println("________________________");
		System.out.println("Enter your credit score:");
		creditScore = sc.nextInt();
		System.out.println("Your credit score is " + creditScore);
		System.out.println("________________________");

//		distanceFromBank ds = new distanceFromBank(); // checked Exception
//		try {
//			ds.bankDistanceExp();
//		} catch (IOException e) {
//			
//		}
//		ds.distancefromBank();
		
		System.out.println("________________________");
		System.out.println("Enter the distance of your house from bank:");
		distance  = sc.nextInt();
		System.out.println("Entered distance in kms is "+distance);

		System.out.println("________________________");
		System.out.println("Are you a governament employee? If yes type 1 or 0");
		occupationValue = sc.nextInt();
		if (occupationValue == 1) {
//			occupationIs = "one1";
			System.out.println("You are a governament employee");
			System.out.println("________________________");
		} else if (occupationValue == 0) {
//			occupationIs = "private";
			System.out.println("You are not a governament employee");
			System.out.println("________________________");
		} else {
			occupation occExp = new occupation();
			occExp.trying();
		}

		System.out.println("Are you our old customer? if yes type 1 or 0");
		customerStatus = sc.nextInt();
		if (customerStatus == 1) {
//			customerIs = "Old";
			System.out.println("You are our old customer");
			System.out.println("________________________");
		} else if (occupationValue == 0) {
//			customerIs = "New";
			System.out.println("You are a new user");
			System.out.println("________________________");
		} 
		
		System.out.println("In how many years are you planning to repay the loan?");
		repayTime = sc.nextInt();
		System.out.println("You are planning to payback within " + repayTime + " years");
		System.out.println("________________________");

		System.out.println("How many years have you been working in the same company?");
		yoe = sc.nextInt();
		System.out.println("You are working " + yoe + " years in the same comapny");
		System.out.println("________________________");

		System.out.println("Enter the amount:");
		amount = sc.nextDouble();
		System.out.println("You need " + amount);
		
		new dbConnection().dbConnectInsertDetails(phnNum, age, creditScore, distance, occupationValue, customerStatus, repayTime, yoe, amount);

		System.out.println("*******************");
		System.out.println("All the questions have been answered...");

		UserValidation usrVal = new UserValidation();
		usrVal.creditHistoryValidation(creditScore);
		usrVal.ageValidation(age);
		usrVal.distanceValidation(distance);
		usrVal.occupationValidation(occupationValue);
		usrVal.relationshipWithBank(customerStatus);
		usrVal.repaymentMethod(repayTime);
		usrVal.workExperienceValidation(yoe, amount);

		sc.close();
	}
}
