package com.trabalho.domain.entity;

import java.util.List;

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

    @Column(unique = true) 
    private String nome;

    @Column(unique = true) 
    private String paisSede;

    @Column private String email;
    
    @ManyToOne
    @JoinColumn(name = "federacao_continental_id")
    private FederacaoContinentalEntity federacaoContinental;

    @OneToMany(mappedBy = "federacaoNacional")
    private List<ClubeEntity> clubes;

    public FederacaoNacionalEntity(Long id) {
        this.id = id;
    }
}
