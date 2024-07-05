package com.vitalia.vitaliaBE.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vitalia.vitaliaBE.model.Categorias;






@Service
public class CategoriasService {
	private static ArrayList<Categorias> listaCategorias= new ArrayList<Categorias>();
	
	@Autowired
	public CategoriasService(ArrayList<Categorias> listaCategorias) {
		this.listaCategorias = listaCategorias;
		listaCategorias.add(new Categorias("Shampoo","Cuidado personal"));
		listaCategorias.add(new Categorias("Bebida","Suplementos alimenticios"));
		listaCategorias.add(new Categorias("Jarabe","Medicamento Homeópata"));
	}
	
	public ArrayList<Categorias> getListaCategorias(){
		return listaCategorias;
	}
	
	public Categorias getCategorias(int id) {
		Categorias tmpcat = null;
		for (Categorias categorias : listaCategorias) {
			if (categorias.getId()==id) {
				tmpcat = categorias;
				break;
			}
		}
		return tmpcat;
	}
	
	public Categorias deleteCategorias(int id) {
		Categorias tmpcat = null;
		for (Categorias categorias : listaCategorias) {
			if (categorias.getId()==id) {
				tmpcat = listaCategorias.remove(listaCategorias.indexOf(categorias));
				break;
			}
		}
		return tmpcat;
	}
	
	public  Categorias addCategories(Categorias categorias) {
		Categorias tmpcat=null;
		boolean existe=false;
		for (Categorias cat : listaCategorias) {
			if(cat.getNombre().equals(categorias.getNombre())) {
				existe=true;		
				break;
			}//if
		}//for
		if(!existe) {
			listaCategorias.add(categorias);
			tmpcat=categorias;
		}//if
		return tmpcat;
	}//addProduct
	
	public Categorias updateCategorias(int id, String nombre, String Tipodeproducto) {
		Categorias cat = null;
		for (Categorias categorias : listaCategorias) {
			if (categorias.getId()==id) {
				if(nombre !=null) categorias.setNombre(nombre);;
				if(Tipodeproducto !=null) categorias.setTipodeproducto(Tipodeproducto);;
				cat = categorias;
				break;
			}
		}
		return cat;
	}
	

		
	
	}//classCategoriasService
