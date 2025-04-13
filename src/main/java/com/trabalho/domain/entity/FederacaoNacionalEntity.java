package com.trabalho.domain.entity;

import java.util.List;
//import java.util.stream.Collectors;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_FEDERACAO_NACIONAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FederacaoNacionalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column private String nome;

    @Column(unique = true) 
    private String paisSede;

    @Column private String email;

    @OneToMany(mappedBy = "federacao_nacional")
    private List<ClubeEntity> clubes;

    /*@OneToMany(mappedBy = "federacaoNacional", cascade = CascadeType.ALL)
    private List<JogadorEntity> jogadores;

    public List<JogadorEntity> escalarSelecao() {
        return this.jogadores.stream()
            .filter(j -> this.paisSede.equalsIgnoreCase(j.getNacionalidade()))
            .collect(Collectors.toList());
    }*/

    public FederacaoNacionalEntity(Long id) {
        this.id = id;
    }
}
