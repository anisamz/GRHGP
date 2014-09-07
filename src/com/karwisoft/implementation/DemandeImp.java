package com.karwisoft.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.springframework.transaction.annotation.Transactional;

import com.karwisoft.dao.*;
import com.karwisoft.models.Demande;




public class DemandeImp implements DemandeDAO {
	
	
	 private SessionFactory sessionFactory;
	
	public SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Demande a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(Demande a) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(a);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Demande a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(a);
		tx.commit();
		session.close();
		
	}

	@Transactional(readOnly = true)
	public Demande findById(int id_Demande) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Demande Demande  = (Demande) session.load(Demande.class, id_Demande)  ;
		tx.commit();
		session.close();
		return Demande;
		
	
	}

	@Transactional(readOnly = true)
	public List<Demande> findByAll() {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Demande> listDemandes = session.createQuery("from Demande").list();
		tx.commit();
		session.close();
		return listDemandes;
	}
	
	 
}
