package com.mondee;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
public class Main {
public static void main(String[] args) {
		// TODO Auto-generated method stub
       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = me.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		Person p=new Person();
		p.setPersonId(201);
		p.setPersonName("naveen");
	
		Voter v=new Voter();
		v.setVoterId(101);
		v.setVoterName("naveenkumar");
		
		p.setVoter(v);
		v.setPerson(p);
		
		
		se.save(p);
		se.save(v);
		tx.commit();
		se.close();
		}
}