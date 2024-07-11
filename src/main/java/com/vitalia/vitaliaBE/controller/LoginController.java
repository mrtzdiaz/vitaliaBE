package com.vitalia.vitaliaBE.controller;

import java.util.Date;
import java.util.Calendar;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitalia.vitaliaBE.config.JwtFilter;
import com.vitalia.vitaliaBE.dto.Token;
import com.vitalia.vitaliaBE.model.Usuario;
import com.vitalia.vitaliaBE.repository.UsuarioRepository;
import com.vitalia.vitaliaBE.service.UsuarioService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin(origins="http://127.0.0.1:3003")
@RestController
@RequestMapping(path="/api/login/")
public class LoginController {
	private final UsuarioService usuarioService;
	private final UsuarioRepository usuarioRepository;
	@Autowired
	public LoginController(UsuarioService usuarioService, UsuarioRepository usuarioRepository) {
		this.usuarioService = usuarioService;
		this.usuarioRepository = usuarioRepository;
	}

	@PostMapping
	public Token loginUser(@RequestBody Usuario usuario) 
										throws ServletException {
		if (usuarioService.validateUser(usuario)) {
			Usuario user = usuarioRepository.findByCorreo(usuario.getCorreo()).get();
			System.out.println("Usuario válido " + usuario.getCorreo());
			return new Token(generateToken(usuario.getCorreo()), user.getNombre());
		}
		throw new ServletException("Nombre de usuario o contraseña incorrectos [" + usuario.getCorreo()+ "]");
	}//login
	
	private String generateToken(String username) {
		Calendar calendar = Calendar.getInstance();//Fecha hora actual
		calendar.add(Calendar.HOUR, 12); // Pruebas
		//calendar.add(Calendar.MINUTE, 30);// Producción
		return Jwts.builder().setSubject(username).claim("role", "user")
		.setIssuedAt(new Date())
		.setExpiration(calendar.getTime())
		.signWith(SignatureAlgorithm.HS256, JwtFilter.secret)
		.compact();
	}//generateToken
	
	
}//class controller 

