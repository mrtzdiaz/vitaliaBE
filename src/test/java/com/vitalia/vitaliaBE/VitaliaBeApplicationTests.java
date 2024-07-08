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
	private final String token = "Bearer: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYW5pQGdtYWlsLmNvbSIsInJvbGUiOiJ1c2VyIiwiaWF0IjoxNzIwNDY2MzI0LCJleHAiOjE3MjA1MDk1MjR9.RLX0josZ5u6zKcBbNgmtVJK5RiOKvJVTh6qlNXo_lhg";
	
	//PRUEBAS GET DE PRODUCTOS
	@Test
	void pruebaGET1() throws Exception {
		this.mockMvc.perform(get("/api/productos/1"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Bebida")));
	}
	@Test
	void pruebaGET2() throws Exception {
		this.mockMvc.perform(get("/api/productos/2"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Hidrolizado")));
	}
	@Test
	void pruebaGET3() throws Exception {
		this.mockMvc.perform(get("/api/productos/3"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Shampoo")));
	}
	@Test
	void pruebaGET4() throws Exception {
		this.mockMvc.perform(get("/api/productos/4"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Eucalipto")));
	}
	@Test
	void pruebaGET5() throws Exception {
		this.mockMvc.perform(get("/api/productos/5"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Esencia")));
	}
	
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
	@DisplayName("Prueba POST")
	@Disabled("Probado, deshabilitado")
	void pruebaPOST() throws Exception {
		Producto p = new Producto();
		p.setNombre("");
		p.setDescripcion("");
		p.setDescripcion("");
		this.mockMvc.perform(post("/api/productos/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p))
				.header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("LIBROS")));
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
