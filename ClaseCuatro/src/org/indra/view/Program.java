package org.indra.view;

import org.indra.model.*;

public class Program {

	public static void main(String[] args) {
		
		// Ejemplo de Composite
		
		// EntidadSistemaFicheros carpetaRaiz = new Carpeta("root");
		
		FileSystemWatcher observer = new FileSystemWatcher();
		EntidadSistemaFicheros.RegistrarQuienMeMira(observer);
		
		System.out.println("Clase cuatro: Ejemplo de Composite");
		
		//System.out.println("Creando carpeta root");
		Carpeta carpetaRaiz = new Carpeta("root");
		
		//System.out.println("Creando carpeta temp");
		Carpeta temp = new Carpeta("temp");
		
		//System.out.println("Creando carpeta trash");
		Carpeta trash = new Carpeta("trash");
		
		//System.out.println("Creando archivo autoexec.bat con 100 bytes");
		Archivo autoexec = new Archivo("autoexec.bat", 100);
		
		//System.out.println("Creando archivo imagen.jpg vac�o");
		Archivo imagen = new Archivo("imagen.jpg");
		
		//System.out.println("Cambiando el tama�o del archivo a 350 bytes");
		imagen.setTama�o(350);
		
		//System.out.println("Agregando carpeta temp a carpeta ra�z");
		carpetaRaiz.a�adirHijo(temp);
		
		//System.out.println("Agregando autoexec.bat a carpeta temp");
		temp.a�adirHijo(autoexec);
		
		//System.out.println("Agregando carpeta trash a carpeta temp");
		temp.a�adirHijo(trash);
		
		//System.out.println("Agregando imagen.jpg a carpeta trash");
		trash.a�adirHijo(imagen);
		
		EntidadSistemaFicheros root = carpetaRaiz;
		System.out.println("El tama�o total es " + root.calcularTama�o());

	}

}
