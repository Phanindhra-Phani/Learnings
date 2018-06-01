package com.exercise.Hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.exercise.Hibernate.Basics.Entity.Address;
import com.exercise.Hibernate.Basics.Entity.UserDetails;

/**
 * Hello world!
 *
 */
public class HibernateNative 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Hibernate!" );
        
        UserDetails userDetails = new UserDetails();
//        userDetails.setUserId(1L);
        userDetails.setUserName("Sravan Kumar Pala");
        userDetails.setCreatedDate(new Date());
        
        Address temporaryAddress = new Address();
        temporaryAddress.setStreet("Babusapalya");
        temporaryAddress.setCity("Bangalore");
        temporaryAddress.setState("Karnataka");
        temporaryAddress.setZipCode(560043);
        
        Set<Address> addressList = new HashSet<Address>();
        addressList.add(temporaryAddress);
//        userDetails.setTemporaryAddress(temporaryAddress);
        userDetails.setAddressList(addressList);
        
        SessionFactory sessionFactory = new Configuration().configure("./hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(userDetails);
        
        session.getTransaction().commit();
        
        session.close();
        
//        session = sessionFactory.openSession();
//        Query query = session.createQuery("from UserDetails");
//        List<Object> object = query.list();
//        System.out.println(object.size());
//        session.close();
        
    }
}
