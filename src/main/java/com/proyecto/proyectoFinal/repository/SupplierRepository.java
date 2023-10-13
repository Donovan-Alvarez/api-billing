package com.proyecto.proyectoFinal.repository;

import com.proyecto.proyectoFinal.entity.Producto;
import com.proyecto.proyectoFinal.entity.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Proveedores, Long> {
}
