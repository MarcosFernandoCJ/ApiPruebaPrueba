package com.tecup.apirestporject.controller;

import com.tecup.apirestporject.model.Evento;
import com.tecup.apirestporject.model.Usuario;
import com.tecup.apirestporject.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/listar")
    public List<Evento> ListarEvento() {
        return eventoService.getEventos();
    }

    //POST
    @PostMapping("/crear")
    public Evento CrearEvento(@RequestBody Evento evento) {
        return eventoService.createEvento(evento);
    }

    //PUT

    @PutMapping("/edit/{id}/")
    public Evento EditarEvento(@PathVariable Long id, @RequestBody Evento evento) {
        evento.setId(id);
        return eventoService.updateEvento(evento);
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public void BorrarEvento(@PathVariable Long id) {
        eventoService.deleteEvento(id);
    }
}
