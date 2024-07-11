/*package com.vitalia.vitaliaBE;

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
class VitaliaBeApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	private final String token = "Bearer: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYW5pQGdtYWlsLmNvbSIsInJvbGUiOiJ1c2VyIiwiaWF0IjoxNzIwNTExMDU2LCJleHAiOjE3MjA1NTQyNTZ9.LtCq1BN4WjsfcXZM02tVu1ew4aGGJgvoKo2rHTcNL9M";
	
	//PRUEBAS GET DE PRODUCTOS
	@Test
	void pruebaGET() throws Exception {
		this.mockMvc.perform(get("/api/productos/3"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Hidrolizado")));
	}
	
	//PRUEBAS DELETE DE PRODUCTOS
	@Test
	@DisplayName("Prueba Delete")
	@Disabled("Probado, deshabilitado")
	void pruebaDELETE() throws Exception {
		this.mockMvc.perform(delete("/api/productos/2").header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Bebida")));
	}

	//PRUEBAS POST DE PRODUCTOS
	@Test
	@DisplayName("Prueba POST")
	@Disabled("Probado, deshabilitado")
	void pruebaPOST() throws Exception {
		Producto p = new Producto();
		p.setNombre("Bebida de soya en polvo (500 gr)");
		p.setPrecio(350.00);
		p.setDescripcion("Proteína aislada de soya, suero de leche deslactosada, dextrosa, lecitina de soya, Vitamina A (retinol), Vitamina D (calciferol), Vitamina C (ácido ascórbico), y sabor capuchino descafeinado.");
		p.setImagen("https://res.cloudinary.com/duzdr4eb6/image/upload/v1719516891/productos/qcrgdzzhwte7pwy1ncf3.web");
		p.setCategoria_id((long) 2);
		this.mockMvc.perform(post("/api/productos/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p)).header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Bebida")));
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
	void pruebaPUT() throws Exception {
		this.mockMvc.perform(put("/api/productos/6")
				.queryParam("precio", "185")
				.header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("185")));
	}
	

}*/
