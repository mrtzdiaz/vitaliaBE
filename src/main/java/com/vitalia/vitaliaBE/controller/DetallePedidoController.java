package com.vitalia.vitaliaBE.controller;

import com.vitalia.vitaliaBE.model.DetallePedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/detallePedidos")

public class DetallePedidoController {

    private ArrayList<DetallePedido> detallePedidos = new ArrayList<>();

    // GET: Obtener todos los detalles de pedidos 
    @GetMapping
    public ArrayList<DetallePedido> getAllDetallePedidos() {
        return null;
    }

    // GET: Obtener un detalle de pedido por ID 
    @GetMapping("/{id}")
    public DetallePedido getDetallePedidoById(@PathVariable Long id) {
    	return null;
    }

    // POST: Crear un nuevo detalle de pedido 
    @PostMapping
    public DetallePedido createDetallePedido(@RequestBody DetallePedido detallePedido) {
        return null;
    }

    // PUT: Actualizar un detalle de pedido existente
    @PutMapping("/{id}")
    public DetallePedido updateDetallePedido(@PathVariable Long id, @RequestBody DetallePedido detallePedidoDetails) {
    	return null;
    }

    // DELETE: Eliminar un detalle de pedido 
    @DeleteMapping("/{id}")
    public DetallePedido deleteDetallePedido(@PathVariable Long id) {
    	return null;
    }
}
