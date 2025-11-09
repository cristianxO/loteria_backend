package com.konex.loteria_backend.mapper;

import com.konex.loteria_backend.dto.BilleteDTO;
import com.konex.loteria_backend.model.Billete;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BilleteMapper {
    public BilleteDTO convertirBilleteABilleteDTO(Billete billete) {
        return new BilleteDTO(billete.getId(),billete.getNumero(),billete.getPrecio(),billete.getEstado());
    }

    public List<BilleteDTO> convertirBilletesABilletesDTO(List<Billete> billetes) {
        return billetes.stream().map(this::convertirBilleteABilleteDTO).toList();
    }
}
