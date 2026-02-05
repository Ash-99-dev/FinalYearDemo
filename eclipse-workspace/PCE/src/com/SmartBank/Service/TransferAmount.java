package com.SmartBank.Service;

import java.util.Scanner;

import com.SmartBank.Model.UserAccount;

class TransferAmount{
	public void transfer(UserAccount accS, UserAccount accR, Scanner sc) {
		System.out.println("Enter amount to transfer: ");
		int amount = sc.nextInt();
		
		if (amount > 0 && accS.balance >= amount) {
			accS.balance -= amount;
			accR.balance += amount;
			System.out.println("Amount : Rs."+amount+" transfered successfully.");
		}else {
			System.out.println("Insufficient amount!!!");
		}
	}
}