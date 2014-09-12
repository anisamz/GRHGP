package com.karwisoft.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.springframework.transaction.annotation.Transactional;

import com.karwisoft.dao.*;
import com.karwisoft.models.Candidat;




public class CandidatImp implements CandidatDAO {
	
	
	 private SessionFactory sessionFactory;
	
	public SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Candidat a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(Candidat a) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(a);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Candidat a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(a);
		tx.commit();
		session.close();
		
	}

	@Transactional(readOnly = true)
	public Candidat findById(int id_Candidat) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Candidat Candidat  = (Candidat) session.load(Candidat.class, id_Candidat)  ;
		tx.commit();
		session.close();
		return Candidat;
		
	
	}

	@Transactional(readOnly = true)
	public List<Candidat> findByAll() {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Candidat> listCandidats = session.createQuery("from Candidat").list();
		tx.commit();
		session.close();
		return listCandidats;
	}
	
	 
}
