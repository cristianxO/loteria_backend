package com.konex.loteria_backend.controller;

import com.konex.loteria_backend.dto.SorteoDTO;
import com.konex.loteria_backend.model.Sorteo;
import com.konex.loteria_backend.service.SorteoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sorteos")
public class SorteoController {

    private final SorteoService sorteoService;

    public SorteoController(SorteoService sorteoService) {
        this.sorteoService = sorteoService;
    }

    @PostMapping
    public ResponseEntity<Sorteo> crearSorteo(@Valid @RequestBody Sorteo sorteo) {
        Sorteo sorteocreado = sorteoService.crearSorteo(sorteo);
        return ResponseEntity.status(HttpStatus.CREATED).body(sorteocreado);
    }

    @GetMapping
    public ResponseEntity<List<SorteoDTO>> listarSorteos() {
        return ResponseEntity.ok(sorteoService.listarSorteos());
    }
}
