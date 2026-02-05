package com.SmartBank.Model;

public class UserAccount{
	public int accountId;
	public String userName;
	public String bankBranch;
	public String bank;
	public double balance;
	
	public UserAccount(String userName,  String bank, String accBranch, double balance,  int accountId){
		this.userName = userName;
		this.accountId = accountId;
		this.bankBranch = accBranch;
		this.balance = balance;
		this.bank = bank;
	}
	
	public String toString() {
		//System.out.println("\nNew User Account created with \n");
		return " Name : "+userName +
				", Account id : "+accountId+
				", Bank : "+bank+
				", Account Branch : "+bankBranch+
				", Initial Balance : "+balance;
	}
}