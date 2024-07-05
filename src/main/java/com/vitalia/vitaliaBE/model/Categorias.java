package com.vitalia.vitaliaBE.model;

public class Categorias {
<<<<<<< HEAD
<<<<<<< HEAD
		private static int total=0;
		private int id;
=======
	
>>>>>>> jesus
=======

>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
		private String nombre;
		private String Tipodeproducto;
		
		private static int total=0;
		private int id;
		
		
		
		//constructor vacio
		public Categorias() {
			Categorias.total++;
			this.id=total;
<<<<<<< HEAD
<<<<<<< HEAD
=======
			
>>>>>>> jesus
=======
>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
		}//constructor vacio
		
		
		//constructor
		public Categorias(String nombre, String Tipodeproducto) {
<<<<<<< HEAD
<<<<<<< HEAD
			this.nombre = nombre;
			this.Tipodeproducto = Tipodeproducto;
			
			Categorias.total++;
			this.id=total;
		
=======
=======
>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
			super();
			this.nombre = nombre;
			this.Tipodeproducto = Tipodeproducto;
			Categorias.total++;
			this.id=total;
<<<<<<< HEAD
>>>>>>> jesus
		}//constructor

		
		
<<<<<<< HEAD
=======
		}//constructor

>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
		//Gett & setters
		public int getId() {
			return id;
		}

<<<<<<< HEAD

=======
	
		
>>>>>>> jesus
=======
>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> jesus
=======
>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
		public String getTipodeproducto() {
			return Tipodeproducto;
		}

<<<<<<< HEAD
<<<<<<< HEAD
		public void setTipodeproducto(String Tipodeproducto) {
			this.Tipodeproducto = Tipodeproducto;
		}//Gett & setters
=======
>>>>>>> jesus
=======
>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b

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
