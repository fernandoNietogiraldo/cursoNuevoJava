package indra.utils;

import java.util.*;

public class Consola {
	
	public static String leerEntrada(String nombre) {
		
		Scanner sc = new Scanner(System.in);
		
		if(nombre.isEmpty()){
			while(nombre.isEmpty()) {
				System.out.println("Ingréselo otra vez");
				nombre = sc.nextLine();
			}
		}
		
		return nombre;
		
	}
	
	public static int leerNumero(String titulo) { 
		
		System.out.println(titulo); 
		Scanner teclado = new Scanner(System.in); 
		String numero = teclado.nextLine(); 
		
		while(numero.isEmpty() || (!Tipos.esNumero(numero))){ 
			
			System.out.println("Por favor, ingresa un valor numérico"); 
			numero = teclado.nextLine(); 
		} 
		
		return Integer.parseInt(numero);
	}


}
