package org.indra.proyectofernandonieto.services;

import java.util.*;
import org.indra.proyectofernandonieto.models.*;

public interface IProductoService {
	
	public List<Producto> getAll();
	public Producto getById(int id) throws Exception;
	public Producto add(Producto producto) throws Exception;
	public void update(int id) throws Exception;
	public String delete(int id) throws Exception;

}
