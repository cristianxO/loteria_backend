package com.konex.loteria_backend.repository;

import com.konex.loteria_backend.model.Sorteo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SorteoRepository extends JpaRepository<Sorteo, Integer> {
}
