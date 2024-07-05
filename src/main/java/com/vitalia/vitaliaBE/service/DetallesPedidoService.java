package com.vitalia.vitaliaBE.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalia.vitaliaBE.model.DetallesPedido;


@Service
 public class DetallesPedidoService {
	 
	private ArrayList<DetallesPedido> listaDetallePedidos = new ArrayList<>();
	   
	      // Ejemplos de detalles de pedido
	       @Autowired
		   public DetallesPedidoService() { 
	        listaDetallePedidos.add(new DetallesPedido(700.00, 2, 350.00, 1, 1, 1, 1)); 
	        listaDetallePedidos.add(new DetallesPedido(360.00, 1, 360.00, 2, 2, 2, 2)); 
	        listaDetallePedidos.add(new DetallesPedido(180.00, 1, 180.00, 3, 3, 3, 3)); 
		   }
	    
	       public ArrayList<DetallesPedido> getAllDetallesPedido(){
	   		return listaDetallePedidos;
	   	}

	   	public DetallesPedido getDetallesPedido(int id) {
	   		DetallesPedido dped = null;
	   		for (DetallesPedido detallesPedido : listaDetallePedidos) {
	   			if (detallesPedido.getId()==id) {
	   				dped = detallesPedido;
	   				break;
	   			}
	   		}
	   		return dped;
	   	}

	   	public DetallesPedido deleteDetallesPedido(int id) {
	   		DetallesPedido dped = null;
	   		
	   		for (DetallesPedido detallesPedido : listaDetallePedidos) {
	   			if (detallesPedido.getId()==id) {
	   				dped = listaDetallePedidos.remove(listaDetallePedidos.indexOf(detallesPedido));
	   				break;
	   			}
	   		}
	   		return dped;
	   	}

	   	public DetallesPedido addDetallesPedido(DetallesPedido detallesPedido) {
	   		listaDetallePedidos.add(detallesPedido);
	   		return detallesPedido;
	   	}

	   	public DetallesPedido updateDetallesPedido(int id, double total, int cantidadOrdenada, double precio) {
	   		DetallesPedido dped = null;
	   		
	   		for (DetallesPedido detallesPedido : listaDetallePedidos) {
	   			if (detallesPedido.getId()==id) {
	   				if(total !=0) detallesPedido.setTotal(total);
	   				if(cantidadOrdenada !=0) detallesPedido.setCantidadOrdenada(cantidadOrdenada);
	   				if(precio !=0) detallesPedido.setPrecio(precio);
	
	   				dped = detallesPedido;
	   				break;
	   			}
	   		}
	   		return dped;
	   	}
	   	

}
	
