package org.indra.view;

import org.indra.dto.RegistroUsuarioDTO;
import org.indra.persistence.UsuarioRepositorio;
import org.indra.services.UsuarioService;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Bienvenidos a Indragram.");
		
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		
		UsuarioService usuarioService = new UsuarioService(repositorio);
		
		System.out.println("Voy a probar a registrar un usuario nuevo");
		
		RegistroUsuarioDTO registro = new RegistroUsuarioDTO();
		
		registro.setNombreDeseado("Juan");
		
		try {
			
			usuarioService.registrarUsuarioNuevo(registro);
			
		}catch (Exception e) {
			System.err.println("Esto no deber�a pasar");
		}
		
		System.out.println("Usuario Registrado perfectamente");
		
		//-------------------------------------------------
		
		System.out.println("Registrar un usuario duplicado");
		
		RegistroUsuarioDTO duplicado = new RegistroUsuarioDTO();
		
		duplicado.setNombreDeseado("Juan");
		
		try {
			
			usuarioService.registrarUsuarioNuevo(duplicado);
			
		}catch(Exception e) {
			System.out.println("Deber�a dar un error de usuario duplicado");
			System.out.println(e.getMessage());
		}
		
		//-------------------------------------------------
		
		System.out.println("Voy a probar a registrar un usuario vac�o");
		
		RegistroUsuarioDTO vacio = new RegistroUsuarioDTO();
		
		vacio.setNombreDeseado("");
		
		try {
			
			usuarioService.registrarUsuarioNuevo(vacio);
			
		}catch(Exception e) {
			System.out.println("Deber�a dar un error de usuario vac�o o muy corto");
			System.out.println(e.getMessage());
		}
		
		

	}

}
