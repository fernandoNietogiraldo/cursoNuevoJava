package org.indra.models;

public abstract class Animal {
	
	public abstract String getSonido();
	
	public void mostrar(IMostrable most) {
		most.mostrarAnimal(this);
	}

}
