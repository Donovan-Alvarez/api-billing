package com.proyecto.proyectoFinal.controller;

import com.proyecto.proyectoFinal.entity.Client;
import com.proyecto.proyectoFinal.entity.Producto;
import com.proyecto.proyectoFinal.entity.Proveedores;
import com.proyecto.proyectoFinal.services.ClientServices;
import com.proyecto.proyectoFinal.services.ProductServices;
import com.proyecto.proyectoFinal.services.ProveedorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
public class BillingController {
    @Autowired
    private ClientServices clientServices;
    @Autowired
    private ProveedorService proveedorService;
    @Autowired
    private ProductServices productServices;

    //Clientes
    @GetMapping("/list-clientes")
    public List<Client> listClient(){
        try {
            return clientServices.listAllClient();
        }catch (Exception e){
            LOGGER.error("ocurrio un error al listar los clientes", e);
            throw e;
        }
    }
    @GetMapping("/find-client/{id}")
    public Optional<Client> findClient(@PathVariable String id){
        try{
            return clientServices.findById(Long.parseLong(id));
        }catch (Exception e){
            LOGGER.error("Ocurrio un error al buscar cliente", e);
            throw e;
        }

    }


    @PostMapping("/save-client")
    public Client saveClient(@RequestBody Client client){
        try{
            var response = Client.builder()
                    .nombre(client.getNombre())
                    .apellido(client.getApellido())
                    .direccion(client.getDireccion())
                    .telefono(client.getTelefono())
                    .correo(client.getCorreo())
                    .nit(client.getNit())
                    .build();

            return clientServices.saveClient(response);
        }catch (Exception e){
            LOGGER.error("ocurrio un error al listar los clientes", e);
            throw e;
        }
    }
    @DeleteMapping("/delete-client/{id}")
    public String deleteClient(@PathVariable String id){
        try{
            clientServices.deleteClient(Long.parseLong(id));
            return "Se eliminó el dato correctamente";
        }catch (Exception e){
            LOGGER.error("ocurrio un error al eliminar el cliente");
            throw e;
        }
    }

    //Proveedores
    @GetMapping("/list-proveedores")
    public List<Proveedores> listSuppliers(){
        try {
            return proveedorService.listAllSuppliers();
        }catch (Exception e){
            LOGGER.error("ocurrio un error al listar proveedores");
            throw e;
        }
    }

    @PostMapping("/save-proveedor")
    public Proveedores saveSuppliers(@RequestBody Proveedores proveedores){
        try {
            var response = Proveedores.builder()
                    .nombre(proveedores.getNombre())
                    .descripcion(proveedores.getDescripcion())
                    .correo(proveedores.getCorreo())
                    .build();

            return proveedorService.saveSupplier(response);
        }catch (Exception e){
            LOGGER.error("ocurrio un error al guardar proveedor", e);
            throw e;
        }
    }

    @DeleteMapping("/delete-proveedor/{id}")
    public String deleteSuppliers(@PathVariable String id){
        try {
            proveedorService.deleteSupplier(Long.parseLong(id));
            return "Se ha eliminado correctamente el proveedor";
        }catch (Exception e){
            LOGGER.error("ocurrio un error al eliminar proveedor", e);
            throw e;
        }
    }

    //Producto
    @GetMapping("/list-producto")
    public List<Producto> listProduct(){
        try {
            return productServices.listProducts();
        }catch (Exception e){
            throw e;
        }
    }
    @PostMapping("/save-producto")
    public Producto saveProduct(@RequestBody Producto producto){
        try{
            var response = Producto.builder()
                    .nombre(producto.getNombre())
                    .stock(producto.getStock())
                    .precio(producto.getPrecio())
                    .build();
            return productServices.saveProduct(response);
        }catch (Exception e){
            throw e;
        }
    }
    @DeleteMapping("/delete-producto/{id}")
    public String deleteProduct(@PathVariable String id){
        try {
            productServices.deleteProduct(Long.parseLong(id));
            return "Se ha eliminado correctamente el producto";
        }catch (Exception e){
            throw e;
        }
    }

    @GetMapping("/find-product/{id}")
    public Optional<Producto> findProduct(@PathVariable String id){
        try {
            return productServices.findById(Long.parseLong(id));
        }catch (Exception e){
            throw e;
        }
    }


}