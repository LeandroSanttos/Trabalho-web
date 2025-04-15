package com.trabalho.domain.entity;

import com.trabalho.domain.entity.enums.Posicao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_JOGADOR")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JogadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;

    @Column
    private String nacionalidade;

    @Column
    private String email;

    @Enumerated(EnumType.STRING)
    @Column
    private Posicao posicao;

    @ManyToOne
    @JoinColumn(name = "clube_id")
    private ClubeEntity clube;

    public JogadorEntity(Long id) {
        this.id = id;
    }
}
