package com.karwisoft.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.springframework.transaction.annotation.Transactional;

import com.karwisoft.dao.*;
import com.karwisoft.models.SelFinal;




public class SelFinalImp implements SelFinalDAO {
	
	
	 private SessionFactory sessionFactory;
	
	public SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(SelFinal a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(SelFinal a) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(a);
		tx.commit();
		session.close();
	}

	@Override
	public void update(SelFinal a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(a);
		tx.commit();
		session.close();
		
	}

	@Transactional(readOnly = true)
	public SelFinal findById(int id_SelFinal) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		SelFinal SelFinal  = (SelFinal) session.load(SelFinal.class, id_SelFinal)  ;
		tx.commit();
		session.close();
		return SelFinal;
		
	
	}

	@Transactional(readOnly = true)
	public List<SelFinal> findByAll() {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<SelFinal> listSelFinals = session.createQuery("from SelFinal").list();
		tx.commit();
		session.close();
		return listSelFinals;
	}
	
	 
}
