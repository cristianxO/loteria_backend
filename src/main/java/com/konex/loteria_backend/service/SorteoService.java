package com.konex.loteria_backend.service;

import com.konex.loteria_backend.model.Sorteo;
import com.konex.loteria_backend.repository.SorteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorteoService {

    private final SorteoRepository sorteoRepository;

    public SorteoService(SorteoRepository sorteoRepository) {
        this.sorteoRepository = sorteoRepository;
    }

    public Sorteo crearSorteo(Sorteo sorteo) {
        return sorteoRepository.save(sorteo);
    }

    public List<Sorteo> listarSorteos() {
        return sorteoRepository.findAll();
    }
}
