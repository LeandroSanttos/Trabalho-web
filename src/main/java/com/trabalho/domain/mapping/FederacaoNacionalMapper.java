package com.trabalho.domain.mapping;

import org.mapstruct.Mapper;

import com.trabalho.domain.dto.FederacaoNacionalDTO;
import com.trabalho.domain.entity.FederacaoNacionalEntity;

@Mapper(
    componentModel = "spring",
    uses = {ClubeMapper.class})
public abstract class FederacaoNacionalMapper {
    public abstract FederacaoNacionalEntity toEntity(FederacaoNacionalDTO dto);

    public abstract FederacaoNacionalDTO toDto(FederacaoNacionalEntity entity);
}
