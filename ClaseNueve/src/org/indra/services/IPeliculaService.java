package org.indra.services;

import org.indra.models.*;

public interface IPeliculaService {
	
	public void add(Pelicula pelicula);
	public Pelicula findById(int id);

}
