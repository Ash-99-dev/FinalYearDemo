package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionCodeJdbcAndOracle {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Loading The Driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver Loaded Successful");
				
				//Establishing The Connection
				String url = "jdbc:oracle:thin:@//localhost:1521/orclpdb";  //for oracle connection
				String user = "system";
				String pass = "sql225@Ash";
				String sql = "create table student(id int, name VARCHAR2(50),gender VARCHAR2(10))";
				
				Connection con = DriverManager.getConnection(url, user, pass);
				System.out.println("Connection established successfully");
				
				// statement
				Statement st = con.createStatement();
				int a = st.executeUpdate(sql);
				System.out.println(a+ " rows affected");
				con.close();
				st.close();
	}

}
