package com.trabalho.domain.mapping;

import org.mapstruct.Mapper;

import com.trabalho.domain.dto.JogadorDTO;
import com.trabalho.domain.entity.JogadorEntity;

@Mapper(componentModel = "spring")
public abstract class JogadorMapper {
    public abstract JogadorEntity toEntity(JogadorDTO dto);

    public abstract JogadorDTO toDto(JogadorEntity entity);
}
