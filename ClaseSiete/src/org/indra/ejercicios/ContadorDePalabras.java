package org.indra.ejercicios;

import java.util.*;
import java.util.stream.Stream;

public class ContadorDePalabras {
	
	Dictionary<String,Integer> diccionario = new Hashtable<String,Integer>();
	
	public ContadorDePalabras(String cadena) {
		
		String[] palabras = cadena.split(" ");
		Stream<String> stream = Arrays.stream(palabras);
		
		stream.forEach(palabra -> {
			if (this.diccionario.get(palabra) == null) {
				this.diccionario.put(palabra, 1);
			}
			else {
				this.diccionario.put(palabra, this.diccionario.get(palabra) + 1);
			}
		});
	}
	
	public int getOcurrencias(String palabra) {
		
		int result = 0;
		
		if (this.diccionario.get(palabra) != null) {
			result = this.diccionario.get(palabra);
		}
		
		return result;
		
	}

}
