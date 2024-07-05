package com.vitalia.vitaliaBE.controller;

import java.util.ArrayList;

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
import com.vitalia.vitaliaBE.service.CategoriaService;


import com.vitalia.vitaliaBE.service.CategoriasService;



@RestController
@RequestMapping(path="/api/categorias/")

public class CategoriasController {
	
<<<<<<< HEAD
	private final CategoriasService categoriasService;
	
	public CategoriasController(CategoriasService categoriasService) {
		this.categoriasService = categoriasService;
	}
	

	
	@GetMapping
	public ArrayList<Categorias> getcategories(){
		return categoriasService.getListaCategorias();
	}
	
	
	@GetMapping(path = "{CategoriasId}")
	public Categorias getcategoriesById(@PathVariable("CategoriasId") int id){
		return categoriasService.getCategorias(id);
	}
	
	@DeleteMapping(path = "{CategoriasId}")
	public Categorias deletecategoriestById(@PathVariable("CategoriasId") int id){
		return categoriasService.deleteCategorias(id);
=======
	private final CategoriaService categoriaService;
	
	@Autowired
	public CategoriasController(CategoriaService categoriaService) {
		super();
		this.categoriaService = categoriaService;
	}

	
	
	@GetMapping
	public ArrayList<Categorias> getAllCategorias(){
		return categoriaService.getAllCategorias();
	}
	
	@GetMapping(path = "{Categoriasid}")
	public Categorias getCategoriasById(@PathVariable("Categoriasid") int id){
		return categoriaService.getCategorias(id);
	}
	
	@DeleteMapping(path = "{CategoriasId}")
	public Categorias deletecategoriesById(@PathVariable("CategoriasId") int id){
		return categoriaService.deleteCategorias(id);
>>>>>>> jesus
	}
	
	@PostMapping
	public Categorias addcategories(@RequestBody Categorias categorias) {
<<<<<<< HEAD
		return categoriasService.addCategories(categorias);
=======
		return categoriaService.addCategorias(categorias);
>>>>>>> jesus
	}
	
	@PutMapping(path = "{CategoriasId}")
	public Categorias updatecategories(@PathVariable("CategoriasId") int id,
<<<<<<< HEAD
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String Tipodeproducto
=======
			@RequestParam(required=false) String Tipodeproducto,
			@RequestParam(required=false) String nombre
>>>>>>> jesus
			) {
	return categoriaService.updateCategorias(id, nombre, Tipodeproducto);
	}


	
	
	
}//class CategoriasController
