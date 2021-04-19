//package com.loan.houseloan.model;
//
//import java.io.IOException;
//import java.util.Scanner;
//import com.loan.houseloan.controller.UserValidation;
//
//public class distanceFromBank {
//	// 50kms or city limits
//	Scanner sc = new Scanner(System.in);
//	
//	private int distance;
//	
//	public int getDistance() {
//		return distance;
//	}
//
//	public void setDistance(int distance) {
//		this.distance = distance;
//	}
//	
//	//checked Exception	
//	public void bankDistanceExp() throws IOException{
//		throw new IOException("Device Eror");
//	}
//	
//	void ExpHandl() {
//		try {
//			bankDistanceExp();
//		}catch(Exception e) {
//			System.out.println("Checked exception Raised(IOException)");
//			System.out.println("Exception Handled");
//		}
//	}
//
//	public int distancefromBank() {
//		
//		distanceFromBank obj=new distanceFromBank();  
//		obj.ExpHandl();
//				
//		System.out.println("________________________");
//		System.out.println("Enter the distance of your house from bank:");
//		distance  = sc.nextInt();
//		System.out.println("Ëntered distance in kms is "+distance);
//						
//		UserValidation usr = new UserValidation();
//		usr.distanceValidation(distance);
//		
//		return distance;
//	}
//}
