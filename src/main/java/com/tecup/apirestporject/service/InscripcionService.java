package com.tecup.apirestporject.service;

import com.tecup.apirestporject.model.Inscripccion;
import com.tecup.apirestporject.repository.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscripcionService {

    @Autowired
    private InscripcionRepository inscripcionRepository;

    //Listar inscripciones
    public List<Inscripccion> getInscripciones() {
        return inscripcionRepository.findAll();
    }

    //Crear inscripción
    public Inscripccion createInscripcion(Inscripccion inscripcion) {
        return inscripcionRepository.save(inscripcion);
    }

    //Actualizar inscripción
    public Inscripccion updateInscripcion(Inscripccion inscripcion) {
        return inscripcionRepository.save(inscripcion);
    }

    //Borrar inscripción
    public void deleteInscripcion(Long id) {
        inscripcionRepository.deleteById(id);
    }
}
