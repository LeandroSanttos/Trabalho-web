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
public class ClubeDTO {
    private Long id;

    @NotNull private String nome;

    @NotNull private String paisOrigem;

    @NotNull @Email private String email;

    @NotNull private FederacaoNacionalDTO federacaoNacional;

    private List<JogadorDTO> jogadores;

    private TreinadorDTO treinador;
}
