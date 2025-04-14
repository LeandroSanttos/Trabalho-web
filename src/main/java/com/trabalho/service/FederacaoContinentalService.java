package com.trabalho.service;

import java.util.List;

import com.trabalho.domain.dto.FederacaoContinentalDTO;

public interface FederacaoContinentalService {
    void save(FederacaoContinentalDTO federacaoContinental);

    FederacaoContinentalDTO getById(Long id);

    List<FederacaoContinentalDTO> getAll();
}
