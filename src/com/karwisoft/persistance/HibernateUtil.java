package com.karwisoft.persistance;

import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static final SessionFactory sessionFactory = maMethodeStatique();


	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}




	private static SessionFactory maMethodeStatique () {
		try {
			return new Configuration().configure().buildSessionFactory();
		}
		catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}


	public static void shutdown() {
		getSessionFactory().close();
	}
}


