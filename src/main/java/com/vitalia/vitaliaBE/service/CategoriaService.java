package com.vitalia.vitaliaBE.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalia.vitaliaBE.model.Categorias;


@Service
public class CategoriaService {
	
private ArrayList<Categorias> listaCategorias= new ArrayList<Categorias>();
	
	@Autowired
	public CategoriaService() {
		listaCategorias.add(new Categorias("Colageno Hidrolizado Tabs. 200mg","Suplementos"));
		listaCategorias.add(new Categorias("Te verde en polvo","Suplementos"));
		listaCategorias.add(new Categorias("Capsulas de higado de bacalao 500mg.","Vitaminas"));
		listaCategorias.add(new Categorias("Multicomplejo B","Vitaminas"));
		
	}
	
	public ArrayList<Categorias> getAllCategorias(){
		return listaCategorias;
	}

	public Categorias getCategorias(int id) {
		Categorias cat = null;
		for (Categorias categorias : listaCategorias) {
			if (categorias.getId()==id) {
				cat = categorias;
				break;
			}
		}
		return cat;
	}

	public Categorias deleteCategorias(int id) {
		Categorias cat = null;
		for (Categorias categorias : listaCategorias) {
			if (categorias.getId()==id) {
				cat = listaCategorias.remove(listaCategorias.indexOf(categorias));
				break;
			}
		}
		return cat;
	}

	public Categorias addCategorias(Categorias categorias) {
		listaCategorias.add(categorias);
		return categorias;
	}

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


}
