package com.karwisoft.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.springframework.transaction.annotation.Transactional;

import com.karwisoft.dao.*;
import com.karwisoft.models.Preselection;




public class PreselectionImp implements PreselectionDAO {
	
	
	 private SessionFactory sessionFactory;
	
	public SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Preselection a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(Preselection a) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(a);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Preselection a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(a);
		tx.commit();
		session.close();
		
	}

	@Transactional(readOnly = true)
	public Preselection findById(int id_Preselection) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Preselection Preselection  = (Preselection) session.load(Preselection.class, id_Preselection)  ;
		tx.commit();
		session.close();
		return Preselection;
		
	
	}

	@Transactional(readOnly = true)
	public List<Preselection> findByAll() {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Preselection> listPreselections = session.createQuery("from Preselection").list();
		tx.commit();
		session.close();
		return listPreselections;
	}
	
	 
}
