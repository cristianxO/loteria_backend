package com.konex.loteria_backend.controller;

import com.konex.loteria_backend.dto.BilleteDTO;
import com.konex.loteria_backend.model.Billete;
import com.konex.loteria_backend.service.BilleteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billetes")
public class BilleteController {

    private final BilleteService billeteService;

    public BilleteController(BilleteService billeteService) {
        this.billeteService = billeteService;
    }

    @PostMapping("/{idSorteo}")
    public ResponseEntity<BilleteDTO> crearBillete(@Valid @RequestBody Billete billete, @PathVariable int idSorteo) {
        BilleteDTO billeteCreado = billeteService.crearBillete(billete,idSorteo);
        return ResponseEntity.status(HttpStatus.CREATED).body(billeteCreado);
    }
}
