package org.indra.consola;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;

import org.indra.models.*;
import org.indra.repository.*;
import org.indra.services.*;

public class Programa {

	public static void main(String[] args) throws Exception {
		//Modo Configuraci�n
		//Aqu� se configura toda nuestra aplicaci�n y sus dependencias
		//Aqu� definimos qui�n depende de qui�n
		//Los Mock se utilizan para pruebas, para simulaciones
		
		PeliculaRepositoryFactory.configureClass(PeliculaMockRepoFactory.class);
		//PeliculaRepositoryFactory.configureClass(PeliculaDbRepoFactory.class);
		
		
		//Modo Ejecuci�n
		//Una vez que tengo todo configurado ejecuto mi aplicaci�n normalmente
		
		PeliculaService service = new PeliculaService();
		
		Pelicula p = new Pelicula();
		p.setNombre("El se�or de los anillos");
		p.setDirector("Peter Jackson");
		p.setDuracion(260);
		p.setFechaDeSalida(LocalDate.now());
		service.a�adir(p);
		
		Pelicula recu = service.getById(1);
		
		System.out.println(recu.getNombre());
		
		
		Set<String> zonas = ZoneId.getAvailableZoneIds();
		zonas.stream().forEach(z -> System.out.println(z));
		
	}

}
