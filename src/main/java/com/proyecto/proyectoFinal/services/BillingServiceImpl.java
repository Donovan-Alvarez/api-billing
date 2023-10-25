package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Billing;
import com.proyecto.proyectoFinal.entity.Client;
import com.proyecto.proyectoFinal.entity.Producto;
import com.proyecto.proyectoFinal.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingServiceImpl implements BillingService{
    @Autowired
    private BillingRepository billingRepository;
    @Override
    public List<Billing> listBilling() {
        return billingRepository.findAll();
    }

    @Override
    public Billing saveBilling(Billing billing, Client client, Producto producto) {
        return billingRepository.save(billing);
    }
}
