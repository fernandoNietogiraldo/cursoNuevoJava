package indra.banco.models;

public class Cuenta {
	
	private double saldo = 0;
	private String iban;
	private Entidad titular;
	
	public Cuenta(String iban, Entidad titular) {
		this.iban = iban;
		this.titular = titular;
	}
	
	public Entidad getTitular() {
		return titular;
	}
	
	public String getIban() {
		return iban;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void ingresarDinero (double dinero) {
		this.saldo += dinero;
	}
	
	public void extraerDinero (double dinero) throws Exception {
		
		if(dinero > this.saldo) {
			throw new Exception ("No hay suficiente dinero");
		}
		
		this.saldo -= dinero;
	}
	
	

}
