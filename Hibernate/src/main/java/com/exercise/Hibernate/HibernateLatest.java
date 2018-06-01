package com.exercise.Hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.exercise.Hibernate.OneToMany.Entity.User;
import com.exercise.Hibernate.OneToMany.Entity.Vehicle;

public class HibernateLatest {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("./hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		User user = new User();
		user.setUserName("Sravan Kumar Pala");
		
		Vehicle vehicleCar = new Vehicle();
		vehicleCar.setVehicleType("Car");
		
		Vehicle vehicleBike = new Vehicle();
		vehicleBike.setVehicleType("Bike");
		
		Set<Vehicle> vehicleSet = new HashSet<Vehicle>();
		vehicleSet.add(vehicleCar);
		vehicleSet.add(vehicleBike);
		
		user.setVehicle(vehicleSet);
		
		vehicleCar.setUserDetails(user);
		vehicleBike.setUserDetails(user);
		
		session.save(user);
		session.save(vehicleCar);
		session.save(vehicleBike);
		session.getTransaction().commit();
		
		session.close();
		
	}

//	public static void mainOneToOne(String[] args) {
//		
//		SessionFactory sessionFactory = new Configuration().configure("./hibernate.cfg.xml").buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		
//		User user = new User();
//		user.setUserName("Sravan Kumar Pala");
//		
//		Vehicle vehicle = new Vehicle();
//		vehicle.setVehicleType("Car");
//		
//		user.setVehicle(vehicle);
//		
//		session.save(user);
//		session.save(vehicle);
//		session.getTransaction().commit();
//		
//		session.close();
//		
//	}

}
