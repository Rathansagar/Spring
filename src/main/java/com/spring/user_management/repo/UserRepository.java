package com.spring.user_management.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.user_management.component.user;

@Repository
public class UserRepository {
	
	
	@Autowired
	//private user u1;
	private user u2;
	
	public void hbConfig( ) {
		
//		u1.setUserId(103);
//		u1.setUserName("tharun");
//		u1.setUserPhNo(12354557l);
		
		u2.setUserId(102);		
		u2.setUserName("Nithin");
		u2.setUserPhNo(232688814l);
		
	Configuration cfg = new Configuration().configure().addAnnotatedClass(user.class);
	SessionFactory Sf = cfg.buildSessionFactory();
	Session s = Sf.openSession();
	Transaction t = s.beginTransaction();
	//s.save(u1);
	s.save(u2);
	t.commit();
	

	
	}
}
