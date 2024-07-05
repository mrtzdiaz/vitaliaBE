package com.vitalia.vitaliaBE.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.vitalia.vitaliaBE.dto.ChangePassword;
import com.vitalia.vitaliaBE.model.Usuario;
import com.vitalia.vitaliaBE.repository.UsuarioRepository;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public List<Usuario> getAllUsers(){
		return usuarioRepository.findAll();
	}
	
	public Usuario getOneUser(Long id) {
		Usuario tmpUsuario = null;
		if(usuarioRepository.existsById(id)) {
			tmpUsuario = usuarioRepository.findById(id).get();
		}else {
			System.out.println("No existe el usuario con el id: "+ id);
		}
		return tmpUsuario;
	}
	
	public Usuario deleteOneUser(Long id) {
		Usuario tmpUsuario = null;
		if(usuarioRepository.existsById(id)) {
			tmpUsuario = usuarioRepository.findById(id).get();
			usuarioRepository.deleteById(id);
		}else {
			System.out.println("No existe el usuario con el id: "+ id);
		}
		return tmpUsuario;
	}
	
	public Usuario addOneUser(Usuario user) {
		Optional<Usuario> tmpUsuario = usuarioRepository.findByCorreo(user.getCorreo());
		if(tmpUsuario.isEmpty()) {
			user.setContrasena(encoder.encode(user.getContrasena()));
			usuarioRepository.save(user);
			return user;
		}else {
			System.out.println("Ya existe un usuario con el correo: " + user.getCorreo());
			return null;
		}
	}
	
	public Usuario updateOneUser(Long id, String name, String middle, String phone, ChangePassword changePassword) {
		Usuario tmpUsuario = null;
		if(usuarioRepository.existsById(id)) {
			tmpUsuario = usuarioRepository.findById(id).get();
			if(name != null) tmpUsuario.setNombre(name);
			if(middle != null) tmpUsuario.setNombre(middle);
			if(phone != null) tmpUsuario.setNombre(phone);
			if(changePassword != null) {
				if(changePassword.getPassword().equals(tmpUsuario.getContrasena())) {
					if(changePassword.getNewPassword() != null) tmpUsuario.setContrasena(changePassword.getNewPassword());
				}else {
					System.out.println("La contraseña no es correcta");
				}
			}
			usuarioRepository.save(tmpUsuario);
		}else {
			System.out.println("No existe el usuario con el id: "+ id);
		}
		return tmpUsuario;
	}
	
	public boolean validateUser(Usuario usuario) {
		Optional<Usuario> userByEmail = usuarioRepository.findByCorreo(usuario.getCorreo());
		if(userByEmail.isPresent()) {
			Usuario tmpUser = userByEmail.get();
			if(encoder.matches(usuario.getContrasena(), tmpUser.getContrasena())) {
				return true;
			}
		}
		return false;
	}
}
