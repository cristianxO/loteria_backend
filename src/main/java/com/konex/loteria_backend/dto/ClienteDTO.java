package com.konex.loteria_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {
    private int id;
    private String nombre;
    private String correo;
    private List<BilleteDTO> billetes;
}
