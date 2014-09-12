package com.karwisoft.persistance;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static final SessionFactory sessionFactory = maMethodeStatique();


	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}




	@SuppressWarnings("deprecation")
	private static SessionFactory maMethodeStatique () {
		try {
			SessionFactory sessionFactory = new Configuration().configure(
					"hibernate.cfg.xml")
					.buildSessionFactory();
 
			return sessionFactory;
		}
		catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}


	public static void shutdown() {
		getSessionFactory().close();
	}
}


