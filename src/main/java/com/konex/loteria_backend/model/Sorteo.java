package com.konex.loteria_backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sorteo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(nullable = false)
    private String nombreSorteo;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaSorteo;

    @OneToMany(mappedBy = "sorteo")
    private List<Billete> billetes;
}
