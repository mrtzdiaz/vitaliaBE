package com.vitalia.vitaliaBE.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.vitalia.vitaliaBE.model.Producto;

@Service
public class ProductoService {
	private static ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	
	

	public ProductoService(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
		listaProductos.add( new Producto("Shampoo Anticaída Romero y Sábila Árbol Verde (500 ml)",
			"Shampoo natural Anticaída combate la caída y estimula el crecimiento de tu cabello con ingredientes naturales",
			"https://res.cloudinary.com/duzdr4eb6/image/upload/v1719517036/productos/rvy4fjtnhlttjgl54k89.webp",410.00,"Shampoo"));
		listaProductos.add(new Producto("Eucalipto jarabe (140 ml)","Auxiliar en el tratamiento de Tos, Flemas, Resfriado Común","https://res.cloudinary.com/duzdr4eb6/image/upload/v1719517072/productos/te38c3ybfpkmuq7ec1qv.webp",100.00,"Medicamento Homeópata"));

	}


	public  ArrayList<Producto> getListaproductos() {
		return listaProductos;
	}
	
	public  Producto getProduct(int id) {
		Producto tmpProd=null;
		for (Producto producto : listaProductos) {
			if(producto.getId()==id) {
				tmpProd= producto;
				break;
			}
		}
		return tmpProd;
	}//getProduct
	


	
	

}
