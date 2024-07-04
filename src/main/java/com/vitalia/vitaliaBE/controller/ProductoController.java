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

import com.vitalia.vitaliaBE.model.Producto;
import com.vitalia.vitaliaBE.service.ProductoService;

@RestController
@RequestMapping(path="/api/productos/")
public class ProductoController {
	
	private final ProductoService productoService;
	
	
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}

	@GetMapping
	public ArrayList<Producto> getProducts(){
		return productoService.getListaproductos();
	}
	
	@GetMapping(path = "{productoId}")
	public Producto getProductById(@PathVariable("productoId") int id){
		return productoService.getProduct(id);
	}
	
	@DeleteMapping(path = "{ProductoId}")
	public Producto deleteProductById(@PathVariable("ProductoId") int id){
		return productoService.deleteProduct(id);
	}
	
	@PostMapping
	public Producto addProduct(@RequestBody Producto producto) {
		return productoService.addProduct(producto);
	}
	
	@PutMapping(path = "{ProductoId}")
	public Producto updateProduct(@PathVariable("ProductoId") int id,
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String descripcion,
			@RequestParam(required=false) String imagen,
			@RequestParam(required=false) Double precio,
			@RequestParam(required=false) String categoria
			) {
	return null;
	}

}
