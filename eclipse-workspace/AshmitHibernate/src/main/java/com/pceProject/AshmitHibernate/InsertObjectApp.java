package com.pceProject.AshmitHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.studentInfo;

public class InsertObjectApp {
    public static void main(String[] args) {
      
    	//Loading the configuration
    	Configuration cg = new Configuration(); 
    	cg.configure("hibernate.cfg.xml");
    	
    	//Create session factory
         SessionFactory sf =cg.buildSessionFactory();
         
        //Open SessionFactory
         Session s = sf.openSession();
         
         //Begin Transaction
         Transaction t =s.beginTransaction();
         
         studentInfo st  = new studentInfo(105,"Akash",21,"Akash@123gmail.com",75,"52462535");
         
         //Perform operation
         s.persist(st);
         t.commit();
         
         s.close();
         sf.close();
         
	
    }

}