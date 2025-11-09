package com.konex.loteria_backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Billete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(nullable = false)
    private int numero;

    @NotNull
    @Column(nullable = false)
    private double precio;

    @Enumerated(EnumType.STRING)
    private EstadoBillete estado;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente duenio;

    @ManyToOne
    @JoinColumn(name = "sorteo_id")
    private Sorteo sorteo;

}
