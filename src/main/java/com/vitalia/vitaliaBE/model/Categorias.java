package com.vitalia.vitaliaBE.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categorias {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column( unique=true , nullable=false)
	    private Long id;
		@Column(nullable=false)
		private String nombre;
		@Column(nullable=false)
		private String Tipodeproducto;
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name="categoria_id")
		List<Producto> productos = new ArrayList<Producto>();
		
		//constructor vacio
		public Categorias() {
		}//constructor vacio
			
		//constructor
		public Categorias(String nombre, String Tipodeproducto) {

	
			super();
			this.nombre = nombre;
			this.Tipodeproducto = Tipodeproducto;
			
		}//constructor

		//Gett & setters
		public Long getId() {
			return id;
		}

		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getTipodeproducto() {
			return Tipodeproducto;
		}

		public void setTipodeproducto(String tipodeproducto) {
			Tipodeproducto = tipodeproducto;
		}
		//to String
		@Override
		public String toString() {
			return "Categorias [id=" + id + ", nombre=" + nombre + ", Tipodeproducto=" + Tipodeproducto + "]";
		}//to String


	

}//class categorias
