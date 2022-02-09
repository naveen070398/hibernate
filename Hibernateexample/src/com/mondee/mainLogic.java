package com.mondee;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class mainLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student naveen=new Student();
		naveen.setSid(1998);
		naveen.setSmarks(976);
		naveen.setSname("Naveenvarma");

		se.save(naveen);
		tx.commit();
		se.close();


	}

}
