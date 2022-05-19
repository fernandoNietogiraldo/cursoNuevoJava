package org.indra.repository;

import org.indra.models.Pelicula;

public class PeliculaDbRepository implements IPeliculaRepository{
	
	Pelicula p;

	@Override
	public void add(Pelicula pelicula) {
		System.out.println("Agrego en la Base de Datos");
		this.p = pelicula;
		
		
	}

	@Override
	public Pelicula findById(int id) {
		System.out.println("Recupero de la Base de Datos");
		return this.p;
	}

}
