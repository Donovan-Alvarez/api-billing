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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "numeroFactura", nullable = false)
    private int numeroFactura;
    @OneToOne
    private Client client;
    @Column(name = "fecha", nullable = false)
    private String fecha;
    @ManyToOne(targetEntity = Producto.class, cascade=CascadeType.ALL)
    @JoinColumns({ @JoinColumn(name = "product_id", referencedColumnName = "id") })
    private Producto producto;
    @Column(name = "total", nullable = false)
    private double total;

    public Billing(long id, int numeroFactura, Client client, String fecha, Producto producto, double total) {
        this.id = id;
        this.numeroFactura = numeroFactura;
        this.client = client;
        this.fecha = fecha;
        this.producto = producto;
        this.total = total;
    }

    public Billing(){}
}
