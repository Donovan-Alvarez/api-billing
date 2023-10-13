package com.proyecto.proyectoFinal.repository;

import com.proyecto.proyectoFinal.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Producto, Long> {
}
