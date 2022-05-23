package org.indra.main;

import java.util.*;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.indra.models.Persona;
import org.indra.services.*;

public class Program {

	public static void main(String[] args) {
		
		StandardServiceRegistry conf = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(conf).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		IPersonaService service = new PersonaHibernateService(factory);
		
		try(final Scanner sc = new Scanner(System.in)){
			
			/*System.out.println("Ingrese el nombre y el apellido de la persona");
			
			Persona persona = new Persona();
			
			persona.setNombre(sc.nextLine());
			persona.setApellido(sc.nextLine());
			
			service.add(persona);*/
			
			System.out.println("Listo todas:");
			System.out.println("------------------");
			List<Persona> personas = service.getAll();
			personas.stream().forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));
			
			System.out.println("Borro la primera");
			System.out.println("-----------------------");
			service.delete(personas.stream().findFirst().get().getId());
			
			System.out.println("Listo todas despu�s de eliminar la primera:");
			System.out.println("------------------");
			personas = service.getAll();
			personas.stream().forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));
			
		}

	}

}
