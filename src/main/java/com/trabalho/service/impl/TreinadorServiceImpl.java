package com.trabalho.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalho.domain.dto.TreinadorDTO;
import com.trabalho.domain.mapping.TreinadorMapper;
import com.trabalho.repository.TreinadorRepository;
import com.trabalho.service.TreinadorService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TreinadorServiceImpl implements TreinadorService {
    private final TreinadorRepository repository;
    private final TreinadorMapper mapper;

    @Override
    public TreinadorDTO getById(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public List<TreinadorDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public void save(TreinadorDTO treinador) {
        repository.save(mapper.toEntity(treinador));
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
