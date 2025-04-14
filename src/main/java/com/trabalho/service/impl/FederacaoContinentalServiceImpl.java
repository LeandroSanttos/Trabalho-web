package com.trabalho.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalho.domain.dto.FederacaoContinentalDTO;
import com.trabalho.domain.entity.FederacaoContinentalEntity;
import com.trabalho.domain.mapping.FederacaoContinentalMapper;
import com.trabalho.repository.FederacaoContinentalRepository;
import com.trabalho.service.FederacaoContinentalService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FederacaoContinentalServiceImpl implements FederacaoContinentalService {
    private final FederacaoContinentalRepository repository;
    private final FederacaoContinentalMapper mapper;

    @Override
    public FederacaoContinentalDTO getById(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public List<FederacaoContinentalDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public void save(FederacaoContinentalDTO federacaoContinental) {
        FederacaoContinentalEntity entity = mapper.toEntity(federacaoContinental);
        repository.save(entity);
    }
}
