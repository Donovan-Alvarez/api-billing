package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductServices {
    List<Producto> listProducts();
    Producto saveProduct(Producto producto);
    void deleteProduct(long id);
    Optional<Producto> findById(long id);

    Producto getProductById(Long id);
}
