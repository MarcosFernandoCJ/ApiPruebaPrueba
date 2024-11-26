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
@Table(name = "eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String descripcion;
    private String lugar;
    private Date fecha_inicio;
    private Date fecha_final;
    private Date fecha_max_inscripcion;
    private String imagen;

    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private Usuario usuario;

}
