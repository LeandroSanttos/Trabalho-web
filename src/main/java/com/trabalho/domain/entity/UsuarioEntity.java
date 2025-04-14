package com.trabalho.domain.entity;

import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "TB_USUARIO")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "TB_USUARIO_PAPEL",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "papel_id")
    )
    private Set<PapelEntity> papeis;

}
