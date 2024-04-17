package com.example.payementservice.repository;

import com.example.payementservice.entity.Payement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayementRepository extends JpaRepository<Payement, Integer> {
}
