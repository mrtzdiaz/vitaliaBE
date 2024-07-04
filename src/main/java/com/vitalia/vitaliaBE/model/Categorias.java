package com.vitalia.vitaliaBE.model;

public class Categorias {
		private static int total=0;
		private int id;
		private String nombre;
		private String Tipodeproducto;
		
		
		
		
		//constructor vacio
		public Categorias() {
			Categorias.total++;
			this.id=total;
		}//constructor vacio
		
		
		//constructor
		public Categorias(String nombre, String Tipodeproducto) {
			this.nombre = nombre;
			this.Tipodeproducto = Tipodeproducto;
			
			Categorias.total++;
			this.id=total;
		
		}//constructor

		
		
		//Gett & setters
		public int getId() {
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

		public void setTipodeproducto(String Tipodeproducto) {
			this.Tipodeproducto = Tipodeproducto;
		}//Gett & setters

		
		//to String
		@Override
		public String toString() {
			return "Categorias [id=" + id + ", nombre=" + nombre + ", Tipodeproducto=" + Tipodeproducto + "]";
		}//to String


	

}//class categorias
