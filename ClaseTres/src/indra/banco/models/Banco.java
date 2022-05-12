package indra.banco.models;

import java.util.*;

public class Banco {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();
	
	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public List<Cliente> getClientes() {
		
		return this.clientes;
		
	}
	
	public void registrarCliente(Cliente c) {
		
		this.clientes.add(c);
		
	}
	
	private String generarIban() {
		double iban = (Math.random() * 1000000);
		String ibanNuevo = Double.toString(iban);
		return ibanNuevo;
	}
	
	public Cuenta abrirCuentaNueva(Cliente c) throws Exception {
		
		if(!this.clientes.contains(c)) {
			throw new Exception(c + "no está dado de alta en el banco");
		}
		
		Cuenta nueva = new Cuenta(generarIban(), c);
		this.cuentas.add(nueva);
		
		return nueva;
		
		
	}
	
	

}
