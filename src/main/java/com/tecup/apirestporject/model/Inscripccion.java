package com.tecup.apirestporject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inscripciones")
public class Inscripccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date fecha_inscripcion;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
