package com.vitalia.vitaliaBE.repository;
import java.util.Optional;


import com.vitalia.vitaliaBE.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long>{
	Optional<Categorias>findByNombre(String nombre);
}//CategoriasRepository
