package org.indra.main;

import java.io.*;

import org.indra.services.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) throws Exception {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//IGeografiaService geografiaService = (IGeografiaService) context.getBean("geografiaService");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		IGeografiaService geografiaService = context.getBean(IGeografiaService.class);
		
		geografiaService.getComunidadesAutonomas().stream().forEach(c -> System.out.println(c));
		System.out.println("--------");
		geografiaService.getProvincias("Andalucía").stream().forEach(p -> System.out.println(p));
		
		( (ConfigurableApplicationContext) context).close();

	}

}
