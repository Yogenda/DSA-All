package com.emp.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetConnection {
	public static SessionFactory Connection()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
}
