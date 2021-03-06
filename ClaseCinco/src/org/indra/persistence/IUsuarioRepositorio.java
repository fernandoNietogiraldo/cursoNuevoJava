package org.indra.persistence;

import java.util.List;

import org.indra.model.Usuario;

public interface IUsuarioRepositorio {
	
	public Usuario buscarPorNombre(String nombre);
	public List<Usuario> buscarTodos();
	public void aņadirUsuario(Usuario usuario);

}
