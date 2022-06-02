package org.indra.proyectofernandonieto.services;

import java.util.*;
import org.indra.proyectofernandonieto.models.Producto;
import org.indra.proyectofernandonieto.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> getAll() {
		return this.repository.findAll();
	}

	@Override
	public Producto getById(int id) throws Exception{
		if(id < 0) {
			throw new Exception("El id tiene que ser mayor que cero");
		}
		return this.repository.findById(id).get();
	}

	@Override
	public Producto add(Producto producto) throws Exception{
		
		if((producto.getNombre() == null) || (producto.getNombre().length() == 0)) {
			throw new Exception("Falta el nombre del producto");
		}
		
		if((producto.getTipo() == null) || (producto.getTipo().length() == 0)) {
			throw new Exception("Falta el tipo de producto");
		}
		
		if((producto.getPrecio() < 0)) {
			throw new Exception("Debe ser un precio por encima de cero");
		}
		
		this.repository.save(producto);
		
		return producto;
		
	}

	@Override
	public String delete(int id) throws Exception{
		
		if(id < 0) {
			throw new Exception("El id tiene que ser mayor que cero");
		}
		
		Producto p = this.repository.findById(id).get();
		
		this.repository.delete(p);
		
		return "Se ha eliminado correctamente";
		
	}

	@Override
	public void update(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
