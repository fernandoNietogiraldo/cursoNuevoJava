package org.indra.vista;

import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.swing.*;
import org.indra.models.*;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		/* List<String> lista = Arrays.asList("Calculadora", "Espacio", "Nota", "Garabato", "Cielo");
		
		Consumer<String> metodoLambda = (n) -> {System.out.println("--" + n + "--");};
		
		lista.forEach(metodoLambda); */
		
		/* JButton boton = new JButton("Hazme click");
		boton.setBounds(1, 1, 300, 50);
		boton.addActionListener( (e) -> {JOptionPane.showConfirmDialog(boton, "Hiciste click");});
		
		JFrame f = new JFrame();
		f.add(boton);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(640, 480);
		f.setVisible(true); */
		
		/*Animal garfield = new Gato();
		garfield.mostrar((a) -> {System.out.println("Soy un animal que hace " + a.getSonido());});
		
		IMostrable porConsola = (Animal a) -> {System.out.println("Soy un "+ a.getClass().getSimpleName() + " que hace " + a.getSonido());};
		Animal pluto = new Perro();
		pluto.mostrar(porConsola);*/
		
		/*IMostrable porConsola = (Animal a) -> {System.out.println("Soy un "+ a.getClass().getSimpleName() + " que hace " + a.getSonido());};
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Qué animal quieres crear: ");
			String animal = sc.nextLine();
			Class creador = Class.forName("org.indra.models."+animal);
			Animal a = (Animal) creador.newInstance();
			a.mostrar(porConsola);
			
		}*/
		
		/*List<String> lista = Arrays.asList("a", "b", "c", "d");
		lista.forEach(System.out::println);*/
		
		//LISTAR LOS MÉTODOS DE UNA CLASE UTILIZANDO REFLECTION
		
		/*ArrayList<String> lista = new ArrayList<String>();
		Class claseArrayList = lista.getClass();
		Stream<Method> metodos = Arrays.stream(claseArrayList.getMethods());
		metodos.forEach(m -> System.out.println(m.getName()));*/
		
		/*String cadena = new String("Hola que tal");
		Class claseString = cadena.getClass();
		Stream<Method> metodosString = Arrays.stream(claseString.getMethods());
		Method metodoContains = metodosString.filter(m -> m.getName().equals("contains")).findFirst().get();
		boolean contiene = (Boolean) metodoContains.invoke(cadena, "que");
		System.out.println(contiene);*/
		
		

	}

}
