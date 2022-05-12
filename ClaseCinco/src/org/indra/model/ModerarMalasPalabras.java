package org.indra.model;

public class ModerarMalasPalabras implements EstrategiaModeracion{

	@Override
	public boolean esApropiado(String texto) {
		String[] malasPalabras = {"tonto", "incapaz", "malo", "feo"};
		for (String palabra : malasPalabras) {
			if(texto.contains(palabra)) {
				return false;
			}
		}
		return true;
	}
	
	

}
