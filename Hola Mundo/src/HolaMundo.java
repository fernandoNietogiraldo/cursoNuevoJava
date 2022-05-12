import java.util.*;

public class HolaMundo {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo");
		
		/*int a = 8;
		
		System.out.println(a);
		
		System.out.println(a++);
		
		System.out.println(a);
		
		int b = 8;
		
		if(a > b) {
			System.out.println("Mayor A");
		}
		else if(a < b) {
			System.out.println("Mayor B");
		}
		else {
			System.out.println("Iguales");
		}
		
		for (int i = 0; i < 10; i++) {
			
			if(i == 10 - 1) {
				System.out.print(i);
			}
			else {
				System.out.print(i + " ; ");
			}
			
		}*/
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		String nombre = "";
		
		while (!nombre.equals("FIN")) {
			
			System.out.println("Ingrese un nombre");
			nombre = sc.nextLine();
			
			if(!nombre.equals("FIN")) {
				nombres.add(nombre);
			}
		}
		
		for (int i = 0; i < nombres.size(); i++) {
			
			System.out.println(nombres.get(i));
		}
		
		System.out.println(nombres.size());
		
		nombres.forEach(val -> {
			String nombreAlReves = new StringBuilder(val).reverse().toString();
			System.out.println("Nombre " + val + "Longitud: " + val.length());
			System.out.println("Nombre al revés " + nombreAlReves);
		});
		

	}

}
