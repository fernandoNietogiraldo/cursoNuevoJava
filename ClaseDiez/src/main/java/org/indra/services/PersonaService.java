package org.indra.services;

import java.sql.*;

import org.indra.models.Persona;

public class PersonaService implements IPersonaService{
	
	private String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add(Persona persona) {
		//Esto va al repositorio
		try {
			Connection connection = DriverManager.getConnection(this.connectionString);
			
			//Conecto con la base
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
