package com.loan.houseloan.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.loan.houseloan.admin.UserSignIn;

public class NewUserDetailsInsertion {
	public void dbConnect(String name, int age, String address, String phnNum, String password) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/houseloan", "root", "root");
			PreparedStatement pstmt = con.prepareStatement("insert into applicantTable values(?,?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, address);
			pstmt.setString(4, phnNum);
			pstmt.setString(5, password);
			
			int i = pstmt.executeUpdate();
			System.out.println(i + " records inserted");

			System.out.println("New user Created...!");
			System.out.println("Your userID is "+phnNum);
			System.out.println("You can now login to the system using your userID(Phone Number)");
			new UserSignIn().getUserLoginDetails();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
