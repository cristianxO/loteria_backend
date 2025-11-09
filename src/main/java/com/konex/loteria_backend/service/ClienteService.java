package com.konex.loteria_backend.service;

import com.konex.loteria_backend.dto.BilleteDTO;
import com.konex.loteria_backend.exception.ClienteExistenteException;
import com.konex.loteria_backend.exception.ClienteNoExistenteException;
import com.konex.loteria_backend.mapper.BilleteMapper;
import com.konex.loteria_backend.model.Billete;
import com.konex.loteria_backend.model.Cliente;
import com.konex.loteria_backend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    private final BilleteMapper billeteMapper;

    public ClienteService(ClienteRepository clienteRepository, BilleteMapper billeteMapper) {
        this.clienteRepository = clienteRepository;
        this.billeteMapper = billeteMapper;
    }

    public Cliente crearCliente(Cliente cliente) {
        if (clienteRepository.existsByCorreo(cliente.getCorreo())) {
            throw new ClienteExistenteException("El cliente con el correo "+cliente.getCorreo()+" ya se encuentra registrado.");
        }
        clienteRepository.save(cliente);
        return cliente;
    }

    public List<BilleteDTO> listarBilletesComprados(int id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isEmpty()) {
            throw new ClienteNoExistenteException("El cliente no existe.");
        }
        return billeteMapper.convertirBilletesABilletesDTO(cliente.get().getBilletes());
    }
}
