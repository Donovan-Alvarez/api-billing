package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Proveedores;
import com.proyecto.proyectoFinal.repository.ClientRepository;
import com.proyecto.proyectoFinal.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServicesImpl implements ProveedorService {
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Proveedores> listAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Proveedores saveSupplier(Proveedores proveedores) {
        return supplierRepository.save(proveedores);
    }

    @Override
    public void deleteSupplier(long id) {
        supplierRepository.deleteById(id);
    }
}
