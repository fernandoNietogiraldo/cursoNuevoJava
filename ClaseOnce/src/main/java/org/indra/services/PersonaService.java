package org.indra.services;

import java.util.*;

import org.indra.models.Persona;
import org.indra.persistence.IPersonaRepository;
import org.indra.persistence.PersonaJdbcRepository;

public class PersonaService implements IPersonaService{
	
	IPersonaRepository service = new PersonaJdbcRepository();
	
	public void add(Persona persona) { 
		try {
			service.add(persona);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Override
	public List<Persona> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


}
