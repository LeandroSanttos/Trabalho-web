package com.trabalho.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.domain.entity.FederacaoNacionalEntity;

@Repository
public interface FederacaoNacionalRepository extends JpaRepository<FederacaoNacionalEntity, Long> {
    Optional<FederacaoNacionalEntity> findByFederacaoContinentalId(Long federacaoContinentalId);
}
