package com.trabalho.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_TREINADOR")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreinadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column private String nome;

    @Column private String nacionalidade;

    @Column private String email;

    public TreinadorEntity(Long id) {
        this.id = id;
    }
}
