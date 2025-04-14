package com.trabalho.service;

import java.util.List;

import com.trabalho.domain.dto.FederacaoNacionalDTO;

public interface FederacaoNacionalService {
    FederacaoNacionalDTO getByID(Long id);

    FederacaoNacionalDTO getByFederacaoContinental(Long id);

    List<FederacaoNacionalDTO> getAll();

    void save(FederacaoNacionalDTO federacaoNacional);
}
