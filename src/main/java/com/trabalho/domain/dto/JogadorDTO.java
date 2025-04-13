package com.trabalho.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JogadorDTO {
    private Long id;

    @NotNull private String nome;

    @NotNull private String nacionalidade;

    @NotNull @Email private String email;

    private ClubeDTO clube;
}
