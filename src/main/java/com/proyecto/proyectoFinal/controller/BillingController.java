package com.proyecto.proyectoFinal.controller;

import com.proyecto.proyectoFinal.entity.Billing;
import com.proyecto.proyectoFinal.entity.Client;
import com.proyecto.proyectoFinal.entity.Producto;
import com.proyecto.proyectoFinal.entity.Proveedores;
import com.proyecto.proyectoFinal.services.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@Slf4j
public class BillingController {
    @Autowired
    private ClientServices clientServices;
    @Autowired
    private ProveedorService proveedorService;
    @Autowired
    private ProductServices productServices;
    @Autowired
    private BillingService billingService;

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
            LOGGER.info("REQUEST CLIENTE " + client);
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
    public void deleteClient(@PathVariable String id){
        try{
            clientServices.deleteClient(Long.parseLong(id));
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
    public void deleteSuppliers(@PathVariable String id){
        try {
            proveedorService.deleteSupplier(Long.parseLong(id));
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
            return productServices.saveProduct(producto);
        }catch (Exception e){
            throw e;
        }
    }
    @DeleteMapping("/delete-producto/{id}")
    public void deleteProduct(@PathVariable String id){
        try {
            productServices.deleteProduct(Long.parseLong(id));
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

    //Factuación
    @PostMapping("/save-facturacion")
    public Billing saveBilling (@RequestBody Billing billing){
        try{
            LOGGER.info("REQUEST" +  billing);
            var response = billingService.saveBilling(billing);
            return response;
        }catch (Exception e){
            throw e;
        }
    }

    @GetMapping("/list-facturacion")
    public List<Billing> listBilling(){
        try {
            return billingService.listBilling();
        }catch (Exception e){
            throw e;
        }
    }

}
