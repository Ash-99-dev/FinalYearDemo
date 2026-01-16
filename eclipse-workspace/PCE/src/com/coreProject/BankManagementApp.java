package com.coreProject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class BankManagementApp {

	public static void main(String[] args) {
		String userName = "user";
		int password = 12345;
		
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, UserAccount> accounts = new HashMap<>();
		int attempt = 0;
		boolean isAuthenticated = false;
		
		while(attempt < 3) {
			System.out.println("Enter username : ");
			String enterUserName = sc.next();
			
			System.out.println("Enter password : ");
			int enterPassword = sc.nextInt();
			if(enterUserName.equals(userName)  &&  enterPassword == password) {
				System.out.println("Login Successful!!");
				isAuthenticated = true;
				break;
			}
			else {
				attempt++;
				System.out.println("Incorrect Credentials!!");
				if (attempt < 3) {
			        System.out.println("You have " + (3 - attempt) + " attempt(s) left\n");
			    }
			}
		}
		
		if (!isAuthenticated) {
		    System.out.println("Access denied. Too many failed attempts.");
		    sc.close();
		    return;   
		}
		
		CreateAccount creator = new CreateAccountService();
        
		while(true) {
			System.out.println("\n\tEnter operation to perform\n"+
					"1. Create new Bank Account.\n"+
					"2.Deposit Ammount\n3.To view balance\n"+
					"4.View all users\n5.Transfer Amount\n6. To Exit().");
					int operation = sc.nextInt();
					
		switch(operation) {
		case 1:
			
			UserAccount user = creator.createAcc(sc);
			accounts.put(user.accountId, user);
			System.out.println("Account Created Successfully!");
			
            System.out.println(user+". .");
			break;
			 
		case 2:
			System.out.print("Enter Account ID: ");
            int id = sc.nextInt();

            UserAccount acc = accounts.get(id);
            if (acc != null) {
            	new AmountAdd().deposit(acc, sc);
            } else {
                System.out.println("Account not found!");
            }
            break;
            
		case 3:
			System.out.println("\tFetch Account Balance ");
			System.out.print("Enter Account ID: ");
            int id1 = sc.nextInt();

            UserAccount acc1 = accounts.get(id1);
            if (acc1 != null) {
                System.out.println(new FetchAccBalance().balance(acc1));
            } else {
                System.out.println("Account not found!");
            }
			break;
			
		case 4:
			if (accounts.isEmpty()) {
		        System.out.println("No accounts available.");
		        break;
		    }
			
			String printAccounts = accounts.entrySet().stream()
	    			.map(e -> e.getKey()+" = "+e.getValue())
	    			.collect(Collectors.joining(",\n", "{\n", "\n}"));
			
			System.out.println(printAccounts);
			break;
			
		case 5:
			
			System.out.println("\tTransfer Amount Safely...");
			System.out.print("Enter sender Account ID : ");
            int sendersub = sc.nextInt();
            System.out.print("Enter receiver Account ID : ");
            int receiveradd = sc.nextInt();
			UserAccount accS = accounts.get(sendersub);
			UserAccount accR = accounts.get(receiveradd);
			
			if(accS != null && accR != null) {
				new TransferAmount().transfer(accS, accR, sc);
            } else {
                System.out.println("Account not found!");
            }
			break;
			
		case 6:
			
			System.out.println("Exiting...");
            sc.close();
            return;
		}
	 }
  }
}