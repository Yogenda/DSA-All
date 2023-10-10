package com.hibernate.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.connection.HiberConfig;
import com.hibernate.model.Person;

public class PersonOperations {

	SessionFactory sf = null;
	public PersonOperations()
	{
		sf = HiberConfig.getSessionFactory();
	}
	
	public void  AddPerson(Person person)
	{
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(person);
		tr.commit();
	}
	
	public List<Person>  ShowAll()
	{
		Session session = sf.openSession();
		TypedQuery qry =  session.createQuery("from Person");
		List<Person>  pall = qry.getResultList();
		return pall;
	}
	
	public Person CheckLoginDetails(String uname, String pwd)
	{
		Session session = sf.openSession();
		TypedQuery qry =  session.createQuery("from Person");
		List<Person>  pall = qry.getResultList();
		Person person = null;
		
		for(Person p : pall)
		{
			if(p.getEmail().equals(uname) && p.getPwd().equals(pwd))
			{
				person = new Person();
				person = p;
				break;
			}
		}
		return person;
	}
	
	public String ChangePassword(int  pid, String newpwd)
	{
		String chk = "No";
		Session session = sf.openSession();
		TypedQuery qry =  session.createQuery("from Person");
		List<Person>  pall = qry.getResultList();
		Person person = null;
		for(Person p : pall)
		{
			if(p.getPersonid()==pid)
			{
				person = new Person();
				person = p;
				person.setPwd(newpwd);
				Transaction tr = session.beginTransaction();
				session.saveOrUpdate(person);
				tr.commit();
				chk = "Yes";
				break;
			}
		}
		return chk;
	}
}
