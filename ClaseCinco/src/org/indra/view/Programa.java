package org.indra.view;

import java.util.List;

import org.indra.dto.RegistroUsuarioDTO;
import org.indra.model.Usuario;
import org.indra.persistence.IUsuarioRepositorio;
import org.indra.persistence.UsuarioRepositorioDB;
import org.indra.services.UsuarioService;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Bienvenidos a Indragram.");
		
		IUsuarioRepositorio repo = new UsuarioRepositorioDB();
		List<Usuario> todos = repo.buscarTodos();
		todos.forEach(usr -> System.out.println(usr.getNombre()));
		
		Usuario nuevo = new Usuario("Pedro");
		
		repo.añadirUsuario(nuevo);
		
		/*UsuarioRepositorio repositorio = new UsuarioRepositorio();
		
		UsuarioService usuarioService = new UsuarioService(repositorio);
		
		System.out.println("Voy a probar a registrar un usuario nuevo");
		
		RegistroUsuarioDTO registro = new RegistroUsuarioDTO();
		
		registro.setNombreDeseado("Juan");
		
		try {
			
			usuarioService.registrarUsuarioNuevo(registro);
			
		}catch (Exception e) {
			System.err.println("Esto no debería pasar");
		}
		
		System.out.println("Usuario Registrado perfectamente");
		
		//-------------------------------------------------
		
		System.out.println("Registrar un usuario duplicado");
		
		RegistroUsuarioDTO duplicado = new RegistroUsuarioDTO();
		
		duplicado.setNombreDeseado("Juan");
		
		try {
			
			usuarioService.registrarUsuarioNuevo(duplicado);
			
		}catch(Exception e) {
			System.out.println("Debería dar un error de usuario duplicado");
			System.out.println(e.getMessage());
		}
		
		//-------------------------------------------------
		
		System.out.println("Voy a probar a registrar un usuario vacío");
		
		RegistroUsuarioDTO vacio = new RegistroUsuarioDTO();
		
		vacio.setNombreDeseado("");
		
		try {
			
			usuarioService.registrarUsuarioNuevo(vacio);
			
		}catch(Exception e) {
			System.out.println("Debería dar un error de usuario vacío o muy corto");
			System.out.println(e.getMessage());
		}*/
		
		
		
		

	}

}
