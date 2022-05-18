package org.indra.services;

import java.util.List;

import org.indra.models.Pelicula;
import org.indra.repository.IPeliculaRepository;
import org.indra.repository.PeliculaRepositoryFactory;

public class PeliculaService {
	
	IPeliculaRepository repo;
	
	public PeliculaService() throws Exception{
		this.repo = PeliculaRepositoryFactory.getInstance().createRepository();
	}
	
	public void añadir(Pelicula pelicula) throws Exception {
		this.repo.add(pelicula); //Ejemplo de uso del repositorio
		
	}
	
	public Pelicula getById(int id) throws Exception {
		
		return this.repo.findById(id);
		
	}
	
	public Pelicula getByName(String nombre) throws Exception {
		return this.repo.findByName(nombre);
	}
	
	public void update(Pelicula pelicula) throws Exception { 
		// Faltaria las reglas de negocio // 
		this.repo.update(pelicula); // Ejemplo de uso del repositorio
	}
	
	public List<Pelicula> getAll() throws Exception {
		return this.repo.findAll();
	}
	
	public void delete(int id) throws Exception {
		this.repo.delete(id);

	}


}
