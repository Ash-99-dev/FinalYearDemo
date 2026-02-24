package com.pceProject.AshmitHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.studentInfo;

public class UpdateObjectApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Configure the Hibernate
				Configuration cf = new Configuration();
				cf.configure("Hibernate.cfg.xml");
				
				//Build Session Factory
			   SessionFactory sf=cf.buildSessionFactory();
			   
			    //Open Session
			   Session s = sf.openSession();
			
			  Transaction t= s.beginTransaction();
			  
			  studentInfo s1 =s.get(studentInfo.class, 4);
			  if(s1!=null) {
				  s1.setName("Tuntun");
		          s1.setEmail("tun@gmail.com");
		           s1.setMarks(85);
		           
		           System.out.println("Data Updated Successfully"+s1);   // s.remove(s1);

		             
		           
			  }else {
				  System.out.println("No Data found");
			  }
			
			t.commit();
			s.clear();
			sf.close();
	}

}