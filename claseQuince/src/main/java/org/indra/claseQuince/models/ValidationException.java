package org.indra.claseQuince.models;

public class ValidationException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public ValidationException(String mensaje) {
		super(mensaje);
	}

}
