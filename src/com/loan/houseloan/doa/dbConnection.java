package com.loan.houseloan.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.loan.houseloan.admin.NewUserSignUp;
import com.loan.houseloan.model.LoanStatus;
import com.loan.houseloan.view.HouseLoanApplication;

public class dbConnection {

	String url = "jdbc:mysql://localhost:3306/houseloan";
	String userName = "root";
	String password = "root";
	Scanner scaa = new Scanner(System.in);

	public void dbConnectSignIn(String userid, String Password) {
		String id = null;
		String pwd = null;
		int userChoice;
		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			String url1 = "select applicantPhnNum, applicantPassword from applicantTable where applicantPhnNum=";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(url1 + userid);
			while (rs.next()) {
				id = rs.getString("applicantPhnNum");
				pwd = rs.getString("applicantPassword");
			}

			if (userid.equals(id) && Password.equals(pwd)) {
				System.out.println("User Validation Completed");
				System.out.println("*****************************");
				System.out.println("Enter your choice: ");
				System.out.println("1. Check your loan status");
				System.out.println("2. Apply for a new loan");
				userChoice = scaa.nextInt();
				if (userChoice == 1) {
					new LoanStatus().loanStatus();
				} else if (userChoice == 2) {
					new HouseLoanApplication().mainMethod();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dbConnectForgotPwd(String userid) {
		String id = null;
		String newPassword = null;
		int select = 0;
		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			String url2 = "select applicantPhnNum from applicantTable where applicantPhnNum=";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(url2 + userid);
			while (rs.next()) {
				id = rs.getString("applicantPhnNum");
			}
			System.out.println(id);
			System.out.println(userid);
			if (id.equals(userid)) {
				System.out.println("Enter new password: ");
				try {
					newPassword = scaa.next();
					scaa.nextLine();
				} catch (NoSuchElementException e) {
					e.printStackTrace();
				}

				PreparedStatement pstmt = con
						.prepareStatement("update applicantTable set applicantPassword = ? where applicantPhnNum = ?");
				pstmt.setString(1, newPassword);
				pstmt.setString(2, userid);

				System.out.println("Password Updated...");
			} else {
				System.out.println("seems like you are new user...");
				System.out.println("Sign up before logging in");
				System.out.println("Press 1 to sign up");
				select = scaa.nextInt();
				if (select == 1) {
					new NewUserSignUp().GetDetails();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dbConnectInsertDetails(String phnNum, int age, int creditScore, int distanceFromBank, int occupationValue, int customerStatus,
			int repayTime, int yoe, Double amount) {
		try {
			Connection con = DriverManager.getConnection(url, userName, password);
//			PreparedStatement pstmt = con
//					.prepareStatement("insert into loanTable values(?,?,?,?,?,?,?,?,?)");
//			pstmt.setString(1, phnNum);
//			pstmt.setInt(2, age);
//			pstmt.setInt(3, creditScore);
//			pstmt.setInt(4, distanceFromBank);
//			pstmt.setString(5, occupationValue);
//			pstmt.setString(6, customerStatus);
//			pstmt.setInt(7,repayTime);
//			pstmt.setInt(8,yoe);
//			pstmt.setDouble(9, amount);
			String query="insert into loanTable values("+phnNum+","+age+","+creditScore+","+distanceFromBank+","+occupationValue+","+customerStatus+","+repayTime+","+yoe+","+amount+")";
			Statement stmt=con.createStatement();
			
			int rs=stmt.executeUpdate(query);
			if(rs==1){
				System.out.println("Successfully inserted...!");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
