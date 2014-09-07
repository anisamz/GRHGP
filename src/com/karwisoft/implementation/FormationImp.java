package com.karwisoft.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.springframework.transaction.annotation.Transactional;

import com.karwisoft.dao.*;
import com.karwisoft.models.Formation;




public class FormationImp implements FormationDAO {
	
	
	 private SessionFactory sessionFactory;
	
	public SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Formation a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(Formation a) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(a);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Formation a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(a);
		tx.commit();
		session.close();
		
	}

	@Transactional(readOnly = true)
	public Formation findById(int id_Formation) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Formation Formation  = (Formation) session.load(Formation.class, id_Formation)  ;
		tx.commit();
		session.close();
		return Formation;
		
	
	}

	@Transactional(readOnly = true)
	public List<Formation> findByAll() {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Formation> listFormations = session.createQuery("from Formation").list();
		tx.commit();
		session.close();
		return listFormations;
	}
	
	 
}
