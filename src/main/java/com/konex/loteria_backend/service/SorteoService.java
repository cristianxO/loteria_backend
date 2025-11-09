package com.konex.loteria_backend.service;

import com.konex.loteria_backend.dto.BilleteDTO;
import com.konex.loteria_backend.dto.SorteoDTO;
import com.konex.loteria_backend.exception.BilleteNoExistenteException;
import com.konex.loteria_backend.exception.SorteoNoExistenteException;
import com.konex.loteria_backend.mapper.BilleteMapper;
import com.konex.loteria_backend.mapper.SorteoMapper;
import com.konex.loteria_backend.model.Billete;
import com.konex.loteria_backend.model.Cliente;
import com.konex.loteria_backend.model.Sorteo;
import com.konex.loteria_backend.repository.BilleteRepository;
import com.konex.loteria_backend.repository.ClienteRepository;
import com.konex.loteria_backend.repository.SorteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SorteoService {

    private final SorteoRepository sorteoRepository;

    private final ClienteRepository clienteRepository;

    private final BilleteRepository billeteRepository;

    private final SorteoMapper sorteoMapper;

    private final BilleteMapper billeteMapper;

    public SorteoService(SorteoRepository sorteoRepository, SorteoMapper sorteoMapper, ClienteRepository clienteRepository, BilleteRepository billeteRepository, BilleteMapper billeteMapper) {
        this.sorteoRepository = sorteoRepository;
        this.clienteRepository = clienteRepository;
        this.billeteRepository = billeteRepository;
        this.sorteoMapper = sorteoMapper;
        this.billeteMapper = billeteMapper;
    }

    public SorteoDTO crearSorteo(Sorteo sorteo) {
        Sorteo sorteoGuardado = sorteoRepository.save(sorteo);
        return sorteoMapper.convertirSorteoASorteoDTO(sorteoGuardado);
    }

    public List<SorteoDTO> listarSorteos() {
        return sorteoMapper.convertirSorteosASorteosDTO(sorteoRepository.findAll());
    }

    public BilleteDTO venderBillete(int idSorteo, int idCliente, int idBillete) {
        Optional<Cliente> cliente = clienteRepository.findById(idCliente);
        if (cliente.isEmpty()) {
            throw new SorteoNoExistenteException("El cliente no existe.");
        }
        Optional<Sorteo> sorteo = sorteoRepository.findById(idSorteo);
        if (sorteo.isEmpty()) {
            throw new SorteoNoExistenteException("El sorteo no existe");
        }
        Optional<Billete> billete = billeteRepository.findById(idBillete);
        if (billete.isEmpty()) {
            throw new BilleteNoExistenteException("El billete no existe en el sorteo "+sorteo.get().getNombreSorteo());
        }
        billete.get().setEstado(true);
        billete.get().setDuenio(cliente.get());
        billeteRepository.save(billete.get());
        return billeteMapper.convertirBilleteABilleteDTO(billete.get());
    }
}
