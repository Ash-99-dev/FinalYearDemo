package com.pceProject.AshmitHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.studentInfo;

public class ReadObjectApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		//1. configure hibernate .xml file
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		//2. build factor session
		SessionFactory sf = cf.buildSessionFactory();
		// 2.1 open session
		Session ss = sf.openSession();
		
		// 3. Transaction
		Transaction ts = ss.beginTransaction();
		
		//to get the data 
		int i = 1;
		while(i != 0) {
		studentInfo s1 = ss.get(studentInfo.class, i);
		
		
		if(s1 != null) {
			System.out.println(s1);
			i++;
		}else {
			System.out.println("No data found");
			break;
		}
		}
		/*studentInfo s1 = new studentInfo(4, "aniket", 22, "Aniket@gmail.com", 87, "+91 089898000");
		ss.persist(s1);
		
		ts.commit();
		System.out.println("Data inserted successfully");*/
		ss.close();
		sf.close();
		// update , delete 
	}

}
