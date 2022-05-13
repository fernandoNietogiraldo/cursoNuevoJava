package org.indra.persistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.indra.model.Usuario;

public class UsuarioRepositorioDB implements IUsuarioRepositorio{

	@Override
	public Usuario buscarPorNombre(String nombre) {
		Connection conn = null;
		Usuario usr = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3380500\\indragram.db");
			Statement sql = conn.createStatement();
			ResultSet query = sql.executeQuery("select * from Usuario where Nombre = " + nombre);
			if(query.next()) {
				usr = new Usuario(query.getString("Nombre"));
			}
			
		}catch (Exception e){
			
			e.printStackTrace();
			
		}finally {
		
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return usr;
	}

	@Override
	public List<Usuario> buscarTodos() {
		
		Connection conn = null;
		List<Usuario> result = new ArrayList<Usuario>();
		
		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3380500\\indragram.db");
			Statement sql = conn.createStatement();
			ResultSet query = sql.executeQuery("select * from Usuario");
			while(query.next()) {
				Usuario usr = new Usuario(query.getString("Nombre"));
				result.add(usr);
			}
			
		}catch (Exception e){
			
			e.printStackTrace();
			
		}finally {
		
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return result;
		
	}

	@Override
	public void añadirUsuario(Usuario usuario) {
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3380500\\indragram.db");
			Statement sql = conn.createStatement();
			sql.executeUpdate("insert into Usuario (Nombre) values ('" + usuario.getNombre() + "')");
			
		}catch (Exception e){
			
			e.printStackTrace();
			
		}finally {
		
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}

}
