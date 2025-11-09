package com.konex.loteria_backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(nullable = false)
    private String nombre;

    @Email
    @Column(nullable = false, unique = true)
    private String correo;

    @OneToMany(mappedBy = "duenio")
    private List<Billete> billetes;
}
