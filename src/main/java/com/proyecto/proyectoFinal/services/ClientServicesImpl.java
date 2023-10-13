package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Client;
import com.proyecto.proyectoFinal.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServicesImpl implements ClientServices {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> listAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
    @Override
    public void deleteClient(long id) {
        clientRepository.deleteById(id);
    }
    @Override
    public Optional<Client> findById(long id){
        return clientRepository.findById(id);
    }
}
