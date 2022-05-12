package org.indra.model;

public class Comentario extends ObjetoDeNegocio{
	
	private String texto;
	private Usuario autor;
	private boolean inapropiado = false;
	private EstrategiaModeracion moderador;

	public Comentario(String texto, Usuario autor) {
		super();
		this.texto = texto;
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public Usuario getAutor() {
		return autor;
	}
	
	public void setEstrategiaModeracion(EstrategiaModeracion estrategia) {
		this.moderador = estrategia;
	}
	
	public void moderar() {
		
		if(this.moderador != null) {
			this.inapropiado = !this.moderador.esApropiado(this.texto);
		}
		
	}

}
