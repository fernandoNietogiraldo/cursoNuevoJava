package org.indra.services;

import java.util.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;
import org.indra.models.Persona;

public class PersonaHibernateService implements IPersonaService{
	
	private SessionFactory factory;
	

	public PersonaHibernateService(SessionFactory factory) {
		super();
		this.factory = factory;
	}


	@Override
	public void add(Persona persona) {
		
		try {
			
			//Configuración
			Session session = this.factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.save(persona);
			
			transaction.commit();
			
			factory.close();
			session.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public List<Persona> getAll() { 
		//return this.factory.openSession().createCriteria(Persona.class).list();
		//return this.factory.openSession().createQuery("FROM Persona").getResultList();
		Session session = this.factory.openSession();
		CriteriaBuilder builder = this.factory.openSession().getCriteriaBuilder();
		CriteriaQuery<Persona> query = builder.createQuery(Persona.class);
		query.from(Persona.class);
		return session.createQuery(query).getResultList();
	}


	@Override
	public void delete(int id) {
		
		Session session = this.factory.openSession();
		Transaction transaction = session.beginTransaction();
		Persona p = session.get(Persona.class, id);
		session.delete(p);
		transaction.commit();
		session.close();
	}
	
	

}
