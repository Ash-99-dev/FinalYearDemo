package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class handleTransaction {

	public static void main(String[] args) {
		 
		    String url="jdbc:mysql://localhost:3306/CollegeJDBC ";
			String user = "root";
			String Pass = "sql225@Ash";
			
			Connection con =null;
			
			String query1 = "update account set balance = balance -? where accountNo=?";
	        String query2 = "update account set balance  = balance +? where accountNo=?";
	        
			PreparedStatement pst1 = null;
		    PreparedStatement pst2 = null;
		    
		    Scanner sc = null;
		 
		 try {
		//Loading... the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 // Establish connection
      con = DriverManager.getConnection(url, user, Pass);
      
      // Prepared statement
      
      con.setAutoCommit(false);
      
      pst1 = con.prepareStatement(query1);
      pst2 = con.prepareStatement(query2);
      
      // Take input
      sc = new Scanner (System.in);
      
      System.out.println("Please enter your Account number ");
      int acc_no = sc.nextInt();
      
      System.out.println("Please enter Receiver Account number ");
      int r_acc = sc.nextInt();
      
      System.out.println("Please enter amount to sent");
      double s_amount = sc.nextDouble();
      
      pst1.setDouble(1, s_amount);
      pst1.setInt(2, acc_no);
      
      pst2.setDouble(1, s_amount);
      pst2.setInt(2, r_acc);
      
      pst1.executeUpdate();
      pst2.executeUpdate();
      
      System.out.println("Money Transfered Successfully!");
      con.commit();
      con.setAutoCommit(true);
      
		} catch (Exception e) {
			try {
				System.out.println("Error occured ");
				con.rollback();
				
			}catch(Exception e2) {
				e.printStackTrace();
			}finally {
		 try{
	      
		 // Close resources
	        con.close();
	        sc.close();
	        
		}catch(Exception e3) {
			e.printStackTrace();
		}  
			}
			System.out.println("Connection Terminated");
		}
	}
}