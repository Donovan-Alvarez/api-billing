package com.proyecto.proyectoFinal.controller;

import com.proyecto.proyectoFinal.entity.Client;
import com.proyecto.proyectoFinal.repository.ClientRepository;
import com.proyecto.proyectoFinal.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientServices clientServices;

    @GetMapping("/clientes")
    public List<Client> listClient(){
        try {
            return clientServices.listAllClient();
        }catch (Exception e){
            throw e;
        }
    }

    @PostMapping("/save-client")
    public Client saveClient(@RequestBody Client client){
        var response = Client.builder()
                .nombre(client.getNombre())
                .apellido(client.getApellido())
                .direccion(client.getDireccion())
                .telefono(client.getTelefono())
                .correo(client.getCorreo())
                .nit(client.getNit())
                .build();

        return clientServices.saveClient(response);
    }


}
