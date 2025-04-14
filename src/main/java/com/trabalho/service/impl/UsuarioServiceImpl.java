package com.trabalho.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.trabalho.domain.dto.UsuarioDTO;
import com.trabalho.domain.mapping.UsuarioMapper;
import com.trabalho.exception.RecursoDuplicadoException;
import com.trabalho.repository.PapelRepository;
import com.trabalho.repository.UsuarioRepository;
import com.trabalho.service.UsuarioService;

import java.util.LinkedHashSet;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioMapper mapper;
    private final UsuarioRepository repository;
    private final PapelRepository papelRepository;

    @Override
    public void save(UsuarioDTO usuario) {
        var existeEmail = repository.existsUsuarioEntityByEmail(usuario.getEmail());
        if (existeEmail) {
            throw new RecursoDuplicadoException("Email já cadastrado.");
        }

        var entity = mapper.toEntity(usuario);
        entity.setPapeis(new LinkedHashSet<>(papelRepository.findAll()));

        repository.save(entity);
    }
}
