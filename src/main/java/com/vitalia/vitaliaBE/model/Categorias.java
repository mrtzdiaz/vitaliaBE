package com.vitalia.vitaliaBE.model;

public class Categorias {
<<<<<<< HEAD
		private static int total=0;
		private int id;
=======
	
>>>>>>> jesus
		private String nombre;
		private String Tipodeproducto;
		
		private static int total=0;
		private int id;
		
		
		
		//constructor vacio
		public Categorias() {
			Categorias.total++;
			this.id=total;
<<<<<<< HEAD
=======
			
>>>>>>> jesus
		}//constructor vacio
		
		
		//constructor
		public Categorias(String nombre, String Tipodeproducto) {
<<<<<<< HEAD
			this.nombre = nombre;
			this.Tipodeproducto = Tipodeproducto;
			
			Categorias.total++;
			this.id=total;
		
=======
			super();
			this.nombre = nombre;
			this.Tipodeproducto = Tipodeproducto;
			Categorias.total++;
			this.id=total;
>>>>>>> jesus
		}//constructor

		
		
<<<<<<< HEAD
		//Gett & setters
		public int getId() {
			return id;
		}


=======
	
		
>>>>>>> jesus
		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

<<<<<<< HEAD
=======

>>>>>>> jesus
		public String getTipodeproducto() {
			return Tipodeproducto;
		}

<<<<<<< HEAD
		public void setTipodeproducto(String Tipodeproducto) {
			this.Tipodeproducto = Tipodeproducto;
		}//Gett & setters
=======
>>>>>>> jesus

		public void setTipodeproducto(String tipodeproducto) {
			Tipodeproducto = tipodeproducto;
		}


		public int getId() {
			return id;
		}


		//to String
		@Override
		public String toString() {
			return "Categorias [id=" + id + ", nombre=" + nombre + ", Tipodeproducto=" + Tipodeproducto + "]";
		}//to String


	

}//class categorias
