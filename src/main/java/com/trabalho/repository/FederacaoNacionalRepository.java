package com.trabalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.domain.entity.FederacaoNacionalEntity;

@Repository
public interface FederacaoNacionalRepository extends JpaRepository<FederacaoNacionalEntity, Long> {
    
    List<FederacaoNacionalEntity> findByFederacaoContinentalId(Long federacaoContinentalId);
}
