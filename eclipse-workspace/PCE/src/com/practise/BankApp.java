package com.practise;

import java.util.Scanner;

class Bank1 implements BankApp1{
	int userAcc, userPass;
	public void acceptInfo(int userAcc, int userPass) {
		this.userAcc = userAcc;
		this.userPass = userPass;
		
	}
	public void verify() {
		if((accNo == userAcc) && (pass == userPass)) {
			System.out.println("Login Successfull");
		}else {
			InvalidPinException e = new InvalidPinException();
			System.out.println( e.getMessage());
		}
	}
}
public class BankApp {

	public static void main(String[] args) {
		Bank1 atm = new Bank1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user account: ");
		int userAcc = sc.nextInt();
		System.out.println("Enter user password: ");
		int userPass = sc.nextInt();
		sc.close();
		
		
		atm.acceptInfo(userAcc,userPass);
		atm.verify();
	}

}

class InvalidPinException extends Exception{
	public  String getMessage() {
		return "Wrong Credentials";
	}
}
