package com.konex.loteria_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SorteoDTO {
    private int id;
    private String nombreSorteo;
    private Date fechaSorteo;
    private List<BilleteDTO> billetes;
}
