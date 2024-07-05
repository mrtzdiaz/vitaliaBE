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

import com.vitalia.vitaliaBE.model.DetallesPedido;
import com.vitalia.vitaliaBE.service.DetallesPedidoService;

@RestController
@RequestMapping("/api/detallespedido/")
public class DetallesPedidoController {
	
	private final DetallesPedidoService detallesPedidoService;
	
	@Autowired
    public DetallesPedidoController(DetallesPedidoService detallesPedidoService) {
		super();
		this.detallesPedidoService = detallesPedidoService;
	}

	// GET: Obtener todos los detalles de pedidos 
    @GetMapping
    public ArrayList<DetallesPedido> getAllDetallePedidos() {
        return detallesPedidoService.getAllDetallesPedido();
    }
    
    // GET: Obtener un detalle de pedido por ID 
    @GetMapping("{Detallespedidoid}")
    public DetallesPedido getDetallePedidoById(@PathVariable("Detallespedidoid") int id) {
    	return detallesPedidoService.getDetallesPedido(id);
    }
    
    
    @DeleteMapping(path = "{Detallespedidoid}")
	public DetallesPedido deleteProductById(@PathVariable("Detallespedidoid") int id){
		return detallesPedidoService.deleteDetallesPedido(id);
	}
    
    
    
    // POST: Crear un nuevo detalle de pedido 
    @PostMapping
    public DetallesPedido createDetallePedido(@RequestBody DetallesPedido detallePedido) {
        return detallesPedidoService.addDetallesPedido(detallePedido);
    }
    
    // PUT: Actualizar un detalle de pedido existente
    @PutMapping("{Detallespedidoid}")
    public DetallesPedido updateDetallesPedido(@PathVariable ("Detallespedidoid")int id, 
    		@RequestParam(required=false) int cantidadOrdenada,
			@RequestParam(required=false) double precio,
			@RequestParam(required=false) double total
			) {
    	return detallesPedidoService.updateDetallesPedido(id, total, cantidadOrdenada, precio, cantidadOrdenada, cantidadOrdenada, cantidadOrdenada, cantidadOrdenada);
    }
   
   
}// clas DetallesPedidoController
