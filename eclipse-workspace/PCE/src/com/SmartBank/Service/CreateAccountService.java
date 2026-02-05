package com.SmartBank.Service;
import java.security.SecureRandom;
import java.util.Scanner;

import com.SmartBank.Model.UserAccount;
public class CreateAccountService {
	public UserAccount createAcc(Scanner sc) {
		System.out.println("Create Bank Account!!!");
		sc.nextLine();
		
		System.out.print("Enter Bank Name:");
		String bank = sc.nextLine();
		
		System.out.print("\nUser Name: ");
		String userName = sc.nextLine();
		
		System.out.print("\nUser Bank Branch Name: ");
		String accBranch = sc.nextLine();
		
		System.out.print("\nEnter the amount you want to deposit:");
		double amount = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Assigned User Account ID. ");
		
		int accountId  = new SecureRandom().nextInt(900000)+100000;
		return new UserAccount(userName, bank, accBranch, amount, accountId);
	}
}
