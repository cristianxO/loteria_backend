package com.konex.loteria_backend.mapper;

import com.konex.loteria_backend.dto.SorteoDTO;
import com.konex.loteria_backend.model.Sorteo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SorteoMapper {

    private final BilleteMapper billeteMapper;

    public SorteoMapper(BilleteMapper billeteMapper) {
        this.billeteMapper = billeteMapper;
    }

    public SorteoDTO convertirSorteoASorteoDTO(Sorteo sorteo) {
        return new SorteoDTO(sorteo.getId(),
                            sorteo.getNombreSorteo(),
                            sorteo.getFechaSorteo(),
                            billeteMapper.convertirBilletesABilletesDTO(sorteo.getBilletes()));
    }

    public List<SorteoDTO> convertirSorteosASorteosDTO(List<Sorteo> sorteos) {
        return sorteos.stream().map(this::convertirSorteoASorteoDTO).toList();
    }
}
