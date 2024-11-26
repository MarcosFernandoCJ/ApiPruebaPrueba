package com.tecup.apirestporject.controller;


import com.tecup.apirestporject.model.Inscripccion;
import com.tecup.apirestporject.service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inscripcion")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;

    @GetMapping("/listar")
    public List<Inscripccion> ListarInscripciones() {
        return inscripcionService.getInscripciones();
    }

    @PostMapping("/crear")
    public Inscripccion CrearInscripcion(@RequestBody Inscripccion inscripcion) {
        return inscripcionService.createInscripcion(inscripcion);
    }

    @PutMapping("/editar/{id}/")
    public Inscripccion EditarInscripcion(@PathVariable Long id, @RequestBody Inscripccion inscripcion) {
        inscripcion.setId(id);
        return inscripcionService.updateInscripcion(inscripcion);
    }

    @DeleteMapping("/borrar/{id}/")
    public void BorrarInscripcion(@PathVariable Long id) {
        inscripcionService.deleteInscripcion(id);
    }
}
