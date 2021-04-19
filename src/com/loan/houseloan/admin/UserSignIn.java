package com.loan.houseloan.admin;

import java.util.Scanner;
import com.loan.houseloan.doa.dbConnection;

public class UserSignIn {

	public void getUserLoginDetails() {
		Scanner scn = new Scanner(System.in);

		System.out.println("*******************");
		System.out.println("Enter userID/Phone Number:");
		String userId = scn.next();

		System.out.println("Enter Password:");
		String password = scn.next();
				
		new dbConnection().dbConnectSignIn(userId, password);
		scn.nextLine();
		scn.close();

	}

}
