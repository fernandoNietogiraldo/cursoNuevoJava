package org.indra.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.indra.ejercicios.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class DemoTests {

	@Test
	void testDiccionario() {
		ContadorDePalabras contador = new ContadorDePalabras("la casa de la esquina");
		assertEquals(2, contador.getOcurrencias("la"));
	}
	
	@Test
	void testFilter() {
		List<String> palabras = new ArrayList<String>();
		
		palabras.add("hola");
		palabras.add("que");
		palabras.add("maslarga");
		
		int masLargasqueCinco = (int) palabras.stream().filter(palabra -> palabra.length() > 5).count();
		
		assertEquals(1, masLargasqueCinco);
	}
	
	@Test
	void testMap() {
		List<String> palabras = new ArrayList<String>();
		
		palabras.add("hola");
		palabras.add("que");
		palabras.add("maslarga");
		
		List<String> mayuscula = palabras.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
		
		assertEquals("HOLA", mayuscula.get(0));
	}
	
	@Test
	void testSum() {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		int sumatoria = numeros.stream().reduce(0, (acum, actual) -> acum + actual);
		
		assertEquals(15, sumatoria);
	}
	
	@Test
	void testAnyMatch() {
		List<String> lista = Arrays.asList("Esteban", "Pepe", "Juan");
		
		boolean contiene = lista.stream().anyMatch(p -> p.equals("Esteban"));
		
		assertEquals(true, contiene);
	}
	
	@Test
	@Order(1)
	void testArchivoNombres() throws IOException{
		File archivo = new File("nombres.txt");
		archivo.createNewFile();
		FileWriter writer = new FileWriter("nombres.txt");
		writer.write("Juan\n");
		writer.write("Pepe\n");
		writer.write("Fernando\n");
		writer.write("Carlos\n");
		writer.write("Elena\n");
		writer.close();
		assertEquals(true, archivo.exists());
	}
	
	@Test
	@Order(2)
	void testArchivoNombres2() throws IOException{

		try (Stream<String> lineas = Files.lines(Path.of("nombres.txt"))) {
			long n = lineas.filter(p -> p.length() > 4).count();
			
			assertEquals(3, n);
		}
	}
	
	

}
