package com.Encapsulation;

import java.util.*;

public class BankEncapsulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		System.out.println("Enter the deposit Amount..");
		int bal = sc.nextInt();
		b.setBalance(bal);
		System.out.println("Your current Balance :" +b.getBalance());
		
		System.out.println("Enter Amount to Withdraw ");
		int w =sc.nextInt();
		int up = b.getBalance() - w;
		b.setBalance(up);
		System.out.println("your Current Balance :" +b.getBalance());	
		sc.close();
	}
}
	
class Bank {
		private int balance;
		public void setBalance(int bal) {
			if(bal > 0) {
				balance = bal;
			}
			else {
				System.out.println("Invalid");
			}
		}
		public int getBalance() {
			return balance;
		}
	}