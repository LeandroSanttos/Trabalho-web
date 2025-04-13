package com.trabalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.domain.entity.JogadorEntity;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorEntity, Long> {
    
    List<JogadorEntity> findByClubeId(Long clubeId);
}
