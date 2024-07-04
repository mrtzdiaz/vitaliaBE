package com.vitalia.vitaliaBE.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalia.vitaliaBE.model.Pedido;

@Service
public class PedidoService {
	
	private ArrayList<Pedido> listaPedido= new ArrayList<Pedido>();
	
	@Autowired
	public PedidoService() {
		listaPedido.add(new Pedido("Entregado","2024-06-13" ,"2024-06-18","tarjeta de credito"));
		listaPedido.add(new Pedido("Entregado", "2024-06-23" ,"2024-07-01","tarjeta de debito"));
		listaPedido.add(new Pedido("Cancelado", "2024-06-21" ,"2024-06-30","tarjeta de credito"));
		listaPedido.add(new Pedido("Proceso","2024-07-01" ,"2024-07-04","tarjeta de debito"));
	}
	
	public ArrayList<Pedido> getAllPedido(){
		return listaPedido;
	}

	public Pedido getPedido(int id) {
		Pedido ped = null;
		for (Pedido pedido : listaPedido) {
			if (pedido.getId()==id) {
				ped = pedido;
				break;
			}
		}
		return ped;
	}

	public Pedido deletePedido(int id) {
		Pedido ped = null;
		for (Pedido pedido : listaPedido) {
			if (pedido.getId()==id) {
				ped = listaPedido.remove(listaPedido.indexOf(pedido));
				break;
			}
		}
		return ped;
	}

	public Pedido addPedido(Pedido pedido) {
		listaPedido.add(pedido);
		return pedido;
	}

	public Pedido updatePedido(int id, String status, String fechaPedido, String fechaentrega, String formaDePago) {
		Pedido ped = null;
		
		for (Pedido pedido : listaPedido) {
			if (pedido.getId()==id) {
				if(status !=null) pedido.setStatus(status);
				if(fechaentrega !=null) pedido.setFechaPedido(fechaPedido);
				if(fechaentrega !=null) pedido.setFechaentrega(fechaentrega);
				ped = pedido;
				break;
			}
		}
		return ped;
	}
	
	
}
