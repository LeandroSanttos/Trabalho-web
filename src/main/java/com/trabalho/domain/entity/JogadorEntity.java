package com.trabalho.domain.entity;

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

    @Column private String nome;

    @Column private String nacionalidade;

    @Column private String email;

    @Column private String posicao;

    @OneToOne
    @JoinColumn(name = "clube_id")
    private ClubeEntity clube;

    public JogadorEntity(Long id) {
        this.id = id;
    }
}
