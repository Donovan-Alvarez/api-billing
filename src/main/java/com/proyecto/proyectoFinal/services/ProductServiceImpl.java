package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Producto;
import com.proyecto.proyectoFinal.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductServices{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Producto> listProducts() {
        return productRepository.findAll();
    }

    @Override
    public Producto saveProduct(Producto producto) {
        return productRepository.save(producto);
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Producto> findById(long id) {
        return productRepository.findById(id);
    }
}
