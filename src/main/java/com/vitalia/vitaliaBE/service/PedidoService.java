package com.vitalia.vitaliaBE.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalia.vitaliaBE.model.Pedido;
import com.vitalia.vitaliaBE.repository.PedidoRepository;

@Service
public class PedidoService {
	
	public final PedidoRepository pedidoRepository;
	
	
	@Autowired
	public PedidoService(PedidoRepository pedidoRepository) {
	 this.pedidoRepository=pedidoRepository;
	}
	
	public List<Pedido> getAllPedido(){
		return pedidoRepository.findAll();
	}

	public Pedido getPedido(Long id) {
		
		return pedidoRepository.findById(id).orElseThrow(
				()->new IllegalArgumentException("El pedido con el id [" + id + "] no existe")
	);
	}

	public Pedido deletePedido(Long id) {
		Pedido ped = null;
		if(pedidoRepository.existsById(id)) {
			ped = pedidoRepository.findById(id).get();
			pedidoRepository.deleteById(id);
		}
		
		return ped;
	}

	public Pedido addPedido(Pedido pedido) {
		Optional<Pedido> ped= 
				pedidoRepository.findByStatus(pedido.getStatus());
		if(ped.isEmpty()) {
			return pedidoRepository.save(pedido);
		} else {
			System.out.println("el pedido con el status ["+pedido.getStatus()+"] ya existe");
			return null;
		}
	}

	public Pedido updatePedido(Long id, String status, String fechaPedido, String fechaentrega, String formaDePago) {
		Pedido ped = null;
			if (pedidoRepository.existsById(id)) {
				Pedido pedido =pedidoRepository.findById(id).get();
				if(status !=null) pedido.setStatus(status);
				if(fechaentrega !=null) pedido.setFechaentrega(null);
				if(fechaentrega !=null) pedido.setFechaentrega(null);
				pedidoRepository.save(pedido);
				ped = pedido;
				
			}
		
		return ped;
	}
	
	
}
