package com.vitalia.vitaliaBE;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vitalia.vitaliaBE.model.Producto;
import com.vitalia.vitaliaBE.model.Usuario;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
public class TestUsuarios {

	@Autowired
	private MockMvc mockMvc;
	private final String token = "Bearer: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYW5pQGdtYWlsLmNvbSIsInJvbGUiOiJ1c2VyIiwiaWF0IjoxNzIwNTExMDU2LCJleHAiOjE3MjA1NTQyNTZ9.LtCq1BN4WjsfcXZM02tVu1ew4aGGJgvoKo2rHTcNL9M";
	
	//PRUEBAS DELETE DE PRODUCTOS
	@Test
	@DisplayName("Prueba Delete")
	@Disabled("Probado, deshabilitado")
	void pruebaDELETE() throws Exception {
		this.mockMvc.perform(delete("/api/productos/2").header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("COMIDA")));
	}

	//PRUEBAS POST DE PRODUCTOS
	@Test
	@DisplayName("Prueba POST USUARIO")
	@Disabled("Probado, deshabilitado")
	void pruebaPOST() throws Exception {
		Usuario user = new Usuario();
		user.setNombre("Daniel");
		user.setApellido("Díaz");
		user.setCorreo("dani@gmail.com");
		user.setTelefono("3320861076");
		user.setContrasena("Dani2001$");
		this.mockMvc.perform(post("/api/usuarios/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(user)))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("dani@gmail.com")));
	}
	
	private static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
	 } // asJsonString
	
	
	//PRUEBAS PUT DE PRODUCTOS
	@Test
	@DisplayName("Prueba PUT")
	@Disabled("Probado, deshabilitado")
	//@Disabled("Probado, deshabilitado")
	void pruebaPUT() throws Exception {
		this.mockMvc.perform(put("/api/productos/1")
				.queryParam("precio", "50")
				.header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("50")));
	}
	

}
