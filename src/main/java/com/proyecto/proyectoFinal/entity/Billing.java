package com.proyecto.proyectoFinal.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Billing")
@Data
@SuperBuilder
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "billing_generator")
    @SequenceGenerator(name = "billing_generator", allocationSize = 1)
    private long id;
    @Column(name = "numeroFactura", nullable = false)
    private int numeroFactura;
    @Column(name = "fecha", nullable = false)
    private String fecha;
    @Column(name = "total", nullable = false)
    private double total;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "client_id")
    private Client client;

    public Billing(long id, int numeroFactura, String fecha, double total, Client client) {
        this.id = id;
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.total = total;
        this.client = client;
    }

    public Billing(){}
}
