package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.  Loading The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successful");
		
		//2.  Establishing The Connection
		String url = "jdbc:mysql://localhost:3306/CollegeJDBC";
		String user = "root";
		String pass = "sql225@Ash";
		String sql = "Select * from student";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection established successfully");
		
		//3.  create statement
		Statement st = con.createStatement();
		
		//4.  Result set
		ResultSet rst = st.executeQuery(sql);
		while(rst.next()) {
			System.out.println(rst.getInt(1)+"  "+rst.getString(2)+"  "+rst.getString(3)+"  "+rst.getString(4));
		}
		con.close();
		st.close();
		rst.close();
		
	}

}