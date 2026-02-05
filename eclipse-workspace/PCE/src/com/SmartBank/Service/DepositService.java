package com.SmartBank.Service;

import java.util.Scanner;

import com.SmartBank.Model.UserAccount;

public class DepositService {
public void deposit(UserAccount useracc, Scanner sc) {
		
		System.out.println("Enter the amount to deposit: ");
		double amount = sc.nextDouble();
		
		if(amount > 0) {
			useracc.balance += amount;
			System.out.println("Deposit successful!");
		}else {
			System.out.println("An Exception of less amount");
		}
	}
}
