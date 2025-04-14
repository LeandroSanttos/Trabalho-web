package com.trabalho.service;

import java.util.List;

import com.trabalho.domain.dto.TreinadorDTO;

public interface TreinadorService {
    TreinadorDTO getById(Long id);

    List<TreinadorDTO> getAll();

    void save(TreinadorDTO treinador);

    void remove(Long id);

}
