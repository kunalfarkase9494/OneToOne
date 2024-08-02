package com.ConnectionFactory;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.Model.Answer;
import com.Model.Question;



public class ConnectionFactory {
	
	public static Session s;
	
	public static Session getSession() {
	
	Properties p = new Properties();
	p.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
	p.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
	p.put(Environment.USER, "root");
	p.put(Environment.PASS,"");
	
	p.put(Environment.SHOW_SQL, true);
	p.put(Environment.HBM2DDL_AUTO, "update");
	
	
	Configuration cfg = new Configuration();
	cfg.setProperties(p);
	
	cfg.addAnnotatedClass(Question.class);
	cfg.addAnnotatedClass(Answer.class);
	
	SessionFactory sf = cfg.buildSessionFactory();
	s = sf.openSession();
	return s;
	}
}
