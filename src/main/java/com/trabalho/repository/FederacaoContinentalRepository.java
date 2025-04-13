package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.domain.entity.FederacaoContinentalEntity;

@Repository
public interface FederacaoContinentalRepository extends JpaRepository<FederacaoContinentalEntity, Long> {
    
}