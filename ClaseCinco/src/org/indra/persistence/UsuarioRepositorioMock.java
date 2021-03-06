package org.indra.persistence;

import org.indra.model.Usuario;
import java.util.*;

public class UsuarioRepositorioMock implements IUsuarioRepositorio{
	
	List<Usuario> usuarios = new ArrayList<Usuario>(){{
		
		new Usuario("Alice");
		new Usuario("Bob");
		new Usuario("Charles");
		
	}};
	
	public Usuario buscarPorNombre(String nombre) {
		
		Usuario result = null;
		
		for(Usuario actual : this.usuarios) {
			if(actual.getNombre().equals(nombre)) {
				result = actual;
			}
		}
		
		return result;
		
	}
	
	public void anadirUsuario(Usuario usuario) {
		
		this.usuarios.add(usuario);
	}

	@Override
	public void aņadirUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> buscarTodos() {
		return this.usuarios;
	}

}
