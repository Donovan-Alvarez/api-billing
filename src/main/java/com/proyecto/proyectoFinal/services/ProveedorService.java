package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Proveedores;

import java.util.List;

public interface ProveedorService {
    List<Proveedores> listAllSuppliers();
    Proveedores saveSupplier(Proveedores proveedores);
    void deleteSupplier(long id);
}
