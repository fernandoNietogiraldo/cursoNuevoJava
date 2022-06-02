package org.indra.proyectofernandonieto.models;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name="Producto")
public class Producto extends ObjetoDeNegocio{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Tipo")
	private String tipo;
	
	@Column(name="Precio")
	private double precio;

}
