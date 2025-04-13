package com.trabalho.domain.mapping;

import org.mapstruct.Mapper;

import com.trabalho.domain.dto.TreinadorDTO;
import com.trabalho.domain.entity.TreinadorEntity;

@Mapper(componentModel = "spring")
public abstract class TreinadorMapper {
    public abstract TreinadorEntity toEntity(TreinadorDTO dto);

    public abstract TreinadorDTO toDto(TreinadorEntity entity);
}
