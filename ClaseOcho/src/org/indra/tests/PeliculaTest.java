package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.*;

import org.indra.models.Pelicula;
import org.indra.repository.PeliculaMockRepoFactory;
import org.indra.repository.PeliculaRepositoryFactory;
import org.indra.services.PeliculaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeliculaTest {

	@BeforeEach
	void setUp() throws Exception {
		PeliculaRepositoryFactory.configureClass(PeliculaMockRepoFactory.class);
		//PeliculaRepositoryFactory.configureClass(PeliculaDbRepoFactory.class);
	}

	@Test
	void testAddPelicula() throws Exception {
		PeliculaService service = new PeliculaService();
		
		Pelicula p = new Pelicula();
		LocalDate hoy = LocalDate.now();
		
		p.setNombre("El señor de los anillos");
		p.setDirector("Peter Jackson");
		p.setDuracion(260);
		p.setFechaDeSalida(hoy);
		service.añadir(p);
		
		Pelicula peliculaRecuperada = service.getByName("El señor de los anillos");
		assertEquals("El señor de los anillos", peliculaRecuperada.getNombre());
		assertEquals("Peter Jackson", peliculaRecuperada.getDirector());
		assertEquals(260, peliculaRecuperada.getDuracion());
		
		
	}
	
	@Test
	void testUpdatePelicula() throws Exception {
		
		PeliculaService service = new PeliculaService();
		
		Pelicula p = service.getById(1);
		
		p.setNombre("Super 8");
		
		service.update(p);
		
		assertEquals("Super 8", service.getById(1).getNombre());
		
	}
	
	@Test
	void testDeletePelicula() throws Exception {
		
		PeliculaService service = new PeliculaService();
		List<Pelicula> peliculas = service.getAll();
		int numPeliculas = peliculas.size();
		service.delete(2);
		List<Pelicula> peliculasNuevas = service.getAll();
		int numPeliculasNuevas = peliculasNuevas.size();
		
		assertEquals(numPeliculas, numPeliculasNuevas + 1);
	}

}
