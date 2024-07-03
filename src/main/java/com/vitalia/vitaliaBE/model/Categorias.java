package com.vitalia.vitaliaBE.model;

public class Categorias {
		private Long id;
		private String nombre;
		private String Tipodeproducto;
		
		
		//constructor vacio
		public Categorias() {
		}//constructor vacio
		
		
		//constructor
		public Categorias(Long id, String nombre, String apellido) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.Tipodeproducto = apellido;
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

		public String getApellido() {
			return Tipodeproducto;
		}

		public void setApellido(String apellido) {
			this.Tipodeproducto = apellido;
		}//Gett & setters

		
		//to String
		@Override
		public String toString() {
			return "Categorias [id=" + id + ", nombre=" + nombre + ", Tipodeproducto=" + Tipodeproducto + "]";
		}//to String

}//class categorias
