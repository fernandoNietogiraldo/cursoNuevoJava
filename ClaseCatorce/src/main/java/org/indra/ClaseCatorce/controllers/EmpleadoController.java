package org.indra.ClaseCatorce.controllers;

import java.util.*;
import org.indra.ClaseCatorce.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpleadoController {
	
	List<Empleado> empleados = new ArrayList<Empleado>();
	
	public EmpleadoController() {
		
		empleados.add(new Empleado(1,"Ernesto","Martínez"));
		empleados.add(new Empleado(2,"Daniel","Ventura"));
		empleados.add(new Empleado(3,"Esteban","Calabria"));
		empleados.add(new Empleado(4,"Raquel","Riello"));
		
	}
	
	@GetMapping("/api/empleado")
	public List<Empleado> getAll(){
		
		return this.empleados;
		
	}
	
	@GetMapping("/api/empleado/{id}")
	public Empleado getById(@PathVariable(name = "id")int id) {
		
		return this.empleados.stream().filter(e -> e.getId() == id).findFirst().get();
		
	}
	
	@GetMapping("/api/empleado/echo")
	public Empleado echoEmpleado(Empleado empleado) {
		//Ejemplo de invocación --> http://localhost:8080/api/empleado/echo?nombre=Fernando&apellido=Nieto&id=100
		return empleado;
	}
	
	@PostMapping("/api/empleado/add")
	public Empleado addEmpleado(@RequestBody Empleado empleado) {
		empleado.setId(empleados.size() + 1);
		return empleado;
		
	}

}
