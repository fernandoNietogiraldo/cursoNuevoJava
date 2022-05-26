package org.indra.sevices;

import org.hibernate.*;

public class ServiceBase {
	
	protected static SessionFactory sessionFactory;
	
	public static void configureSessionFactory(SessionFactory factory) {
		ServiceBase.sessionFactory = factory;
	}

}
