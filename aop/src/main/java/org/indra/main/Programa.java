package org.indra.main;

import org.indra.services.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.core.io.*;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("resource")
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		HolaMundoService service = (HolaMundoService) contexto.getBean("serviceProxy");
		
		service.demo2(100);
		
		
	}

}
