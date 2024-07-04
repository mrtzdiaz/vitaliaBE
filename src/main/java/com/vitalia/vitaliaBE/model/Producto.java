package com.vitalia.vitaliaBE.model;

public class Producto {
	private String nombre;
	private String descripcion;
	private String imagen;
	private Double precio; 
	private String categoria;
	
	private static int total=0;
	private int id;
	
	public Producto(String nombre, String descripcion, String imagen, Double precio, String categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.categoria = categoria;
		Producto.total++;
		this.id=total;
	}//constructor con campos
	
	public Producto() {
		Producto.total++;
		this.id=total;
	}//constructor vacio

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", precio="
				+ precio + ", categoria=" + categoria + ", id=" + id + "]";
	}

	
	
	
	
	

}//class Producto
