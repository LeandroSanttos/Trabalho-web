package com.trabalho.domain.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_FEDERACAO_CONTINENTAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FederacaoContinentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true) 
    private String nome;

    @Column(unique = true) 
    private String continente;

    @Column private String email;
    
    @OneToMany(mappedBy = "federacao_continental")
    private List<FederacaoNacionalEntity> federacoesNacionais;

    public FederacaoContinentalEntity(Long id) {
        this.id = id;
    }
}
