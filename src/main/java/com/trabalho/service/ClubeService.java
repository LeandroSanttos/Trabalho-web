package com.trabalho.service;

import java.util.List;

import com.trabalho.domain.dto.ClubeDTO;

public interface ClubeService {
    ClubeDTO getByID(Long id);

    ClubeDTO getByFederacaoNacional(Long federacaoNacionalId);

    List<ClubeDTO> getAll();

    void save(ClubeDTO clube);
}
