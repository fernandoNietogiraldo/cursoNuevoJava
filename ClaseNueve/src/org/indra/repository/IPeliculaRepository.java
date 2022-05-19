package org.indra.repository;

import org.indra.models.*;

public interface IPeliculaRepository {
	
	public void add(Pelicula pelicula);
	public Pelicula findById(int id); 

}
