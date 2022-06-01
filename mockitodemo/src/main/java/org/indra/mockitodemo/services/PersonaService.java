package org.indra.mockitodemo.services;

import org.indra.mockitodemo.models.*;
import org.indra.mockitodemo.repositories.*;

public class PersonaService {
	
	private IPersonaRepository repository;
	
	public void setRepository(IPersonaRepository repository) {
		this.repository = repository;
	}
	
	public Persona getById(int id) {
		return this.repository.get(id);
	}
	
	public void add(Persona p) throws Exception {
		if((p.getNombre() == null) || p.getNombre().length() == 0) {
			throw new Exception("El nombre no puede ser vacío");
		}
		
		this.repository.add(p);
	}
	

}
