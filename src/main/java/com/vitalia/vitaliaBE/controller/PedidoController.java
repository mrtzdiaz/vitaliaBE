package com.vitalia.vitaliaBE.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vitalia.vitaliaBE.model.Pedido;
import com.vitalia.vitaliaBE.service.PedidoService;


@RestController
@RequestMapping(path="/api/pedido/")
public class PedidoController {
	
	private final PedidoService pedidoService;
	
	
	@Autowired
	 public PedidoController(PedidoService pedidoService) {
		super();
		this.pedidoService = pedidoService;
	}


	@GetMapping
	    public ArrayList<Pedido> getAllPedido() {
	        return pedidoService.getAllPedido();
	    }
	    
	   
	    @GetMapping("{Pedidoid}")
	    public Pedido getPedidoById(@PathVariable("Pedidoid") int id) {
	    	return pedidoService.getPedido(id);
	    }
	    
	    
	    @DeleteMapping(path = "{Pedidoid}")
		public Pedido deletePedidoById(@PathVariable("Pedidoid") int id){
			return pedidoService.deletePedido(id);
		}
	    
	    
	    
	    
	    @PostMapping
	    public Pedido createPedido(@RequestBody Pedido pedido) {
	        return pedidoService.addPedido(pedido);
	    }
	    
	    
	    
	    @PutMapping("{Pedidoid}")
	    public Pedido updatePedido(@PathVariable ("Pedidoid")int id, 
	    		@RequestParam(required=false) String status,
				@RequestParam(required=false) String fechaPedido,
				@RequestParam(required=false) String fechaentrega,
				@RequestParam(required=false) String formaDePago
				) {
	    	return pedidoService.updatePedido(id,status,fechaPedido,fechaentrega,formaDePago);
	    }

	
}

