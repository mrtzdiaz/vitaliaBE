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
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
    private Long id; 
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String descripcion;
	private String imagen;
	@Column(nullable=false)
	private Double precio;
	@Column(nullable=false)
	private Long categoria_id;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_producto")
	List<DetallesPedido> detallespedido = new ArrayList<DetallesPedido>();
	
	
		
	public Producto(String nombre, String descripcion, String imagen, Double precio, Long categoria_id) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.categoria_id = categoria_id;
	}//constructor con campos


	
	public Producto() {
	
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



	public Long getCategoria_id() {
		return categoria_id;
	}



	public void setCategoria_id(Long categoria_id) {
		this.categoria_id = categoria_id;
	}



	public Long getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", categoria_id=" + categoria_id + "]";
	}

	
	
	
	
	
	

}//class Producto
