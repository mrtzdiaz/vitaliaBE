package com.vitalia.vitaliaBE.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalia.vitaliaBE.model.DetallesPedido;
import com.vitalia.vitaliaBE.repository.DetallesPedidoRepository;

@Service
public class DetallesPedidoService {

    private final DetallesPedidoRepository detallesPedidoRepository;

    @Autowired
    public DetallesPedidoService(DetallesPedidoRepository detallesPedidoRepository) {
        this.detallesPedidoRepository = detallesPedidoRepository;
    }

    public List<DetallesPedido> getAllDetallesPedido() {
        return detallesPedidoRepository.findAll();
    }

    public Optional<DetallesPedido> getDetallesPedido(Long id) {
        return detallesPedidoRepository.findById(id);
    }

    public void deleteDetallesPedido(Long id) {
        detallesPedidoRepository.deleteById(id);
    }

    public DetallesPedido addDetallesPedido(DetallesPedido detallesPedido) {
        return detallesPedidoRepository.save(detallesPedido);
    }

    public DetallesPedido updateDetallesPedido(Long id, double total, int cantidadOrdenada, double precio) {
        Optional<DetallesPedido> optionalDetallesPedido = detallesPedidoRepository.findById(id);
        if (optionalDetallesPedido.isPresent()) {
            DetallesPedido detallesPedido = optionalDetallesPedido.get();
            if (total != 0) detallesPedido.setTotal(total);
            if (cantidadOrdenada != 0) detallesPedido.setCantidadOrdenada(cantidadOrdenada);
            if (precio != 0) detallesPedido.setPrecio(precio);
            return detallesPedidoRepository.save(detallesPedido);
        }
        return null;
    }
}
	
