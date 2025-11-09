package com.konex.loteria_backend.repository;

import com.konex.loteria_backend.model.Billete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BilleteRepository extends JpaRepository<Billete, Integer> {
}
