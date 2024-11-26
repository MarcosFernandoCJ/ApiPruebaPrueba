package com.tecup.apirestporject.repository;

import com.tecup.apirestporject.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    Optional<Usuario> findByName(String name);
}
