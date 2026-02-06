package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Loading The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successful");
		
		//Establishing The Connection
		//String url = oracle:jdbc:@localhost:1521:xe(expressEdition);  //for oracle connection
		String url = "jdbc:mysql://localhost:3306/CollegeJDBC";
		String user = "root";
		String pass = "sql225@Ash";
		String sql = "Select * from student";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection established successfully");
		
		// create statement
		Statement st = con.createStatement();
		ResultSet rst = st.executeQuery(sql);
		while(rst.next()) {
			System.out.println(rst.getInt(1)+"  "+rst.getString(2)+"  "+rst.getString(3)+"  "+rst.getString(4));
		}
		con.close();
		st.close();
		rst.close();
		
	}

}