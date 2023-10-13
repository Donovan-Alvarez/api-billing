package com.proyecto.proyectoFinal.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "Clients")
@SuperBuilder
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "client_generator", allocationSize = 1)
    private int id;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 30)
    private String apellido;
    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;
    @Column(name = "telefono", nullable = false)
    private Integer telefono;
    @Column(name = "correo", nullable = false, length = 50)
    private String correo;
    @Column(name = "nit", nullable = false)
    private Integer nit;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Billing billing;


    public Client(int id, String nombre, String apellido, String direccion, Integer telefono, String correo, Integer nit, Billing billing) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.nit = nit;
        this.billing = billing;
    }

    public Client() {}

}
