package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Billing;
import com.proyecto.proyectoFinal.entity.Client;
import com.proyecto.proyectoFinal.entity.Producto;

import java.util.List;

public interface BillingService {
    List<Billing> listBilling();
    Billing saveBilling(Billing billing, Client client, Producto producto);
}
