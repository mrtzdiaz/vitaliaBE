package com.vitalia.vitaliaBE.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.vitalia.vitaliaBE.service.CategoriasService;


@RestController
@RequestMapping(path="/api/categorias/")

public class CategoriasController {
	
	private final CategoriasService categoriaService;
	
	@Autowired
	public CategoriasController(CategoriasService categoriaService) {
		super();
		this.categoriaService = categoriaService;
	}
		
	@GetMapping
	public List<Categorias> getcategories(){
		return categoriaService.getAllCategories();
	}
	
	
	@GetMapping(path = "{CategoriasId}")
	public Categorias getcategoriesById(@PathVariable("CategoriasId") long id){
		return categoriaService.getCategories(id);
	}
	
	@DeleteMapping(path = "{CategoriasId}")
	public Categorias deletecategoriesById(@PathVariable("CategoriasId") long id){
		return categoriaService.deleteCategorias(id);
	}
	
	@PostMapping
	public Categorias addcategories(@RequestBody Categorias categorias) {
		return categoriaService.addCategories(categorias);
	}
	
	@PutMapping(path = "{CategoriasId}")
	public Categorias updatecategories(@PathVariable("CategoriasId") long id,
			@RequestParam(required=false) String Tipodeproducto,
			@RequestParam(required=false) String nombre
			) {
	return categoriaService.updateCategorias(id, nombre, Tipodeproducto);
	}


	
	
	
}//class CategoriasController
