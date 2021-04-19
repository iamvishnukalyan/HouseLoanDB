package com.loan.houseloan.admin;

import java.util.Scanner;

public class SignInModule extends UserSignIn {

	public void Selection() {
		System.out.println("=========================");
		System.out.println("Enter your option");
		System.out.println("1. Sign IN");
		System.out.println("2. Forgot Password");
		System.out.println("=========================");
		
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		if (userChoice == 1) {
			new UserSignIn().getUserLoginDetails();
		} else if (userChoice == 2) {
			new ForgotPassword().getUserLoginDetails();
		}
		sc.close();
	}
}
