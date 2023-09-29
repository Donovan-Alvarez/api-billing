package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Client;

import java.util.List;
public interface ClientServices {
    public List<Client> listAllClient();
    public Client saveClient(Client client);
}
