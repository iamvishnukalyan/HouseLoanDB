package com.loan.houseloan.model;

import java.util.Scanner;

import com.loan.houseloan.doa.NewUserDetailsInsertion;

public class NewUserDetails extends NewUserDetailsInsertion{
	public String name;
	public int age;
	public String address;
	public String phnNum;
	private String password; 
	Scanner scn = new Scanner(System.in);

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhnNum() {
		return phnNum;
	}
	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}
	
	public void EnterDetails(){
		System.out.println("Enter you name: ");
		name = scn.next();
		
		System.out.println("Enter your age: ");
		age = scn.nextInt();
		
		System.out.println("Enter your address: ");
		address = scn.next();
		
		System.out.println("Enter your phone number: ");
		phnNum = scn.next();
		
		System.out.println("Enter your password: ");
		password = scn.next();
		
		dbConnect(name, age, address, phnNum, password);
	}
	
}
