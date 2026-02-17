package com.jdbc.demo;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class insertDataStoredProcedure {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/bankdb";
		String user = "root";
		String Pass = "sql225@Ash";
		
		Connection con = null;
		ResultSet rs = null;
		CallableStatement cs = null;
		
		Scanner sc = new Scanner(System.in);
		
		String query = "call input (?,?,?)";
		
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,user,Pass);
		
		cs=con.prepareCall(query);
		
		System.out.println("Please Enter your account number");
		int acc = sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter your Account Holder Name ");
		String name = sc.nextLine();
		System.out.println("Please Enter your Account balance ");
		double bal = sc.nextDouble();
		
		cs.setInt(1, acc);
		cs.setString(2, name);
		cs.setDouble(3, bal);
		
		int n = cs.executeUpdate();
		if(n > 0) {
		System.out.println(n+"Rows are inserted successfully!!!");
			
		}else {
			System.out.println("Procedure causes error !!!");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			sc.close();
			rs.close();
			cs.close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}
	}

}/*
CREATE DEFINER=`root`@`localhost` PROCEDURE `input`(acc int, name varchar(15), bal double)
BEGIN
INSERT INTO bank1(acc_No, accholderName, balance)
    VALUES (acc,name,bal);
END*/