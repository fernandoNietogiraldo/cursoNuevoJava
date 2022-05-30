package org.indra.clasedieciseis.services;

import java.util.List;

import org.indra.clasedieciseis.models.Cancion;
import org.indra.clasedieciseis.repositories.CancionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class CancionService implements ICancionService{
	
	@Autowired
	private CancionRepository repository;

	@Override
	public List<Cancion> getAll() {
		
		return this.repository.findAll();
	}

	@Override
	public Cancion getById(int id) throws Exception {
		return this.repository.findById(id).get();
	}

	@Override
	public Cancion add(Cancion cancion) throws Exception {
		
		if((cancion.getTitulo() == null) || (cancion.getTitulo().length() == 0)) {
			throw new Exception("Falta el título de la canción");
		}
		
		if((cancion.getAutor() == null) || (cancion.getAutor().length() == 0)) {
			throw new Exception("Falta el autor de la canción");
		}
		
		if((cancion.getDisco() == null) || (cancion.getDisco().length() == 0)) {
			throw new Exception("Falta el disco de la canción");
		}
		
		if(cancion.getSegundos() < 15) {
			throw new Exception("La canción no puede ocupar menos de 15 segundos");
		}
		
		this.repository.save(cancion);
		
		return cancion;
		
	}

}
