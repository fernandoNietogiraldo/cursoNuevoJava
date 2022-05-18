package org.indra.models;

import java.time.LocalDate;
import java.util.*;

public class Pelicula extends ObjetoDeNegocio{
	
	private String nombre;
	private String director;
	private int duracion;
	private LocalDate fechaDeSalida;

	public Pelicula () {
		super();
	}
	
	public Pelicula(String nombre, String director, int duracion, LocalDate fechaDeSalida) {
		super();
		this.nombre = nombre;
		this.director = director;
		this.duracion = duracion;
		this.fechaDeSalida = fechaDeSalida;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public LocalDate getFechaDeSalida() {
		return fechaDeSalida;
	}
	public void setFechaDeSalida(LocalDate fechaDeSalida) {
		this.fechaDeSalida = fechaDeSalida;
	}

}
