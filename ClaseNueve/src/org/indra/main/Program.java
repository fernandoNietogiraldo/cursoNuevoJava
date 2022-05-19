package org.indra.main;

import java.time.LocalDate;
import java.time.Month;

import org.indra.models.*;
import org.indra.services.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		//EJEMPLO 1: Sin SPRING
		
		/*PeliculaService service = new PeliculaService(); //Esto lo creábamos con un Factory
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("Super 8");
		pelicula.setFecha(LocalDate.of(2011, Month.JULY, 1));
		
		service.añadir(pelicula);*/
		
		//EJEMPLO 2: Con SPRING
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IPeliculaService service = (IPeliculaService)context.getBean("peliculaService");
		
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("Super 8");
		pelicula.setFecha(LocalDate.of(2011, Month.JULY, 1));
		
		
		service.add(pelicula);
		
		( (ConfigurableApplicationContext) context).close();
		

	}

}
