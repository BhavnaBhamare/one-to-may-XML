package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Department;
import com.pojo.Student;

public class BLManager {

	SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public void saveDepart(Department d) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(d);
		t.commit();
		s.close();
	}
	
	public List<Department> serachlist()
	{
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Department.class);
		List<Department> dl=cr.list();
		return dl;
	}

	public Department searchby(String dname) {
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Department.class);
		cr.add(Restrictions.eq("dname", dname));
		Department d=(Department)cr.uniqueResult();
		return d;

	}

	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		Session se=sf.openSession();
		Transaction t=se.beginTransaction();
		se.save(s);
		t.commit();
		se.close();
	}

}
