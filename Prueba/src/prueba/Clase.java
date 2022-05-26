package prueba;

import java.util.*;

public class Clase {
	
	public void añadir() {
		
		List<Integer> numeros = null;
		
		System.out.println("Lista vacía");
		
		numeros = añadirTramaNueva();
		
		System.out.println("Lista nueva");
		
		numeros.forEach(c -> System.out.println(c));
		
		
		
		
	}
	
	public List<Integer> añadirTramaNueva() {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		return num;
		
	}

}
