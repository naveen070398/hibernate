package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
public class mainLogic {
public static void main(String[] args) 
{
       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = me.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		Student naveen=new Student();
		naveen.setSid(1999);
		naveen.setSmarks(976);
		naveen.setSname("Bhavana");

		se.save(naveen);
		tx.commit();
		se.close();


	}

}
