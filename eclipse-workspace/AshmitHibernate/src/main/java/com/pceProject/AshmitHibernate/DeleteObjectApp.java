package com.pceProject.AshmitHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.studentInfo;

public class DeleteObjectApp {

	public static void main(String[] args) {

		// Configure the Hibernate
		Configuration cf = new Configuration();
		cf.configure("Hibernate.cfg.xml");
		
		//Build Session Factory
	   SessionFactory sf=cf.buildSessionFactory();
	   
	    //Open Session
	   Session s = sf.openSession();
	
	  Transaction t= s.beginTransaction();
	  
	  studentInfo s1 =s.get(studentInfo.class, 3);
	  if(s1!=null) {
		  
		  s.remove(s1);
           System.out.println("Data Deleted Successfully"); 

             
           
	  }else {
		  System.out.println("No Data found");
	  }
	
	t.commit();
	s.clear();
	sf.close();
	}

}