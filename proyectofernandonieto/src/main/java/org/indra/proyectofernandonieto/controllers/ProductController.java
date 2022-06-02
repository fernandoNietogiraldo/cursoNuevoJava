package org.indra.proyectofernandonieto.controllers;

import java.util.List;

import org.indra.proyectofernandonieto.models.*;
import org.indra.proyectofernandonieto.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
	
	@Autowired
	private IProductoService service;
	
	@GetMapping("/api/producto")
	public ResponseEntity<List<Producto>> getAll(){
		
		return new ResponseEntity<List<Producto>>(this.service.getAll(), HttpStatus.OK);	
	}
	
	@GetMapping("/api/producto/{id}")
	public ResponseEntity<Object> getById(@PathVariable(name="id") int id){
		
		try {
			return new ResponseEntity<Object>(this.service.getById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/api/addProducto")
	public ResponseEntity<Object> add(@RequestBody() Producto producto){
		
		try {
			return new ResponseEntity<Object>(this.service.add(producto), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@DeleteMapping("/api/deleteProducto/{id}")
	public ResponseEntity<Object> delete(@PathVariable(name="id") int id){
		
		try {
			return new ResponseEntity<Object>(this.service.delete(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	

}
