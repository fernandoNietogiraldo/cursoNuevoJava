package prueba;

import java.util.*;

public class Clase {
	
	public void a�adir() {
		
		List<Integer> numeros = null;
		
		System.out.println("Lista vac�a");
		
		numeros = a�adirTramaNueva();
		
		System.out.println("Lista nueva");
		
		numeros.forEach(c -> System.out.println(c));
		
		
		
		
	}
	
	public List<Integer> a�adirTramaNueva() {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		return num;
		
	}

}
