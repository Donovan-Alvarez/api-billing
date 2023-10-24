package com.proyecto.proyectoFinal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Clients")
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class  Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
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

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Billing> billing = new ArrayList<>();

}
