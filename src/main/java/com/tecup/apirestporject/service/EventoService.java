package com.tecup.apirestporject.service;


import com.tecup.apirestporject.model.Evento;
import com.tecup.apirestporject.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    //Listar eventos
    public List<Evento> getEventos() {
        return eventoRepository.findAll();
    }

    //Crear un evento
    public Evento createEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    //Actualizar un evento
    public Evento updateEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    //Borrar un evento
    public void deleteEvento(Long id) {
        eventoRepository.deleteById(id);
    }
}
