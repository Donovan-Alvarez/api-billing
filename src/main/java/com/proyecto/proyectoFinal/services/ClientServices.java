package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientServices {
    List<Client> listAllClient();
    Client saveClient(Client client);

    void deleteClient(long id);

    Optional<Client> findById(long id);
}
