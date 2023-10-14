package com.proyecto.proyectoFinal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Product")
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
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
    private double precio;



}
