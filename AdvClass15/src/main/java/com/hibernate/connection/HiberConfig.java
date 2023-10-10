package com.hibernate.connection;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.hibernate.model.Person;



public class HiberConfig {

	public static SessionFactory getSessionFactory() {
		Configuration configuration=new Configuration();
		Properties properties=new Properties();
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hiberdb");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "root");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.SHOW_SQL, true);
		//properties.put(Environment.FORMAT_SQL, true);
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Person.class);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		return sessionFactory;
	}
	
	
}
