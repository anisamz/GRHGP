package com.karwisoft.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.springframework.transaction.annotation.Transactional;

import com.karwisoft.dao.*;
import com.karwisoft.models.Depense;




public class DepenseImp implements DepenseDAO {
	
	
	 private SessionFactory sessionFactory;
	
	public SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Depense a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(Depense a) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(a);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Depense a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(a);
		tx.commit();
		session.close();
		
	}

	@Transactional(readOnly = true)
	public Depense findById(int id_Depense) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Depense Depense  = (Depense) session.load(Depense.class, id_Depense)  ;
		tx.commit();
		session.close();
		return Depense;
		
	
	}

	@Transactional(readOnly = true)
	public List<Depense> findByAll() {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Depense> listDepenses = session.createQuery("from Depense").list();
		tx.commit();
		session.close();
		return listDepenses;
	}
	
	 
}
