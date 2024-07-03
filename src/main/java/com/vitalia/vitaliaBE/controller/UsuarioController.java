package com.vitalia.vitaliaBE.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vitalia.vitaliaBE.model.Usuario;

@RestController
@RequestMapping(path="/api/usuarios/")
public class UsuarioController {
	
	
	@GetMapping
	public ArrayList<Usuario> getUsers(){
		return null;
	}
	
	@GetMapping(path = "{UsuarioId}")
	public Usuario getUserById(@PathVariable("UsuarioId") Long id){
		return null;
	}
	
	@DeleteMapping(path = "{UsuarioId}")
	public Usuario deleteUserById(@PathVariable("UsuarioId") Long id){
		return null;
	}
	
	@PostMapping
	public Usuario addUser(@RequestBody Usuario usuario) {
		return null;
	}
	
	@PutMapping(path = "{UsuarioId}")
	public Usuario updateUser(@PathVariable("UsuarioId") Long id,
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String apellido,
			@RequestParam(required=false) String correo,
			@RequestParam(required=false) String telefono,
			@RequestParam(required=false) String contrasena
			) {
	return null;
	}
}
