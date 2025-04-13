package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.domain.entity.TreinadorEntity;

@Repository
public interface TreinadorRepository extends JpaRepository<TreinadorEntity, Long> {
    
}
