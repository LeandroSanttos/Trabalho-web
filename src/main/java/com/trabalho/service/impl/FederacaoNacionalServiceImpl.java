package com.trabalho.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalho.domain.dto.FederacaoNacionalDTO;
import com.trabalho.domain.mapping.FederacaoNacionalMapper;
import com.trabalho.repository.FederacaoNacionalRepository;
import com.trabalho.service.FederacaoNacionalService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FederacaoNacionalServiceImpl implements FederacaoNacionalService {
    private final FederacaoNacionalRepository repository;
    private final FederacaoNacionalMapper mapper;

    @Override
    public FederacaoNacionalDTO getByID(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public FederacaoNacionalDTO getByFederacaoContinental(Long federacaoContinentalId) {
        return mapper.toDto(repository.findByFederacaoContinentalId(federacaoContinentalId).orElseThrow());
    }

    @Override
    public List<FederacaoNacionalDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public void save(FederacaoNacionalDTO federacaoNacional) {
        repository.save(mapper.toEntity(federacaoNacional));
    }
}
