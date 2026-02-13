package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class transactionQuery {
	
public static void main (String [] args) {
	    String url="jdbc:mysql://localhost:3306/CollegeJDBC";
		String user = "root";
		String Pass = "sql225@Ash";
		
		Connection con = null;
		PreparedStatement pst1 = null;
	    PreparedStatement pst2 = null;
	    
	    
	    String query1 = "insert into orderr values (?,?,?)";
	    String query2 = "update product set quantity = quantity -? where product_id = ?";
	    
	    PreparedStatement pst11 = null;
	    PreparedStatement pst22 = null;
	    
	    Scanner sc = null;
	 
	 try {
	//Loading... the driver class
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	 // Establish connection
        con = DriverManager.getConnection(url, user, Pass);
  
        // Prepared statement
  
        con.setAutoCommit(false);
  
        pst11 = con.prepareStatement(query1);
        pst22 = con.prepareStatement(query2);
  
        // Take input
        sc = new Scanner (System.in);
        System.out.println("\n---Place your Order Here---");
        System.out.println("Please enter order id ");
        int order_id = sc.nextInt();
  
        System.out.println("Please enter product id ");
        int product_id = sc.nextInt();
  
        System.out.println("Please enter the quantity");
        int quantity = sc.nextInt();
        
        pst11.setInt(1, order_id);
        pst11.setInt(2, product_id);
        pst11.setInt(3, quantity);
        
        pst22.setInt(1, quantity);
        pst22.setInt(2, product_id);
       
        
        
        pst11.executeUpdate();
        pst22.executeUpdate();
  
  
        con.commit();
        con.setAutoCommit(true);
        
        System.out.println("Order Placed successfully");
  
	} catch (Exception e) {
		try {
			System.out.println("order fail !  ");
			con.rollback();
			
		}catch(Exception e2) {
			
		}finally {
	 try{
      
	 // Close resources
        con.close();
        sc.close();
        
	}catch(Exception e3) {
		e.printStackTrace();
	}  
		}
	
	}
		System.out.println("Connection Terminated");
}
}