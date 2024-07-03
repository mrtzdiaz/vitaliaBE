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

import com.vitalia.vitaliaBE.model.Categorias;


@RestController
@RequestMapping(path="/api/categorias/")

public class CategoriasController {
	@GetMapping
	public ArrayList<Categorias> getcategories(){
		return null;
	}
	
	@GetMapping(path = "{CategoriasId}")
	public Categorias getcategoriesById(@PathVariable("CategoriasId") Long id){
		return null;
	}
	
	@DeleteMapping(path = "{CategoriasId}")
	public Categorias deletecategoriesById(@PathVariable("CategoriasId") Long id){
		return null;
	}
	
	@PostMapping
	public Categorias addcategories(@RequestBody Categorias categorias) {
		return null;
	}
	
	@PutMapping(path = "{CategoriasId}")
	public Categorias updatecategories(@PathVariable("CategoriasId") Long id,
			@RequestParam(required=false) String Tipodeproducto,
			@RequestParam(required=false) String nombre
			) {
	return null;
	}
	
}//class CategoriasController
