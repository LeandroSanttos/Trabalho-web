package com.trabalho.domain.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_CLUBE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClubeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String nome;

    @Column private String paisOrigem;

    @Column private String email;

    @OneToMany(mappedBy = "clube")
    private List<JogadorEntity> jogadores;

    @OneToOne
    @JoinColumn(name = "treinador_id")
    private TreinadorEntity treinador;

    public ClubeEntity(Long id) {
        this.id = id;
    }
}
