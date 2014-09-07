package com.karwisoft.test;




import org.hibernate.Session;
import org.hibernate.Transaction;

import com.karwisoft.persistance.HibernateUtil;;


public class Main {

	public static void main(String[] args){

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction tx = null;
		tx = session.beginTransaction();
		tx.commit();
		session.close();
		HibernateUtil.shutdown();
		}
		}
