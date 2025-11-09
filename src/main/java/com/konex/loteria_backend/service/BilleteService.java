package com.konex.loteria_backend.service;

import com.konex.loteria_backend.dto.BilleteDTO;
import com.konex.loteria_backend.exception.SorteoNoExistenteException;
import com.konex.loteria_backend.mapper.BilleteMapper;
import com.konex.loteria_backend.model.Billete;
import com.konex.loteria_backend.model.EstadoBillete;
import com.konex.loteria_backend.model.Sorteo;
import com.konex.loteria_backend.repository.BilleteRepository;
import com.konex.loteria_backend.repository.SorteoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BilleteService {

    private final BilleteRepository billeteRepository;

    private final SorteoRepository sorteoRepository;

    private final BilleteMapper billeteMapper;

    public BilleteService(BilleteRepository billeteRepository, SorteoRepository sorteoRepository, BilleteMapper billeteMapper) {
        this.billeteRepository = billeteRepository;
        this.sorteoRepository = sorteoRepository;
        this.billeteMapper = billeteMapper;
    }

    public BilleteDTO crearBillete(Billete billete, int idSorteo) {
        Optional<Sorteo> sorteo = sorteoRepository.findById(idSorteo);
        if (sorteo.isEmpty()) {
            throw new SorteoNoExistenteException("El sorteo al que desea asociar no existe.");
        }
        billete.setEstado(EstadoBillete.DISPONIBLE);
        billete.setSorteo(sorteo.get());
        billeteRepository.save(billete);
        return billeteMapper.convertirBilleteABilleteDTO(billete);
    }
}
