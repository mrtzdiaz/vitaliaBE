package com.vitalia.vitaliaBE.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitalia.vitaliaBE.model.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	Optional<Producto> findByNombre(String nombre);
	Optional<Producto> findByPrecio(Double precio);
}
