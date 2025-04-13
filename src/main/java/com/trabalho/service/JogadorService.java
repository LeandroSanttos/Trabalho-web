package com.trabalho.service;

import java.util.List;

import com.trabalho.domain.dto.JogadorDTO;

public interface JogadorService {
    void save(JogadorDTO jogador);

    JogadorDTO getById(Long jogadorId);

    List<JogadorDTO> getByClube(Long clubeId);
}
