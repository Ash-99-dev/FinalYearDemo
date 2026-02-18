package com.pceProject.AshmitHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.studentInfo;

public class App {

	public static void main(String[] args) {
		// Loading Configuration
		Configuration cg = new Configuration();
		cg.configure("hibernate.cfg.xml");
		System.out.println("Configuration successful");
		
		// Create session Factory
		SessionFactory sf = cg.buildSessionFactory();
		
		// Open Session Factory
		Session s = sf.openSession();
		
		// Begin Transaction
		Transaction t = s.beginTransaction();
		
		// Store data in student object
		studentInfo st = new studentInfo(1, "Ashmit", 21,"ashmit@gmail.com",100,"+91 2222222");
		
		// perform operation
		s.persist(st);
		t.commit();
		System.out.println("Data Inserted Successfully");
		
		s.close();
		sf.close();
		
	}

}
