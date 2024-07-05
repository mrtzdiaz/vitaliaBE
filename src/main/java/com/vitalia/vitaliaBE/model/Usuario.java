package com.vitalia.vitaliaBE.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
    private Long id; 
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private String contrasena;
	private Boolean administrador;
	

	public Usuario() {
		
	}//Constructor Vacio
	
	public Usuario(String nombre, String apellido, String correo, String telefono, String contrasena,
			boolean administrador) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.contrasena = contrasena;
		this.administrador = administrador;
	}//Constructor con campos
	
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
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Boolean getAdministrador() {
		return administrador;
	}

	@Override
	public String toString() {
		return "Usuario [Id="+ id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono
				+ ", contrasena=" + contrasena + ", administrador=" + administrador + "]";
	}
	
	
}
