package com.coreProject;

import java.security.SecureRandom;
import java.util.Scanner;

class UserAccount{
	int accountId;
	String userName;
	String bankBranch;
	String bank;
	double balance;
	
	UserAccount(String userName,  String bank, String accBranch, double balance,  int accountId){
		this.userName = userName;
		this.accountId = accountId;
		this.bankBranch = accBranch;
		this.balance = balance;
		this.bank = bank;
	}
	
	public String toString() {
		System.out.println("\nNew User Account created with \n");
		return " Name : "+userName +", Account id : "+accountId+
				", Bank : "+bank+
				", Account Branch : "+bankBranch+
				", Initial Balance : "+balance;
	}
}

class CreateAccountService implements CreateAccount{

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

class AmountAdd implements DepositSection{
	
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

class FetchAccBalance implements CheckBalance{
	public double balance(UserAccount useracc) {
		return useracc.balance;
	}
}

class TransferAmount implements TransferSection{
	public void transfer(UserAccount accS, UserAccount accR, Scanner sc) {
		System.out.println("Enter amount to transfer: ");
		int amount = sc.nextInt();
		
		if (amount > 0 && accS.balance > amount) {
			accS.balance -= amount;
			accR.balance += amount;
			System.out.println("Amount : Rs."+amount+" transfered successfully.");
		}else {
			System.out.println("Insufficient amount!!!");
		}
	}
}