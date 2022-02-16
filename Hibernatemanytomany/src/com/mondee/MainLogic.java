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
public class MainLogic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
		Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = me.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();


		Student st = new Student();
		st.setStudentId(101);
		st.setStudentName("Amrutha");
		
		Student st2 = new Student();
		st2.setStudentId(102);
		st2.setStudentName("Aarav");
		
		Student st3 = new Student();
		st3.setStudentId(103);
		st3.setStudentName("Keerthan");
		
		Set students = new HashSet();
		students.add(st);
		students.add(st2);
		students.add(st3);
		
		Course c = new Course();
		c.setCourseId(201);
		c.setCourseName("Java");
		
		Course cs = new Course();
		cs.setCourseId(202);
		cs.setCourseName("React Js");
		
		Set courses = new HashSet();
		courses.add(c);
		courses.add(cs);
		
		st2.setCourses(courses);
		st.setCourses(courses);
		c.setStudents(students);
		cs.setStudents(students);
		
		se.save(c);
		se.save(cs);
		se.save(st);
		tx.commit();
		se.close();
	}


}


