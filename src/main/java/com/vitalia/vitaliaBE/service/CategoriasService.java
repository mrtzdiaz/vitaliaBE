package com.vitalia.vitaliaBE.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vitalia.vitaliaBE.model.Categorias;
import com.vitalia.vitaliaBE.repository.CategoriasRepository;







@Service
public class CategoriasService {
	private final CategoriasRepository categoriasRepository;
	
	@Autowired
	public CategoriasService(CategoriasRepository categoriasRepository) {
		this.categoriasRepository = categoriasRepository;
	}
	
	public List<Categorias> getAllCategories(){
		return categoriasRepository.findAll();
	}
	
	public Categorias getCategories(Long id) {
		return categoriasRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("La Categoria con el Id ["+
						id+" ] no existe")
				);
	}//getCategorias
	
		
	
	public Categorias deleteCategorias(Long id) {
		Categorias tmpcat = null;
		if(categoriasRepository.existsById(id)) {
			tmpcat=categoriasRepository.findById(id).get();
			categoriasRepository.deleteById(id);			
		}//if
		return tmpcat;		
	}//deleteProduct
	
	public  Categorias addCategories(Categorias categorias) {
		Optional <Categorias> tmpcat = categoriasRepository.findByNombre(categorias.getNombre());
		if(tmpcat.isEmpty()) {
			return categoriasRepository.save(categorias);
		}else {
			System.out.println("La categoria ya existe ya existe");
			return null;
		}	
	}//addCategories
	
	public Categorias updateCategorias(long id, String nombre, String Tipodeproducto) {
		Categorias tmpcat = null;
		
		if(categoriasRepository.existsById(id)) {
			Categorias categorias = categoriasRepository.findById(id).get();
			if(nombre!=null)categorias.setNombre(nombre);
			if(Tipodeproducto!=null)categorias.setTipodeproducto(Tipodeproducto);;
	
			categoriasRepository.save(categorias);
			tmpcat=categorias;
		}		
	return tmpcat;
}
	

		
	
	}//classCategoriasService
