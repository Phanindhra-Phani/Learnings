package com.exercise.ObjectStates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObjectStatesExample {
	
	public static void main(String[] args) {
		
		UserDetails userDetails = new UserDetails();
		userDetails.setUserName("Sravan Kumar");
		
		SessionFactory sessionFactory = new Configuration().configure("./hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(userDetails);
		
		session.getTransaction().commit();
		
		session.close();
		
	}

}
