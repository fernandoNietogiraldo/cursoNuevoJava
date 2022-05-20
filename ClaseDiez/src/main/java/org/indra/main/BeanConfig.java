package org.indra.main;

import java.util.*;

import org.indra.services.*;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfig {
	
	@SuppressWarnings("serial")
	@Bean
	public IGeografiaService geografiaService() {
		
		GeografiaService service = new GeografiaService();
		List<String> provincias = new ArrayList<String>();
		provincias.add("Madrid");
		provincias.add("Andalucía");
		provincias.add("Asturias");
		provincias.add("Galicia");
		provincias.add("Cantabria");
		service.setComunidadesAutonomas(provincias);
		
		service.setProvincias(new HashMap<String,String>());
		
		service.getProvincias().put("Madrid", "Madrid");
		service.getProvincias().put("Andalucía", "Sevilla,Cadiz,Huelva,Malaga");
		service.getProvincias().put("Asturias", "Asturias");
		
		return service;
		
	}
	
	@Bean
	public IPersonaService personaService() {
		return new PersonaService() {{
			setConnectionString("jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3380500\\indragram.db");
		}};
	}
	

}
