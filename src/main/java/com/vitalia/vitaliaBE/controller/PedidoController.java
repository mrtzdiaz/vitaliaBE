package com.vitalia.vitaliaBE.controller;

import java.util.ArrayList;
import java.util.Date;

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

@RestController
@RequestMapping(path="/api/productos/")
public class PedidoController {
	
	
	 @GetMapping
	    public ArrayList<Pedido> getAllPedido() {
	        return null;
	    }
	    
	   
	    @GetMapping("/{Pedidoid}")
	    public Pedido getPedidoById(@PathVariable("Pedidoid") Long id) {
	    	return null;
	    }
	    
	    
	    @DeleteMapping(path = "{Pedidoid}")
		public Pedido deletePedidoById(@PathVariable("Pedidoid") Long id){
			return null;
		}
	    
	    
	    
	    
	    @PostMapping
	    public Pedido createPedido(@RequestBody Pedido pedido) {
	        return null;
	    }
	    
	    
	    
	    @PutMapping("/{Pedidoid}")
	    public Pedido updatePedido(@PathVariable ("Pedidoid")Long id, 
	    		@RequestParam(required=false) String status,
				@RequestParam(required=false) Date fechaPedido,
				@RequestParam(required=false) Date fechaentrega,
				@RequestParam(required=false) String formaDePago
				) {
	    	return null;
	    }

	
}

