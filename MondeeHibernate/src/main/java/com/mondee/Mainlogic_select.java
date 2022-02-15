package com.mondee;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mondee.Hibernate;

public class Mainlogic_select {

	public static void main(String[] args) {
		
		Session se=Hibernate.getSessionFactory().openSession();
		Transaction tx=se.beginTransaction();

		Query qr=se.createQuery("from Student s");
		List li=qr.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			Student x=(Student)i.next();
			System.out.println(x.getSid()+"   "+x.getSname()+"  "+x.getMarks());
		}
		tx.commit();
		se.close();    
	}
}