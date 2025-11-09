package com.konex.loteria_backend.service;

import com.konex.loteria_backend.exception.BilleteNoExistenteException;
import com.konex.loteria_backend.exception.SorteoNoExistenteException;
import com.konex.loteria_backend.model.Billete;
import com.konex.loteria_backend.model.Cliente;
import com.konex.loteria_backend.model.Sorteo;
import com.konex.loteria_backend.repository.BilleteRepository;
import com.konex.loteria_backend.repository.ClienteRepository;
import com.konex.loteria_backend.repository.SorteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BilleteService {

    private final BilleteRepository billeteRepository;

    private final SorteoRepository sorteoRepository;

    private final ClienteRepository clienteRepository;

    public BilleteService(BilleteRepository billeteRepository, SorteoRepository sorteoRepository, ClienteRepository clienteRepository) {
        this.billeteRepository = billeteRepository;
        this.sorteoRepository = sorteoRepository;
        this.clienteRepository = clienteRepository;
    }

    public Billete crearBillete(Billete billete, int idSorteo) {
        Optional<Sorteo> sorteo = sorteoRepository.findById(idSorteo);
        if (sorteo.isEmpty()) {
            throw new SorteoNoExistenteException("El sorteo al que desea asociar no existe.");
        }
        billete.setEstado(false);
        billete.setSorteo(sorteo.get());
        billeteRepository.save(billete);
        return billete;
    }

    public void venderBillete(int idCliente, int idSorteo, int idBillete) {
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
    }
}
