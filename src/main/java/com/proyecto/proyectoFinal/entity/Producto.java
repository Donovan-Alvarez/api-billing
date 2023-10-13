package com.proyecto.proyectoFinal.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "Product")
@Data
@SuperBuilder
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Column(name = "stock", nullable = false, length = 10)
    private int stock;
    @Column(name = "precio", nullable = false)
    private int precio;

    public Producto(){}

    public Producto(long id, String nombre, int stock, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }
}
