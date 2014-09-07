package com.karwisoft.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.springframework.transaction.annotation.Transactional;

import com.karwisoft.dao.*;
import com.karwisoft.models.Document;




public class DocumentImp implements DocumentDAO {
	
	
	 private SessionFactory sessionFactory;
	
	public SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Document a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(Document a) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(a);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Document a) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(a);
		tx.commit();
		session.close();
		
	}

	@Transactional(readOnly = true)
	public Document findById(int id_Document) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Document Document  = (Document) session.load(Document.class, id_Document)  ;
		tx.commit();
		session.close();
		return Document;
		
	
	}

	@Transactional(readOnly = true)
	public List<Document> findByAll() {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Document> listDocuments = session.createQuery("from Document").list();
		tx.commit();
		session.close();
		return listDocuments;
	}
	
	 
}
