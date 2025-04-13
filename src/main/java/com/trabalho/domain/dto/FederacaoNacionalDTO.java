package com.trabalho.domain.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FederacaoNacionalDTO {
    private Long id;

    @NotNull private String nome;

    @NotNull private String paisSede;

    @NotNull @Email private String email;

    private List<ClubeDTO> clubes;
}
