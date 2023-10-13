package com.proyecto.proyectoFinal.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "Suppliers")
@SuperBuilder
@Data
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;
    @Column(name = "correo", nullable = false, length = 50)
    private String correo;

    public Proveedores(String nombre, String descripcion, String correo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.correo = correo;
    }

    public Proveedores(){}

    public Proveedores(long id, String nombre, String descripcion, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.correo = correo;
    }
}
