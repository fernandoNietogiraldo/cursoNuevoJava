package indra.banco.models;

public class Empresa extends Entidad{
	
	private String cif;
	
	public Empresa(String cif, String nombre) {
		super(nombre);
		this.cif = cif;
	}
	
	public String getCif() {
		return cif;
	}
	
	/*public String getNombre() {
		return nombre;
	}*/
	

}
