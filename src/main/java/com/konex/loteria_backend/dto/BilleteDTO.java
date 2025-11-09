package com.konex.loteria_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BilleteDTO {
    private int id;
    private int numero;
    private double precio;
    private boolean estado;
}
