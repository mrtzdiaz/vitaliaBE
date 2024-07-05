package com.vitalia.vitaliaBE.controller;

import java.sql.Date;
import java.util.Calendar;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitalia.vitaliaBE.config.JwtFilter;
import com.vitalia.vitaliaBE.dto.Token;
import com.vitalia.vitaliaBE.model.Usuario;
import com.vitalia.vitaliaBE.service.UsuarioService;

import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="/api/login/")
public class LoginController {
	private final UsuarioService usuarioService;
	@Autowired
	public LoginController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	
	
	@PostMapping
	public Token loginUser(@RequestBody Usuario usuario) 
										throws ServletException {
		if (usuarioService.validateUser(usuario)) {
			System.out.println("Usuario válido " + usuario.getEmail());
			return new Token(generateToken(usuario.getEmail()));
		}//if
		throw new ServletException("NOmbre de usuario o contraseña incorrectos [" 
		+ usuario.getEmail()+ "]");
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

