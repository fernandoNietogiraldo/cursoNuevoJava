package org.indra.model;

public abstract class EntidadSistemaFicheros {
	
	// Patrón Composite
	
	protected static IObserver miradoPor;
	private String nombre = null;
	
	public static void RegistrarQuienMeMira (IObserver obs) {
		//EntidadSistemaFicheros.miradoPor = obs;
		miradoPor = obs;
	}
	

	public EntidadSistemaFicheros(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int calcularTamaño() ;

}
