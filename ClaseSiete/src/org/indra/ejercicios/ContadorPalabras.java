package org.indra.ejercicios;

import java.util.*;

public class ContadorPalabras {

	public static void main(String[] args) {
		
		System.out.println("Bienvenidos a la clase 7");
		
		Dictionary<Integer,String> diccionario = new Hashtable<Integer,String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		System.out.print("Número de veces que aparece la palabra: ");
		int numVeces = sc.nextInt();
		
		for (int i = 0; i < numVeces; i++) {
			
			diccionario.put(i, palabra);
			
		}
		
		System.out.println(diccionario.get(2));

	}

}
