package indra.utils;

public class Tipos {
	
	public static boolean esNumero(String str) {
		 boolean isNumeric = str.matches("[0-9]+");
		 return isNumeric;
	}
	
	
	public static int valorAlAzar (int min, int max){ 
		return (int) (Math.random () * (max - min)) + min; 
	}

}
