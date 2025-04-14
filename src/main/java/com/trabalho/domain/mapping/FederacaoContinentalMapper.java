package com.trabalho.domain.mapping;

import org.mapstruct.Mapper;

import com.trabalho.domain.dto.FederacaoContinentalDTO;
import com.trabalho.domain.entity.FederacaoContinentalEntity;

@Mapper(
    componentModel = "spring",
    uses = {FederacaoNacionalMapper.class})
public abstract class FederacaoContinentalMapper {
    public abstract FederacaoContinentalEntity toEntity(FederacaoContinentalDTO dto);

    public abstract FederacaoContinentalDTO toDto(FederacaoContinentalEntity entity);
}
