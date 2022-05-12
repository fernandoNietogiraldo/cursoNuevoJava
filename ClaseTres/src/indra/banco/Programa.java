package indra.banco;

import java.time.LocalDate;
import java.util.*;

import indra.banco.models.Banco;
import indra.banco.models.Cliente;
import indra.banco.models.Cuenta;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Banco banco = new Banco();
			
			System.out.println("Ingrese su nombre");
			
			String nombre = sc.nextLine();
			
			System.out.println("Ingrese su apellido");
			
			String apellido = sc.nextLine();
			
			System.out.println("Ingrese su fecha de nacimiento (YYYY-MM-DD)");
			
			LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());
			
			Cliente cliente = new Cliente(nombre, apellido, fechaNacimiento);
			
			banco.registrarCliente(cliente);
			
			Cuenta cuenta = banco.abrirCuentaNueva(cliente);
			
			cuenta.ingresarDinero(1000);
			
			
			System.out.println(cliente);
			
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			
			sc.close();
		}

	}

}
