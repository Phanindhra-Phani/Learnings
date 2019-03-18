package org.spring.restexamples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RestExampleDao {

	
//	private HibernateTemplate hibernateTemplate;
//	
//	@Autowired
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addUser(UserEntity user) {
		
		System.out.println("user entity is*******"+ user);
//		hibernateTemplate.save(user);
		
		Session session = sessionFactory.openSession();
		session.save(user);
		session.close();
		
		
	}
	
	

}
