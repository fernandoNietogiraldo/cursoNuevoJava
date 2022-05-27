package org.indra.claseQuince.controllers;

import org.indra.claseQuince.dto.*;
import org.indra.claseQuince.models.*;
import org.indra.claseQuince.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CancionController extends BaseController{
	
	@Autowired
	private ICancionService cancionService;
	
	@PostMapping("/api/cancion")
	public Object agregarCancion(@RequestBody Cancion cancion) {
		try {
			
			cancionService.add(cancion);
			return new Exito(cancion);
			
		}catch(Exception exception) {
			return new ResponseError(exception.getMessage());
		}
	}

}
