package com.tecup.apirestporject.repository;

import com.tecup.apirestporject.model.Inscripccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InscripcionRepository extends JpaRepository<Inscripccion, Long> {


}
