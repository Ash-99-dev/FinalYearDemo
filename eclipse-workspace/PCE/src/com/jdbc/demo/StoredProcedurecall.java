package com.jdbc.demo;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StoredProcedurecall {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/bankdb";
		String user = "root";
		String Pass = "sql225@Ash";
		
		Connection con = null;
		CallableStatement cs= null;
		ResultSet rs = null;
		Scanner sc = new Scanner (System.in);
		// get data name of fn
		String query = "call getData (?)";

		
		try {
		//Loading... the driver class of MYSQL
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establishing the connection
		con=DriverManager.getConnection(url, user, Pass);
		
		cs = con.prepareCall(query);//procedure calling 
		
		System.out.println("Enter your account number ");
		int acc = sc.nextInt();
		cs.setInt(1, acc);
		
		boolean result = cs.execute();
		
		if (result) {
			rs = cs.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(3));
			}
		}else {
			System.out.println("Not Found !");
		}
		}catch(Exception e) {
		e.printStackTrace();
			
		}finally {
			try {
				con.close();
				sc.close();
				rs.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}