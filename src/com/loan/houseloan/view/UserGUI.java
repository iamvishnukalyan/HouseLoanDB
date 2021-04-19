package com.loan.houseloan.view;

import java.util.Scanner;
import com.loan.houseloan.admin.NewUserSignUp;
import com.loan.houseloan.admin.SignInModule;

public class UserGUI{
	
	UserGUI(){
		System.out.println("Happy Banking....!");
	}
	{
		System.out.println("*******************");
	}
	
	static {
		System.out.println("Welcome to our Bank");
	}
	
	public static void main(String[] args) {
		//new UserGUI();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------");
		
		System.out.println("Select the option");
		System.out.println("1. Sign in");
		System.out.println("2. Sign Up");
		System.out.println("*******************");
		System.out.println("Enter your choice:");
		int option = sc.nextInt();
		
		if(option==1) {
			System.out.println("Option 1 Selected(Sign in)");
			new SignInModule().Selection();
		}else if(option == 2) {
			System.out.println("Option 2 Selected(Sign Up)");
			NewUserSignUp su = new NewUserSignUp();
			su.GetDetails();
		}
		sc.close();
	}

}
