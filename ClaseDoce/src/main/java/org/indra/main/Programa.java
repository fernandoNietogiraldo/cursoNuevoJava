package org.indra.main;

public class Programa {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil("Lamborghini", "Murciélago");
		
		auto.setId(1);
		//auto.setMarca("Lamborghini");
		//auto.setModelo("Murciélago");
		auto.setKilometros(0);
		
		System.out.println(auto);
		
		Reloj reloj = Reloj.builder().marca("Casio").modelo("X1").build();
		
		System.out.println(reloj);
		
		reloj.salvar();
		
		Persona persona = new Persona("Juan", "Pérez");
		System.out.println(persona);

	}

}
