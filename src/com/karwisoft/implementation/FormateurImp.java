package com.karwisoft.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.springframework.transaction.annotation.Transactional;

import com.karwisoft.dao.*;
import com.karwisoft.models.Formateur;




public class FormateurImp implements FormateurDAO {
	
	
	 private SessionFactory sessionFactory;
	
	public SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Formateur a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(Formateur a) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(a);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Formateur a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(a);
		tx.commit();
		session.close();
		
	}

	@Transactional(readOnly = true)
	public Formateur findById(int id_Formateur) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Formateur Formateur  = (Formateur) session.load(Formateur.class, id_Formateur)  ;
		tx.commit();
		session.close();
		return Formateur;
		
	
	}

	@Transactional(readOnly = true)
	public List<Formateur> findByAll() {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Formateur> listFormateurs = session.createQuery("from Formateur").list();
		tx.commit();
		session.close();
		return listFormateurs;
	}
	
	 
}
