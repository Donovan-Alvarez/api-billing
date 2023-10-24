package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Client;
import com.proyecto.proyectoFinal.entity.Proveedores;

import java.util.List;
import java.util.Optional;

public interface ProveedorService {
    List<Proveedores> listAllSuppliers();
    Proveedores saveSupplier(Proveedores proveedores);
    void deleteSupplier(long id);
    Optional<Proveedores> findById(long id);
}
