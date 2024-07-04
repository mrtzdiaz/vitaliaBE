package com.vitalia.vitaliaBE.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalia.vitaliaBE.model.ChangePassword;
import com.vitalia.vitaliaBE.model.Usuario;

@Service
public class UsuarioService {
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	@Autowired
	public UsuarioService(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
		usuarios.add(new Usuario("Daniel","Martínez Díaz","mrtzdiazdaniel@gmail.com", "3320861076", "Dani2001$", true));
		usuarios.add(new Usuario("Diego","Hernandez","hernandezdiego@gmail.com", "3315445985", "Diego20$", true));
		usuarios.add(new Usuario("Dania","Cornejo","cornejodania@gmail.com", "5578549985", "Pa$$w0rd", false));
	}
	
	public ArrayList<Usuario> getAllUsers(){
		return usuarios;
	}
	
	public Usuario getOneUser(Long id) {
		Usuario tmpUsuario = null;
		for (Usuario usuario : usuarios) {
			if(usuario.getId() == id) {
				tmpUsuario = usuario;
				break;
			}
		}
		return tmpUsuario;
	}
	
	public Usuario deleteOneUser(Long id) {
		Usuario tmpUsuario = null;
		for (Usuario usuario : usuarios) {
			if(usuario.getId() == id) {
				tmpUsuario = usuarios.remove(usuarios.indexOf(usuario));
				break;
			}
		}
		return tmpUsuario;
	}
	
	public Usuario addOneUser(Usuario user) {
		Usuario tmpUsuario = null;
		boolean exist = true;
		for (Usuario usuario : usuarios) {
			if(usuario.getCorreo().equals(user.getCorreo())) {
				System.out.println("Ya existe un usuario con este correo, utilice uno distinto");
				exist = false;
				break;
			}
		}
		if(exist) {
			tmpUsuario = new Usuario(user.getNombre(), user.getApellido(), user.getCorreo(), user.getTelefono(), user.getContrasena(), false);
			usuarios.add(tmpUsuario);			
		}
		return tmpUsuario;
	}
	
	public Usuario updateOneUser(Long id, String name, String middle, String phone, ChangePassword changePassword) {
		Usuario tmpUsuario = null;
		for (Usuario usuario : usuarios) {
			if(usuario.getId() == id) {
				if(name != null) usuario.setNombre(name);
				if(middle != null) usuario.setApellido(middle);
				if(phone != null) usuario.setTelefono(phone);
				if(changePassword != null) {
					if(usuario.getContrasena().equals(changePassword.getPassword())) {
						if(changePassword.getNewPassword() != null) usuario.setContrasena(changePassword.getNewPassword());
					}else {
						System.out.println("Contraseña incorrecta");
					}
				}
				tmpUsuario = usuario;
			}
		}
		return tmpUsuario;
	}
}
