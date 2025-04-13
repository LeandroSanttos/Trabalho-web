package com.trabalho.domain.mapping;

import org.mapstruct.Mapper;

import com.trabalho.domain.dto.ClubeDTO;
import com.trabalho.domain.entity.ClubeEntity;

@Mapper(
    componentModel = "spring",
    uses = {JogadorMapper.class, TreinadorMapper.class})
public abstract class ClubeMapper {
    public abstract ClubeEntity toEntity(ClubeDTO dto);

    public abstract ClubeDTO toDto(ClubeEntity entity);
}
