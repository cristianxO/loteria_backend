package com.konex.loteria_backend.controller;

import com.konex.loteria_backend.dto.BilleteDTO;
import com.konex.loteria_backend.dto.ClienteDTO;
import com.konex.loteria_backend.model.Cliente;
import com.konex.loteria_backend.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> crearCliente(@Valid @RequestBody Cliente cliente) {
        ClienteDTO clienteCreado = clienteService.crearCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteCreado);
    }

    @GetMapping("/{idCliente}/billetes")
    public ResponseEntity<List<BilleteDTO>> listarBilletesComprados(@PathVariable int idCliente) {
        return ResponseEntity.ok(clienteService.listarBilletesComprados(idCliente));
    }
}