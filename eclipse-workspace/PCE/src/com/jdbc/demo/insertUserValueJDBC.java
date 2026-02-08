package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertUserValueJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successful");
		
		String url = "jdbc:mysql://localhost:3306/CollegeJDBC";
		String user = "root";
		String pass = "sql225@Ash";
		String sql = "insert into phone values(? , ? , ?);";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection established successfully");
		
		// create statement
		PreparedStatement pst = con.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone id: ");
		int id = sc.nextInt();
		System.out.println("Enter phone brand: ");
		String brand = sc.next();
		System.out.println("Enter phone price: ");
		int price = sc.nextInt();
		
		pst.setInt(1, id);
		pst.setString(2, brand);
		pst.setInt(3, price);
		
		pst.executeUpdate();
		System.out.println("Data inserted successfully");
		
		pst.close();
		sc.close();
		con.close();
		System.out.println("Connection closed");
	}

}
