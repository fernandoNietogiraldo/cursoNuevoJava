package org.indra.repository;

import org.indra.models.Pelicula;
import java.util.*;

public interface IPeliculaRepository {
	
	public List<Pelicula> findAll() throws Exception;
	public Pelicula findById(int id) throws Exception;
	public Pelicula findByName(String nombre) throws Exception;
	public void add(Pelicula pelicula) throws Exception;
	public void delete(int id) throws Exception;
	public void update(Pelicula pelicula) throws Exception;

}
