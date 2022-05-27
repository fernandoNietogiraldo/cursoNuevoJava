package org.indra.claseQuince.services;

import org.indra.claseQuince.models.*;
import org.springframework.stereotype.*;

@Service
public class CancionService implements ICancionService{

	@Override
	public void add(Cancion cancion) throws ValidationException{
		
		//Simulo que la Base de Datos me generó un Id
		cancion.setId(1);
		
		if(cancion.getNombre().length() < 3) {
			
			throw new ValidationException("Nombre muy corto");
			
		}
		
		//Al final grabo en la Base de Datos
		
	}

}
