package com.vitalia.vitaliaBE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vitalia.vitaliaBE.dto.ChangePassword;
import com.vitalia.vitaliaBE.model.Usuario;
import com.vitalia.vitaliaBE.service.UsuarioService;

@CrossOrigin(origins="http://127.0.0.1:3003")
@RestController
@RequestMapping(path="/api/usuarios/")
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping
	public List<Usuario> getUsers(){
		return usuarioService.getAllUsers();
	}
	
	@GetMapping(path = "{UsuarioId}")
	public Usuario getUserById(@PathVariable("UsuarioId") Long id){
		return usuarioService.getOneUser(id);
	}
	
	@DeleteMapping(path = "{UsuarioId}")
	public Usuario deleteUserById(@PathVariable("UsuarioId") Long id){
		return usuarioService.deleteOneUser(id);
	}
	
	@PostMapping
	public Usuario addUser(@RequestBody Usuario usuario) {
		return usuarioService.addOneUser(usuario);
	}
	
	@PutMapping(path = "{UsuarioId}")
	public Usuario updateUser(@PathVariable("UsuarioId") Long id,
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String apellido,
			@RequestParam(required=false) String telefono,
			@RequestParam(required=false) String contrasena,
			@RequestParam(required=false) String newContrasena,
			@RequestBody(required=false) ChangePassword changePassword) {
	return usuarioService.updateOneUser(id, nombre, apellido, telefono, changePassword);
	}
}
