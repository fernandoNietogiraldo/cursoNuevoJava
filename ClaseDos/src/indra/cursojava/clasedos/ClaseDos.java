package indra.cursojava.clasedos;

import java.util.*;

import indra.utils.Consola;
import indra.utils.Tipos;


public class ClaseDos {

	public static void main(String[] args) {
		
		/*System.out.println("Bienvenidos");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		Consola.leerEntrada(nombre);
		System.out.println("Su nombre es: " + nombre);
		
		//System.out.println(String.format("Bienvenido %s", nombre));
		
		System.out.println("Ingrese su edad: ");
		String edad = sc.nextLine();
		Consola.leerEntrada(edad);
		
		if(Tipos.esNumero(edad)) {
			System.out.println("Su edad es: " + edad);
		}
		else {
			System.out.println("No lo entiendo");
		}
		
		sc.close(); */
		
		/* System.out.println("Bienvenidos");
		
		int random = (int)(Math.random()*100); 
		int num = -1; 
		Scanner sc = new Scanner(System.in); 
		while(num != random) { 
			System.out.println("Por favor ingrese un número"); 
			num = sc.nextInt(); 
			if(num > random) { 
				System.out.println("El número es menor que "+num); 
			}else if(num < random) { 
				System.out.println("El número es mayor que "+num); 
			}else { 
				System.out.println("¡Acertaste!"); 
			} 
		} */
		
		/* int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número");
		num1 = sc.nextInt();
		
		System.out.println("Ingrese el segundo número");
		num2 = sc.nextInt();
		
		System.out.println("Operaciones: 1 -> + / 2 -> -");
		
		System.out.println("Elige una operación");
		int operacion = sc.nextInt();
		
		int resultado = 0;
		
		switch(operacion) {
		
		case 1:
			
			resultado = num1 + num2;
			break;
		
		case 2:
			
			resultado = num1 - num2;
			break;
		
		default:
			
			System.out.println("Nada");
			break;
		
		}
		
		
		System.out.println(resultado); */
		
		/* String[] nombres = new String[] {"Fernando", "Pablo", "Javi"};
		//String[] nombres = {"Fernando", "Pablo", "Javi"};
		
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println(nombres[i]);
			
		}
		
		for (String val:nombres) System.out.println(val); //foreach */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuántos números quiere:");
		int numeros = sc.nextInt();
		
		int[] numerosArray;
		
		numerosArray = new int[numeros];
		
		for (int i = 0; i < numerosArray.length; i++) {
			
			System.out.println("Ingrese un número");
			int num = sc.nextInt();
			numerosArray[i] = num;
			
		}
		
		int numMax = numerosArray[0]; 
		int numMin = numerosArray[0]; 
		double promedio = 0.0; 
		
		for(int num:numerosArray) { 
			if(num > numMax) { 
				numMax = num; 
			} 
			if(num < numMin) { 
				numMin = num; 
			}
			
			promedio += num; 
		} 
		
		System.out.println(numMax); 
		System.out.println(numMin); 
		System.out.println(promedio/numeros);
		
	}

}
