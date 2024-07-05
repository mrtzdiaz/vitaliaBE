package com.vitalia.vitaliaBE.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalia.vitaliaBE.model.Producto;
import com.vitalia.vitaliaBE.repository.ProductoRepository;

@Service
public class ProductoService {
	
	public final ProductoRepository productoRepository;

	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository=productoRepository;
	}//
	
	public List<Producto> getAllProductos(){
		return productoRepository.findAll();
	}//getAllProductos	
	
	public Producto getProduct(Long id) {
		return productoRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El producto con el Id ["+
						id+" ] no existe")
				);
	}//getProduct
	
	public Producto deleteProduct(Long id) {
		Producto tmpProd = null;
		if(productoRepository.existsById(id)) {
			tmpProd=productoRepository.findById(id).get();
			productoRepository.deleteById(id);			
		}//if
		return tmpProd;		
	}//deleteProduct

	public Producto addProduct(Producto producto) {
		Optional <Producto> tmpProd = productoRepository.findByNombre(producto.getNombre());
		if(tmpProd.isEmpty()) {
			return productoRepository.save(producto);
		}else {
			System.out.println("El producto ya existe");
			return null;
		}	
	}

	public Producto updateProduct(Long id, String nombre, String descripcion, String imagen, Double precio, Long categoria_id) {
		Producto tmpProd = null;
		
			if(productoRepository.existsById(id)) {
				Producto producto = productoRepository.findById(id).get();
				if(nombre!=null)producto.setNombre(nombre);
				if(descripcion!=null)producto.setDescripcion(descripcion);
				if(imagen!=null)producto.setImagen(imagen);
				if(precio!=null)producto.setPrecio(precio);
				if(precio!=null)producto.setCategoria_id(categoria_id);;
				productoRepository.save(producto);
				tmpProd=producto;
			}		
		return tmpProd;
	}


	
	

}
