package com.proyecto.proyectoFinal.services;

import com.proyecto.proyectoFinal.entity.Billing;

import java.util.List;

public interface BillingService {
    List<Billing> listBilling();
    Billing saveBilling(Billing billing);
}
