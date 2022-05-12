package org.indra.model;

import java.util.*;

public class Posteo extends ObjetoDeNegocio{
	
	private String contenido;
	private String autor;
	private List<Comentario> comentarios = new ArrayList<Comentario>();

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getAutor() {
		return autor;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

}
