package com.trabalho.service;

import java.util.List;

import com.trabalho.domain.dto.TreinadorDTO;

public interface TreinadorService {
    void save(TreinadorDTO treinador);

    TreinadorDTO getById(Long id);

    List<TreinadorDTO> getAll();
}
