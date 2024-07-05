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
import com.vitalia.vitaliaBE.service.CategoriasService;


@RestController
@RequestMapping(path="/api/categorias/")

public class CategoriasController {
	
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
	private final CategoriaService categoriaService;
=======
	private final CategoriasService categoriaService;
>>>>>>> jesus
	
	@Autowired
	public CategoriasController(CategoriasService categoriaService) {
		super();
		this.categoriaService = categoriaService;
	}

	
	
	@GetMapping
	public ArrayList<Categorias> getAllCategorias(){
		return categoriaService.getListaCategorias();
	}
	
	@GetMapping(path = "{Categoriasid}")
	public Categorias getCategoriasById(@PathVariable("Categoriasid") int id){
		return categoriaService.getCategorias(id);
	}
	
	@DeleteMapping(path = "{CategoriasId}")
	public Categorias deletecategoriesById(@PathVariable("CategoriasId") int id){
		return categoriaService.deleteCategorias(id);
<<<<<<< HEAD
>>>>>>> jesus
=======
>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
	}
	
	@PostMapping
	public Categorias addcategories(@RequestBody Categorias categorias) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		return categoriasService.addCategories(categorias);
=======
		return categoriaService.addCategorias(categorias);
>>>>>>> jesus
=======
		return categoriasService.addCategories(categorias);
>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
=======
		return categoriaService.addCategories(categorias);
>>>>>>> jesus
	}
	
	@PutMapping(path = "{CategoriasId}")
	public Categorias updatecategories(@PathVariable("CategoriasId") int id,
<<<<<<< HEAD
<<<<<<< HEAD
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String Tipodeproducto
=======
			@RequestParam(required=false) String Tipodeproducto,
			@RequestParam(required=false) String nombre
>>>>>>> jesus
=======
			@RequestParam(required=false) String Tipodeproducto,
			@RequestParam(required=false) String nombre
>>>>>>> 8407092e53b95f6a51ff262a3f253683ce48ca6b
			) {
	return categoriaService.updateCategorias(id, nombre, Tipodeproducto);
	}


	
	
	
}//class CategoriasController
