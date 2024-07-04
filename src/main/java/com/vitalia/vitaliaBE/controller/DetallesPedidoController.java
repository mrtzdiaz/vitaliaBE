package com.vitalia.vitaliaBE.controller;

import java.util.ArrayList;

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
import com.vitalia.vitaliaBE.model.Producto;

@RestController
@RequestMapping("/api/detallesPedido")
public class DetallesPedidoController {
	
    // GET: Obtener todos los detalles de pedidos 
    @GetMapping
    public ArrayList<DetallesPedido> getAllDetallePedidos() {
        return null;
    }
    
    // GET: Obtener un detalle de pedido por ID 
    @GetMapping("/{Detallespedidoid}")
    public DetallesPedido getDetallePedidoById(@PathVariable("Detallespedidoid") Long id) {
    	return null;
    }
    
    
    @DeleteMapping(path = "{Detallespedidoid}")
	public Producto deleteProductById(@PathVariable("Detallespedidoid") Long id){
		return null;
	}
    
    
    
    // POST: Crear un nuevo detalle de pedido 
    @PostMapping
    public DetallesPedido createDetallePedido(@RequestBody DetallesPedido detallePedido) {
        return null;
    }
    
    // PUT: Actualizar un detalle de pedido existente
    @PutMapping("/{Detallespedidoid}")
    public DetallesPedido updateDetallesPedido(@PathVariable ("Detallespedidoid")Long id, 
    		@RequestParam(required=false) String cantidadOrdenada,
			@RequestParam(required=false) Double precio,
			@RequestParam(required=false) String PedidoUsuarioidUsuario,
			@RequestParam(required=false) Double total,
			@RequestParam(required=false) String ProductosCategoriaidCategoria
			) {
    	return null;
    }
   
   
}// clas DetallesPedidoController
