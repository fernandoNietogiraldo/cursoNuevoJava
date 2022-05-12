package org.indra.services;

import org.indra.dto.RegistroUsuarioDTO;
import org.indra.model.Usuario;
import org.indra.persistence.IUsuarioRepositorio;
import org.indra.persistence.UsuarioRepositorio;

public class UsuarioService {
	
	private IUsuarioRepositorio repo;
	
	public UsuarioService(IUsuarioRepositorio repo) {
		//this.repo = new UsuarioRepositorio();
		this.repo = repo;
	}
	
	public Usuario registrarUsuarioNuevo(RegistroUsuarioDTO registro) throws Exception {
		
		if (this.repo.buscarPorNombre(registro.getNombreDeseado()) != null) {
			throw new Exception("Usuario ya existe");
		}
		
		Usuario nuevo = new Usuario(registro.getNombreDeseado());
		
		nuevo.validar();
		
		this.repo.añadirUsuario(nuevo);
		
		return nuevo;
		
		
	}

}
