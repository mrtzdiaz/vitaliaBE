package com.vitalia.vitaliaBE.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.vitalia.vitaliaBE.model.DetallesPedido;

@Service
 public class DetallesPedidoService {
	 
	private ArrayList<DetallesPedido> listaDetallePedidos = new ArrayList<>();
    private static long nextId = 1;

	   {
	        // Ejemplos de detalles de pedido
	        listaDetallePedidos.add(new DetallesPedido(nextId++, 2, 350.00, 1, 1, 1, 1)); 
	        listaDetallePedidos.add(new DetallesPedido(nextId++, 1, 360.00, 2, 2, 2, 2)); 
	        listaDetallePedidos.add(new DetallesPedido(nextId++, 1, 180.00, 3, 3, 3, 3)); 
	        
	    }

	    public ArrayList<DetallesPedido> getListaDetallePedidos() {
	        return listaDetallePedidos;
	    }

	    public DetallesPedido getDetallesPedido(Long id) {
	        for (DetallesPedido detallePedido : listaDetallePedidos) {
	            if (detallePedido.getId()==(id)) {
	                return detallePedido;
	            }
	        }
	        return null; // Si no se encuentra el detalle del pedido
	    }

	    public void addDetallesPedido(DetallesPedido detallePedido) {
	        listaDetallePedidos.add(detallePedido);
	    }
	    
	    public void updateDetallesPedido(Long id, DetallesPedido updatedDetallesPedido) {
	        for (int i = 0; i < listaDetallePedidos.size(); i++) {
	            DetallesPedido dp = listaDetallePedidos.get(i);
	            if (dp.getId()==(id)) {
	                listaDetallePedidos.set(i, updatedDetallesPedido);
	                return;
	            }
	        }
	    }

	    public void deleteDetallesPedido(Long id) {
	        listaDetallePedidos.removeIf(dp -> dp.getId()==(id));
	    }
	}
