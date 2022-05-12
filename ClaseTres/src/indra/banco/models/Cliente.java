package indra.banco.models;

import java.time.LocalDate;

public class Cliente extends Entidad{
	
	private String apellido;
	private LocalDate fechaNacimiento;
	
	public Cliente(String nomb, String apell, LocalDate fechaNac) {
		super(nomb);
		this.apellido = apell;
		this.fechaNacimiento = fechaNac;
	}
	
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNac) {
		this.fechaNacimiento = fechaNac;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String ape) {
		this.apellido = ape;
	}
	
	/*public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nomb) {
		this.nombre = nomb;
	}*/
	
	
	
	@Override
	public String toString() {
		
		return String.format("Hola soy %s %s y nací el día %s", this.getNombre(), apellido, fechaNacimiento);
		
	}

}
