package com.trabalho.service;

import java.util.List;

import com.trabalho.domain.dto.JogadorDTO;

public interface JogadorService {
    JogadorDTO getById(Long jogadorId);

    List<JogadorDTO> getByClube(Long clubeId);

    List<JogadorDTO> getAll();

    void save(JogadorDTO jogador);

    void remove(Long id);
}
