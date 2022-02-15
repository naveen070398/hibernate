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

public class MainLogic {

	public static void main(String[] args) {
		
		Session se=Hibernate.getSessionFactory().openSession();
		Transaction tx=se.beginTransaction();

		
		
		
	Student naveen =new Student();
		naveen.setSid(203);
		naveen.setSname("bhavana ");
		naveen.setMarks(988);
		
		se.save(naveen);
		tx.commit();
		se.close();
	}

}
