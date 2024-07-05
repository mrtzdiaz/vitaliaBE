package com.vitalia.vitaliaBE.controller;

import java.util.List;
import java.util.Optional;

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
        this.detallesPedidoService = detallesPedidoService;
    }

    // GET: Obtener todos los detalles de pedidos 
    @GetMapping
    public List<DetallesPedido> getAllDetallePedidos() {
        return detallesPedidoService.getAllDetallesPedido();
    }

    // GET: Obtener un detalle de pedido por ID 
    @GetMapping("{detallespedidoid}")
    public Optional<DetallesPedido> getDetallePedidoById(@PathVariable("detallespedidoid") Long id) {
        return detallesPedidoService.getDetallesPedido(id);
    }

    // DELETE: Eliminar un detalle de pedido por ID
    @DeleteMapping("{detallespedidoid}")
    public void deleteProductById(@PathVariable("detallespedidoid") Long id) {
        detallesPedidoService.deleteDetallesPedido(id);
    }

    // POST: Crear un nuevo detalle de pedido 
    @PostMapping
    public DetallesPedido createDetallePedido(@RequestBody DetallesPedido detallePedido) {
        return detallesPedidoService.addDetallesPedido(detallePedido);
    }

    // PUT: Actualizar un detalle de pedido existente
    @PutMapping("{detallespedidoid}")
    public DetallesPedido updateDetallesPedido(@PathVariable("detallespedidoid") Long id,
                                               @RequestParam(required = false) int cantidadOrdenada,
                                               @RequestParam(required = false) double precio,
                                               @RequestParam(required = false) double total) {
        return detallesPedidoService.updateDetallesPedido(id, total, cantidadOrdenada, precio);
    }
    }