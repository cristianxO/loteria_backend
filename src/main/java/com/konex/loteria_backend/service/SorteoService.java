package com.konex.loteria_backend.service;

import com.konex.loteria_backend.dto.SorteoDTO;
import com.konex.loteria_backend.mapper.SorteoMapper;
import com.konex.loteria_backend.model.Sorteo;
import com.konex.loteria_backend.repository.SorteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorteoService {

    private final SorteoRepository sorteoRepository;

    private final SorteoMapper sorteoMapper;

    public SorteoService(SorteoRepository sorteoRepository, SorteoMapper sorteoMapper) {
        this.sorteoRepository = sorteoRepository;
        this.sorteoMapper = sorteoMapper;
    }

    public Sorteo crearSorteo(Sorteo sorteo) {
        return sorteoRepository.save(sorteo);
    }

    public List<SorteoDTO> listarSorteos() {
        return sorteoMapper.convertirSorteosASorteosDTO(sorteoRepository.findAll());
    }
}
