package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.domain.entity.UsuarioEntity;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    boolean existsUsuarioEntityByEmail(String email);

    Optional<UsuarioEntity> findByEmail(String email);
}
