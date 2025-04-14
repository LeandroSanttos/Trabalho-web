package com.trabalho.domain.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.trabalho.domain.dto.UsuarioDTO;
import com.trabalho.domain.entity.UsuarioEntity;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioMapper {
    UsuarioEntity toEntity(UsuarioDTO dto);
}
