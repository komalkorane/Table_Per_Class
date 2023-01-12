package com.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Person p = new Person();
		p.setAge(25);
		
		Student s = new Student();
		s.setGender("Female");
		
		Teacher t = new Teacher();
		t.setSalary(250000);
		
		Clerk c = new Clerk();
		c.setName("Shree");
		
		session.persist(p);
		session.persist(s);
		session.persist(t);
		session.persist(c);
		
		tx.commit();

		session.close();
		
	}
	
	
}
