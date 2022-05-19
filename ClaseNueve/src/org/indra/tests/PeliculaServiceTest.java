package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;

import org.indra.models.Pelicula;
import org.indra.services.IPeliculaService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class PeliculaServiceTest {
	
	//Reemplazo la consola por una consola alternativa en memoria
	private static PrintStream outConsola = System.out;
	private static ByteArrayOutputStream outAlternativo = new ByteArrayOutputStream();
	ApplicationContext context;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	public PeliculaServiceTest() {
		this.context = new ClassPathXmlApplicationContext("beans.test.xml");
	}

	@Test
	void testPeliculaService() {
		System.setOut(new PrintStream(outAlternativo));
		IPeliculaService service = (IPeliculaService)context.getBean("peliculaService");
		
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("Super 8");
		pelicula.setFecha(LocalDate.of(2011, Month.JULY, 1));
		
		service.add(pelicula);
		
		assertEquals("Servicio Alternativo", outAlternativo.toString().trim());
		
		System.setOut(outConsola);
	}
	
	@Test
	void testPeliculaServiceIsSingleton() {
		IPeliculaService service = (IPeliculaService) this.context.getBean("peliculaService");
		IPeliculaService service2 = (IPeliculaService) this.context.getBean("peliculaService");
		assertEquals(service, service2);
		
	}
	
	@Test
	void testnotSingletonBean() {
		ApplicationContext altcontext = new ClassPathXmlApplicationContext("beans.notSingleton.test.xml");
		IPeliculaService service = (IPeliculaService) altcontext.getBean("peliculaService");
		IPeliculaService service2 = (IPeliculaService) altcontext.getBean("peliculaService");
		assertEquals(true, altcontext.isPrototype("peliculaService"));
		assertNotEquals(service, service2);
	}
	
	@Test
	void testWithMemoryRepository() {
		ApplicationContext altcontext = new ClassPathXmlApplicationContext("beans.memoryRepository.test.xml");
		IPeliculaService service = (IPeliculaService) altcontext.getBean("peliculaService");
		
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("Titanic");
		pelicula.setFecha(LocalDate.of(1997, Month.JULY, 1));
		
		service.add(pelicula);
		
		Pelicula recuperada = service.findById(1);
		
		assertEquals(pelicula.getTitulo(), recuperada.getTitulo());
		assertEquals(pelicula.getFecha(), recuperada.getFecha());
		
		
	}

}
