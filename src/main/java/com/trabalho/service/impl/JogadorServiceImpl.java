package com.trabalho.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.trabalho.domain.dto.JogadorDTO;
import com.trabalho.domain.mapping.JogadorMapper;
import com.trabalho.repository.JogadorRepository;
import com.trabalho.service.JogadorService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadorServiceImpl implements JogadorService {
    private final JogadorRepository repository;
    private final JogadorMapper mapper;

    @Override
    public JogadorDTO getById(Long jogadorId) {
        return mapper.toDto(repository.findById(jogadorId).orElseThrow());
    }

    @Override
    public List<JogadorDTO> getByClube(Long clubeId) {
        return repository.findByClubeId(clubeId).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public List<JogadorDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public void save(JogadorDTO jogador) {
        repository.save(mapper.toEntity(jogador));
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
