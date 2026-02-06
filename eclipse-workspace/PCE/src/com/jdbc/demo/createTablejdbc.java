package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createTablejdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successful");
		
		//Establishing The Connection
		//String url = oracle:jdbc:@localhost:1521:xe(expressEdition);  //for oracle connection
		String url = "jdbc:mysql://localhost:3306/CollegeJDBC";
		String user = "root";
		String pass = "sql225@Ash";
		String sql = "create table phone(id int primary key,brand varchar(20), price int )";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection established successfully");
		
		// create statement
		Statement st = con.createStatement();
		
		int i = st.executeUpdate(sql);
		System.out.println(i+ " rows affected");
		con.close();
		st.close();
	}

}
