package org.indra.main;

public class Programa {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil("Lamborghini", "Murci�lago");
		
		auto.setId(1);
		//auto.setMarca("Lamborghini");
		//auto.setModelo("Murci�lago");
		auto.setKilometros(0);
		
		System.out.println(auto);
		
		Reloj reloj = Reloj.builder().marca("Casio").modelo("X1").build();
		
		System.out.println(reloj);
		
		reloj.salvar();
		
		Persona persona = new Persona("Juan", "P�rez");
		System.out.println(persona);

	}

}
