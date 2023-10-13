package com.proyecto.proyectoFinal.repository;

import com.proyecto.proyectoFinal.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {
}
