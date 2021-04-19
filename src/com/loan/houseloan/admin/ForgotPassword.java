package com.loan.houseloan.admin;

import java.util.Scanner;

import com.loan.houseloan.doa.dbConnection;

public class ForgotPassword extends dbConnection{
	public void getUserLoginDetails() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("Enter your userID/Phone Number: ");
		
		String userid = scn.next();
		
		dbConnectForgotPwd(userid);
		scn.nextLine();
		scn.close();
		
	}
}
