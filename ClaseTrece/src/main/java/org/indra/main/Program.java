package org.indra.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.indra.models.Libro;
import org.indra.sevices.*;
import org.indra.sevices.ServiceBase;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.classmate.AnnotationConfiguration;

import org.springframework.context.*;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Bienvenidos");
		
		//Configuración de Hibernate
		//Mapeos con Archivos XML
		
		/*Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = config.buildSessionFactory();
		ServiceBase.configureSessionFactory(sessionfactory);*/
		
		//Mapeos con anotaciones
		/*ServiceBase.configureSessionFactory(sessionfactory);*/
		
		//Configuración de SPRING
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//ILibroService service = new LibroService(); //<<Esto lo vamos a reemplazar por la inyección de dependencias, SPRING
		ILibroService service = (ILibroService) context.getBean("libroService"); //Esto es con SPRING
		
		
		/*Libro libro1 = new Libro();
		libro1.setTitulo("Los pilares de la Tierra");
		libro1.setEscritor("Ken Follet");*/
		
		/*Libro libro2 = new Libro();
		libro2.setTitulo("Juego de Tronos");
		libro2.setEscritor("George RR Martin");*/
		
		Libro libro3 = new Libro();
		libro3.setTitulo("El Hobbit");
		libro3.setEscritor("J.R.Tolkien");
		
		service.add(libro3);
		
		
		System.out.println("Libro guardado en la Base de Datos");

	}

}
