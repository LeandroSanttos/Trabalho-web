package com.trabalho.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalho.domain.dto.ClubeDTO;
import com.trabalho.domain.mapping.ClubeMapper;
import com.trabalho.repository.ClubeRepository;
import com.trabalho.service.ClubeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClubeServiceImpl implements ClubeService {
    private final ClubeRepository repository;
    private final ClubeMapper mapper;

    @Override
    public ClubeDTO getByID(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public ClubeDTO getByFederacaoNacional(Long federacaoNacionalId) {
        return mapper.toDto(repository.findByFederacaoNacionalId(federacaoNacionalId).orElseThrow());
    }

    @Override
    public List<ClubeDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public void save(ClubeDTO clube) {
        repository.save(mapper.toEntity(clube));
    }
}
